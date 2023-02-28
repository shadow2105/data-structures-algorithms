import java.util.Iterator;
import java.util.LinkedList;

public class CharQueue {
    
    private LinkedList<Character> queue;
    
    public CharQueue() {
        queue = new LinkedList<Character>();
    }

    public boolean isEmpty() { return queue.isEmpty(); }

    public int size() { return queue.size(); }

    public void add(Character strChar) {
        queue.addLast(strChar);
    }

    public Character remove() {
        return queue.removeFirst();
    }

    public Character peek() {
        return queue.peek();
    }

    public void printQueue() {
        Iterator<Character> iter = queue.listIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
