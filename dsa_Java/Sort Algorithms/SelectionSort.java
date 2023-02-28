class Sort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i=1; i<=lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) { largest = i; }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.print("Sorted Array:    ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }
 
    public static void swap(int[] array, int i, int j) {
        if(i==j) { return; }

        int temp = array[i];   
        array[i] = array[j];
        array[j] = temp;     
    }
}