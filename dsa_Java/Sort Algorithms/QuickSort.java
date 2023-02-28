class Sort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        quickSort(intArray, 0, intArray.length);
        
        System.out.print("Sorted Array:    ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }  

    public static void quickSort(int[] array, int start, int end) {
        if(end-start < 2) { return; }

        int pivotIndex = partition(array, start, end);

        quickSort(array, start, pivotIndex);    // left partition array
        quickSort(array, pivotIndex+1, end);    // right parition array
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while(i<j) {
            while(i<j && array[--j] >= pivot);
            if(i<j) { array[i] = array[j]; }

            while(i<j && array[++i] <= pivot);
            if(i<j) { array[j] = array[i]; }
        }
        array[j] = pivot;
        return j;
    }
}