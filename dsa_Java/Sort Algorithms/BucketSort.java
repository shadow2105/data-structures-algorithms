import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sort {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        System.out.print("Unsorted Array:   ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();

        bucketSort(intArray);
        
        System.out.print("Sorted Array:     ");
        for(int e: intArray) { System.out.print(e + "   "); }
        System.out.println();
    }  

    public static void bucketSort(int[] array) {
        List<Integer>[] buckets = new List[10];
        for(int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<array.length; i++) {                 // Scattering phase
            buckets[hash(array[i])].add(array[i]);
        }

        for(List bucket: buckets) {                         // Sorting phase
            Collections.sort(bucket);
        }

        int j = 0;                                          // Merging phase
        for(int i=0; i<buckets.length; i++) {       
            for(int value: buckets[i]) {
                array[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return (value / (int) 10) % 10;
    }
}
