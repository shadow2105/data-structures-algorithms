public class App {
    public static void main(String[] args) throws Exception {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }
 
    public static boolean checkForPalindrome(String string) {
        CharStack stack = new CharStack();
        CharQueue queue = new CharQueue();

        String myStr = string.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();

        for(int i=0; i<myStr.length(); i++) {
            char strChar = myStr.charAt(i);
            queue.add(strChar);
            stack.push(strChar);
        }

        while(!stack.isEmpty()) {
            if(!(stack.pop()).equals(queue.remove())) {
                return false;
            }
        }

        return true;
        
    /*  StringBuilder originalString = new StringBuilder();
        while(!queue.isEmpty()) { 
            char strChar = queue.remove();
            originalString.append(strChar);
            stack.push(strChar); 
        }

        StringBuilder reversedString = new StringBuilder();
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        //System.out.println(originalString.toString() + " " + reversedString.toString());
        return (reversedString.toString()).equals(originalString.toString());
    */    
    } 
}
 