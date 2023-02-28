public class SimpleHashtable {
    
    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) { return key.length() % hashtable.length; }

    private boolean occupied(int index) { return hashtable[index] != null; }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)) {                                           //
            int stopIndex = hashedKey;
            if(hashedKey==hashtable.length-1) { hashedKey = 0; }
            else { hashedKey++; }
                                                                            //  Linear Probing
            while(occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;             
            }
        }                                                                   //

        if(occupied(hashedKey)) {
            System.out.println("Sorry, cannot add '" + hashtable[hashedKey].getEmployee() + "', there is already an employee at position" + hashedKey);
        }
        else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && (hashtable[hashedKey].getKey()).equals(key)) {
            return hashedKey;
        }
                                                                            //   
        int stopIndex = hashedKey;                                           
        if(hashedKey==hashtable.length-1) { hashedKey = 0; }
        else { hashedKey++; }                                               // Linear Probing

        while(hashtable[hashedKey] != null && hashedKey != stopIndex && !(hashtable[hashedKey].getKey()).equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }                                                                   //

        if(hashtable[hashedKey] != null && (hashtable[hashedKey].getKey()).equals(key)) { 
            return hashedKey;
        }
        else {
            return -1;
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if(hashedKey==-1) { return null; }

        return hashtable[hashedKey].getEmployee();
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if(hashedKey==-1) { return null; }

        Employee employee = hashtable[hashedKey].getEmployee();
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];

        for(int i=0; i<oldHashtable.length; i++) {                              //
            if(oldHashtable[i] != null) {
                put(oldHashtable[i].getKey(), oldHashtable[i].getEmployee());   // Rehashing
            }
        }                                                                       //

        return employee;
    }

    public void printHashtable() {
        for(int i=0; i<hashtable.length; i++) {
            if(hashtable[i]==null) {
                System.out.println("Position " + i + ": " + "empty");
            }
            else {
                System.out.println("Position " + i + ": " + hashtable[i].getEmployee());
            }
        }
    }
}
