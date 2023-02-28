public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;
    
    public int getSize() { return size; }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node =  new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void printList() {
        System.out.print("Head -> ");

        EmployeeNode current = head;
        while(current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null" + "\n");
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) { return null; }

        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }
}
