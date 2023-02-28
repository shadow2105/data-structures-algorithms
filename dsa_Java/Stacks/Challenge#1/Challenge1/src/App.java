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

        String myStr = string.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        char[] myArr = myStr.toCharArray();

        for(char c: myArr) {
            stack.push(c);
        }

        String revStr = "";
        while(!stack.isEmpty()) {
            revStr += stack.pop();
        }

        // System.out.println(myStr + " " + revStr);
        return myStr.equals(revStr);
    }
}
 