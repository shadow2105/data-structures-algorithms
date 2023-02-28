import java.util.LinkedList;
import java.util.ListIterator;

public class CharStack {
    
    private LinkedList<Character> stack;

    public CharStack() {
        stack = new LinkedList<Character>();
    }

    public boolean isEmpty() { return stack.isEmpty(); }

    public int size() { return stack.size(); }

    public void push(Character strChar) {
        stack.push(strChar);
    }

    public Character pop() {
        return stack.pop();
    }

    public Character peek() {
        return stack.peek();
    }

    public void printStack() {
        ListIterator<Character> iter = stack.listIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
