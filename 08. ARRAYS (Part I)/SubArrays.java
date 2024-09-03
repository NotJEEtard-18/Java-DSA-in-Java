import java.util.*;

public class SubArrays {
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
        for (int i = 0; i < numbers.length; i++){
            int start = i; 
            for (int j = i; j < numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++){
                    System.out.print((numbers[k])+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: "+ts);
    }

    public static void main(String args[]) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        createArray(numbers);
        makeSubarrays(numbers);
    }
}