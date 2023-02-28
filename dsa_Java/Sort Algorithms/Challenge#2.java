class Sort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        insertionSort(intArray, intArray.length);
        
        System.out.print("Sorted Array:    ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }  

    public static void insertionSort(int[] array, int numItems) {
        if(numItems < 2) { return; }

        insertionSort(array, numItems-1);
        insertion(array, numItems);
    }

    public static void insertion(int[] array, int numItems) {
        int newElement = array[numItems-1];

        int i = numItems-1;
        while(i>0 && array[i-1]>newElement) {
            array[i] = array[i-1];
            i--;
        }
        array[i] = newElement;
    }
}
