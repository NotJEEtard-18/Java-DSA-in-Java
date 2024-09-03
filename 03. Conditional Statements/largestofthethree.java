import java.util.*;

public class largestofthethree {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        if (A>B && A>C) {
            System.out.println("A is the greatest number entered.");
        }
        else if (B>A && B>C) {
            System.out.println("B is the greatest number entered.");
        }
        else {
            System.out.println("C is the greatest number entered.");
        }
    }
}