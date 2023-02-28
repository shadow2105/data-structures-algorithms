class Sort {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        countingSort(intArray, 1, 10);
        
        System.out.print("Sorted Array:    ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }  

    public static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max-min)+1];

        for(int i=0; i<array.length; i++) {
            countArray[array[i]-min]++;
        }

        int j = 0;
        for(int i=min; i<=max; i++) {
            while(countArray[i-min]>0) {
                array[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}
