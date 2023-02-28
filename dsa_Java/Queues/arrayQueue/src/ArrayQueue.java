import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

/*  circular / wrapped queue        linear / unwrapped queue
    0 x                             0 x --- front
    1 x                             1 x
    2   --- back                    2 x
    3 x --- front                   3 x     
    4 x                             4   --- back
*/

    public int size() { 
        if(front <= back) { return back - front; }          // linear queue
        else { return (queue.length + back) - front; }      // circular queue
     }

    public void add(Employee employee) {
        if(size()==queue.length-1) {
            int numItems = size();

            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length-front);
            // redundant for linear queue
            System.arraycopy(queue, 0, newArray, queue.length-front, back);     
            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if(back<queue.length-1) { back++; }
        else { back = 0 ;}
    }

    public Employee remove() {
        if(size()==0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size()==0) {
            front = 0;
            back = 0;
        }
        else if(front==queue.length) { front = 0; }     // for circular queue
            
        return employee;
    }

    public Employee peek() {
        if(size()==0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue() {
        if(front <= back) {                              // linear queue
            for(int i=front; i<back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {                                          // circular queue
            for(int i=front; i<queue.length; i++) {
                System.out.println(queue[i]);
            }

            for(int i=0; i<back; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}