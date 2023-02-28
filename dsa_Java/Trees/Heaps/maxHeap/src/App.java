public class App {
    public static void main(String[] args) throws Exception {
    
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);
        heap.printHeap();

    /*  heap.delete(1);
        heap.delete(5);
        heap.delete(0);
        heap.printHeap();
    */
    
        System.out.println(heap.peek());
        heap.delete(0);
        heap.printHeap();
        System.out.println(heap.peek());
    }
}
