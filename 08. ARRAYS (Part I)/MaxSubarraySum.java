import java.util.*;

public class MaxSubarraySum {
    public static void createArray(int numbers[]) {
        System.out.print("Array: [");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void makeSubarrays(int numbers[]) {
        int ts = 0;     //total number of subarrays
        int subarraysum = 0;
        for (int i = 0; i < numbers.length; i++){
            int start = i; 
            for (int j = i; j < numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++){
                    System.out.print((numbers[k])+" ");
                    subarraysum += k;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: "+ts);
    }
    
    public static void main (String args[]) {

    }
}
