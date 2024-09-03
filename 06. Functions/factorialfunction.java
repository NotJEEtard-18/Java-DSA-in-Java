import java.util.*;

public class factorialfunction {
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

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        factorial(N);    
    }
}
