//Q1:- Write a Java method to compute the average of three numbers.
// public class assignment4 {
//     public static int average (int num1, int num2, int num3){
//         int average = (num1 + num2 + num3)/3;
//         return average;
//     }
//     public static void main (String args[]) {
//         System.out.println(average(1,2,3));
//     }
// }


//Q2:- Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your method.
// import java.util.*;

// public class assignment4 {
//     public static boolean isEven(int num) {
//         boolean isEven = true;
//         if (num % 2 == 0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the number to check: ");
//         int N = sc.nextInt();
//         System.out.println(isEven(N));
//     }
// }


// Q3:- Write a Java program to check if a number is a palindrome in Java.
// import java.util.*;

// public class assignment4 {
//     public static String CheckPalindrome(int num) {
//         int myNum = num;
//         int revnum = 0;
//         while (num > 0) {
//             int lastdigit = num % 10;
//             revnum = revnum * 10 + lastdigit;
//             num = num / 10;
//         }  
//         if (myNum == revnum) {
//             return myNum+" is a Palindrome.";
//         }
//         else {
//             return myNum+" is not a Palindrome.";
//         }
//     }

//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the number to check if palindrome or not: ");
//         int N = sc.nextInt();
//         System.out.println(CheckPalindrome(N));
//     }
// }

//Q4:- Write a Java method to compute the sum of the digits in an integer.
// import java.util.*;

// public class assignment4 {
//     public static String DigitSum(int num) {
//         int myNum = num;
//         int sum = 0;
//         while (num > 0) {
//             int lastdigit = num % 10;
//             num = num / 10;
//             sum += lastdigit;
//         }
//         return "Sum of the digits of "+myNum+" is: "+sum;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number to calculate digits sum: ");
//         int N = sc.nextInt();
//         System.out.println(DigitSum(N));
//     }
// }