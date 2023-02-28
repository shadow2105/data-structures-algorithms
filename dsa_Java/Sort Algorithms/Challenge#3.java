class Sort {
    public static void main(String[] args) {
        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        System.out.print("Unsorted Array:   ");
        for(String e: stringArray) { System.out.print(e + "   "); }
        System.out.println();

        radixSort(stringArray, 26, 5);
        
        System.out.print("Sorted Array:    ");
        for(String e: stringArray) { System.out.print(e + "   "); }
        System.out.println();
    }  

    public static void radixSort(String[] array, int radix, int width) {
        for(int i=0; i<width; i++) { radixSingleSort(array, i, radix); }
    }

    public static void radixSingleSort(String[] array, int position, int radix) {
        int numItems = array.length;
        int[] countArray = new int[radix];

        // conventional counting array 
        for(String value: array) { countArray[getLetterPosition(position, value)]++; }

        // adjusted counting array
        for(int j=1; j<radix; j++) { countArray[j] += countArray[j-1]; }

        String[] temp = new String[numItems];
        for(int tempIndex=numItems-1; tempIndex>=0; tempIndex--) {
            temp[--countArray[getLetterPosition(position, array[tempIndex])]] = array[tempIndex];
        }

        for(int tempIndex=0; tempIndex<numItems; tempIndex++) { array[tempIndex] = temp[tempIndex]; }
    }

    public static int getLetterPosition(int position, String value) {
        return value.charAt(value.length()-1-position) - 'a';
    }


}
