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

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        boolean employeeAdded = false;

        EmployeeNode current = head;
        while(current != null) {
            if(current.getEmployee().equals(existingEmployee)) {
                EmployeeNode node = new EmployeeNode(newEmployee);

                node.setNext(current);
                node.setPrevious(current.getPrevious());
                current.setPrevious(node);
                
                if(head == current) {
                    head = node;
                }
                else {
                    node.getPrevious().setNext(node);
                }

                employeeAdded = true;
                size++;
                break;
            }
            current = current.getNext();
        }

        return employeeAdded;
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
