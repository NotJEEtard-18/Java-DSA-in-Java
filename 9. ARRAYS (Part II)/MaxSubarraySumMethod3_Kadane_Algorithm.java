import java.util.*;

public class MaxSubarraySumMethod3_Kadane_Algorithm {
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

    public static void KadanesAlgorithm(int numbers[]) {
        int ms = Integer.MIN_VALUE;     //max sum
        int cs = 0;     //current sum

        for (int i = 0 ; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs <0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Subarray Sum is: " +ms);
    }

    public static void main(String args[]) {
        int numbers[] = new int[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        createArray(numbers);
        KadanesAlgorithm(numbers);
    }
}