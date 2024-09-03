import java.util.*;

public class productofaandb {
    public static int product(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: "); 
        int num2 = sc.nextInt();
        System.out.println("Product of "+num1+" and "+num2+" is: "+product(num1, num2));
    }
}