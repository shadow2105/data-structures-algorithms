class Sort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        mergeSortDesc(intArray, 0, intArray.length);
        
        System.out.print("Sorted Array:    ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }  

    public static void mergeSortDesc(int[] array, int start, int end) {
        if(end-start < 2) { return; }

        int mid = (start + end) / 2;

        mergeSortDesc(array, start, mid);   // left array
        mergeSortDesc(array, mid, end);     // right array

        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        if(array[mid-1] >= array[mid]) { return; }
        
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];
        while(i<mid && j<end) {
            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}