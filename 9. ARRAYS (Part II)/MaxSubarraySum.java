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

    public static void MaxSubarraysSum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            int start = i; 
            for (int j = i; j < numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++){
                    currentSum += numbers[k];
                }
                System.out.print(currentSum + "   \n");
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            } 
        }
        System.out.println("Max sum = "+maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        createArray(numbers);
        MaxSubarraysSum(numbers);
    }
}