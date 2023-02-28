class Sort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        for(int firstUnsortedIndex=1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i = firstUnsortedIndex;
            while(i>0 && intArray[i-1]>newElement) {
                intArray[i] = intArray[i-1];
                i--;
            }
            intArray[i] = newElement;
        }
        
        System.out.print("Sorted Array:    ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }  
}
