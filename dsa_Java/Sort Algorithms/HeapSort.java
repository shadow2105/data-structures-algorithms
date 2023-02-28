// Compile using command - 
// javac -cp '.:/home/ashwin_rpt/Desktop/Data-Structures_Algorithms/dsa_Java/Trees/Heaps/maxHeap/maxHeap.jar' HeapSort.java 

// Run using command - 
// java -cp '.:/home/ashwin_rpt/Desktop/Data-Structures_Algorithms/dsa_Java/Trees/Heaps/maxHeap/maxHeap.jar' Sort

class Sort {
    public static void main(String[] args) {
    
        Heap heap = new Heap(10);
        
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        System.out.print("Unsorted :  ");
        heap.printHeap();
        
        heapSort(heap);

        System.out.print("Sorted :    ");
        heap.printHeap();
    }

    public static void heapSort(Heap heap) {
        int[] heapArray = heap.getHeap();

        int lastHeapIndex = heap.getSize()-1;
        for(int i=0; i<lastHeapIndex; i++) {
            int temp = heapArray[0];
            heapArray[0] = heapArray[lastHeapIndex-i];
            heapArray[lastHeapIndex-i] = temp;

            heap.fixHeapBelow(0, lastHeapIndex-i-1);

            heap.setHeap(heapArray);
        }
    }
}
