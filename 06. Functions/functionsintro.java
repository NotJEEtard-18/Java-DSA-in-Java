import java.util.*;

public class functionsintro {
    public static void printHelloworld() {
        System.out.println("Hello world");
    }
    // public static void main(String args[]) {
    //     printHelloworld();      // function call
    // }

    public static int calculateSum(int num1, int num2) {        // num1 and num2 are formal parameters(used for defining)
        int sum = num1 + num2;
        return sum;
    }

    // public static void main (String args[]) {
    //     Scanner sc = new Scanner(System.in); 
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a, b);       // a and b are arguments or actual parameters(used for calling)
    //     System.out.println(sum);
    // }

    public static void main (String args[]) {
        int a = 5;
        int b = 10;

        //swapping :- 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}