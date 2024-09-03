// Q1:- Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.
// import java.util.*;

// public class assignment3 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int evencount = 0;
//         int evensum = 0;
//         int oddcount = 0;
//         int oddsum = 0;
//         do {
//             System.out.print("Enter the numbers(0 to exit): ");
//             int n = sc.nextInt();
//             if (n == 0) {
//                 break;
//             }            
//             if (n % 2 == 0) {
//                 evencount++;
//                 evensum += n;
//             }
//             else {
//                 oddcount++;
//                 oddsum += n;
//             }
//         }
//         while (true);
//         System.out.println("Number of even numbers entered was: "+evencount);
//         System.out.println("Number of odd numbers entered was: "+oddcount);
//         System.out.println("Sum of all the even numbers of the inputs entered: "+evensum);
//         System.out.println("Sum of all the odd numbers of the inputs entered: "+oddsum);
//     }
// }


// Q2:- Write a program to find the factorial of any number entered by the user.
// import java.util.*;

// public class assignment3 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter a number: ");
//         int N = sc.nextInt();
//         int factorial = 1;
//         if (N < 0) {
//             System.out.println("Factorial is not valid for numbers less than zero, please enter valid input.");
//         }
//         else {
//             for(int i = 1; i <= N; i++){
//                 factorial *= i;
//             } 
//         }
//         System.out.println("Factorial of "+N+" is: "+factorial);
//     }
// }

// Q3:- Write a program to print the multiplication table of a number N, entered by the
// user.
import java.util.*; 

public class assignment3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number for which you want the table to be printed: ");
        int N = sc.nextInt();
        System.out.println("Here is the table of "+N+":-");
        int i = 1;
        for(i = 1; i <= 10; i++) {
            System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}