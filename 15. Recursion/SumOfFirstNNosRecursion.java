import java.util.*;

public class SumOfFirstNNosRecursion {
    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + Sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of first"+n+" natural numbers is: " +Sum(n));
    }
}
