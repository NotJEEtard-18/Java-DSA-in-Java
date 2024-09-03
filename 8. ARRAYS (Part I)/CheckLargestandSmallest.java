import java.util.*;

public class CheckLargestandSmallest {
    public static void createArray(int numbers[]) {
    System.out.print("Array created is: [");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static int CheckLargestandSmallest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: "+smallest);
        return largest;
    }
    public static void main (String args[]) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number for array: ");
            numbers[i] = sc.nextInt();
        }
        createArray(numbers);
        int largestnum = CheckLargestandSmallest(numbers);
        System.out.println("Largest number is: " + largestnum);
    }
}