import java.util.*;

public class reverseofanumber {
    public static void main (String args[]) {
        System.out.print("Enter the number of which reverse is required: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder = 0;
        int reversedNumber = 0;
        while (n > 0) {
            remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            n = n/10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}