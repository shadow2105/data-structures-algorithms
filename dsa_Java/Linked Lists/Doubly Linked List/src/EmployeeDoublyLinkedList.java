public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize() { return size; }

    public boolean isEmpty() { 
        return head == null;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(head==null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        
        if(tail==null) {
            head=node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public void printList() {
        System.out.print("Head -> ");

        EmployeeNode current = head;
        while(current != null) {
            System.out.print(current + " <-> ");
            current = current.getNext();
        }
        System.out.println("null, Tail" + "\n");
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) { return null; }

        EmployeeNode removedNode = head;
        if(head.getNext()==null) {
            tail=null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if(isEmpty()) { return null; }

        EmployeeNode removedNode = tail;
        if(tail.getPrevious()==null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        removedNode.setPrevious(null);
        size--;
        return removedNode;
    }

}
