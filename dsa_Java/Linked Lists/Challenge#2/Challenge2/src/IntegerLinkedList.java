public class IntegerLinkedList {
    
    private IntegerNode head;
    private int size;

    public int getSize() { return size; }

    public boolean isEmpty() { return head == null; }

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) { return null; }

        IntegerNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public void insertSorted(Integer value) {
        IntegerNode node = new IntegerNode(value);
        
        IntegerNode previous = null;
        IntegerNode current = head;
        while(current != null && !(current.getValue() >= value)) {
            previous = current;
            current = current.getNext();
        }

        if(current==head) {
            head = node;
        }
        else {
            previous.setNext(node);
        }
        
        node.setNext(current);
        size++;
    }

    public void printList() {
        System.out.print("HEAD -> ");

        IntegerNode current = head;
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
