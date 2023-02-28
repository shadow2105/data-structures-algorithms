import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public boolean isEmpty() { return stack.isEmpty(); }

    public int size() { return stack.size(); }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public void printStack() {
        ListIterator<Employee> iter = stack.listIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
