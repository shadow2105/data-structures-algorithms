import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
    
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for(int i=0; i<hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    private int hashKey(String key) { return key.length() % hashtable.length; }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iter = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(iter.hasNext()) {
            storedEmployee = iter.next();
            if((storedEmployee.getKey()).equals(key)) {
                return storedEmployee.getEmployee();
            }
        }

        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iter = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while(iter.hasNext()) {
            storedEmployee = iter.next();
            index++;
            if((storedEmployee.getKey()).equals(key)) {
                break;
            }
        }

        if(!(storedEmployee.getKey()).equals(key) || storedEmployee == null ) {
            return null;
        }
        else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.getEmployee(); 
        }
    }

    public void printHashtable() {
        for(int i=0; i<hashtable.length; i++) {
            if(hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": " + "empty");
            }
            else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iter = hashtable[i].listIterator();
                while(iter.hasNext()) {
                    System.out.print(iter.next().getEmployee() + " -> ");
                }
                System.out.println("null");
            }
        }
    }
}
