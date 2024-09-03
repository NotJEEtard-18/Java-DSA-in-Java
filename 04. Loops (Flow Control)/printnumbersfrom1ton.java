import java.util.*;

public class printnumbersfrom1ton {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0;
        while (count < n) {
            count++;
            System.out.println(count);
        }
        System.out.println("Printed number from 1 to "+n+".");
    }
}