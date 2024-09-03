import java.util.*;

public class binomialcoefficientfunctions {
    public static int factorial(int num) {
        int factorial = 1;
        if (num < 0) {
            System.out.println("Factorial is not valid for negative inputs, please enter a valid input.");
        }
        else {
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }
            System.out.println("Factorial of "+num+" is: "+factorial);
        }
        return factorial;
    }

    public static int BinomialCoeff(int n, int r) {
        int BinCoeff = factorial(n)/(factorial(r)*factorial(n-r));
        return BinCoeff;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int N = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int R = sc.nextInt();
        System.out.println("Binomial coefficient of "+N+"C"+R+" is: "+BinomialCoeff(N, R));
    }
}