import java.util.*;

public class revnum {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int n = sc.nextInt();
        int rem = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rem = (rem * 10) + lastdigit;
            n = n/10;
        }
        System.out.print("Reverse of the number given is: "+rem+".");
    }
}