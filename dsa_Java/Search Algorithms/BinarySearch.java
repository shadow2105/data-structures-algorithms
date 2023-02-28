class Search {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(binarySearch(intArray, -15));
        System.out.println(binarySearch(intArray, 35));
        System.out.println(binarySearch(intArray, 8888));
        System.out.println(binarySearch(intArray, 1));
    }

    // Iterative method
    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length;

        while(start<end) {
            int midpoint = (start + end) / 2;

            if(array[midpoint]==value) { return midpoint; }

            else if(array[midpoint]<value) { start = midpoint + 1; }    // Search right half

            else { end = midpoint; };                                   // Search left half
        }
        
        return -1;
    }

    // Recursive method
/*  public static int binarySearch(int[] array, int value) {
        return binarySearch(array, 0, array.length, value);
    }

    public static int binarySearch(int[] array, int start, int end, int value) {
        if(start>=end) { return -1; }

        int midpoint = (start + end) / 2;

        if(array[midpoint]==value) { return midpoint; }

        else if(array[midpoint]<value) { return binarySearch(array, midpoint+1, end, value); }      // Search right half

        else { return binarySearch(array, start, midpoint, value); }                                // Search left half
    }
*/
}
