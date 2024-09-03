import java.util.*;

public class ArrayPairing {
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

    public static void makePairs(int numbers[]) {
        int tp = 0;      //total number of pairs
        System.out.println("Pairs are: ");
        for (int i = 0; i < numbers.length; i++){
            int currentnum = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+currentnum+", "+numbers[j]+")"+" ");
            }
            tp++;
            System.out.println();
        }
        System.out.println("Total number of arrays: "+tp);
    }
    
    public static void main (String args[]) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the numbers for array: ");
            numbers[i] = sc.nextInt();            
        }
        createArray(numbers);
        makePairs(numbers);
    }
}