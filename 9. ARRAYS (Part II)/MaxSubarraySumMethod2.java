import java.util.*;

public class MaxSubarraySumMethod2 {
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
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        //Calculating prefix array :- 
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++){
            int start = i; 
            for (int j = i; j < numbers.length; j++){
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];      //ternary operator
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            } 
        }
        System.out.println("Max sum of the sub array = "+maxSum);
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