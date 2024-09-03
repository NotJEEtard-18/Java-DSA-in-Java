// Q1:- Write a Java program to get a number from the user and print whether it is
// positive or negative.
// import java.util.*;

// public class assignment2 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float num = sc.nextFloat();
//         if (num>0) {
//             System.out.println("It is a positive integer.");
//         }
//         else if (num == 0) {
//             System.out.println("It is neither a positive nor a negative integer.");
//         }
//         else {
//             System.out.println("It is a negative integer.");
//         }
//     }
// }

// Q2:- Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.
// import java.util.*;

// public class assignment2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float temp = sc.nextFloat();
//         if (temp>100) {
//             System.out.println("You have fever.");
//         }
//         else {
//             System.out.println("You don't have fever.");
//         }
//     }
// }

//Q3:- Write a Java program to input week number(1-7) and print day of week name
// using switch case.
// import java.util.*;

// public class assignment2 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the week day's number: ");
//         int input = sc.nextInt();
//         switch (input) {
//             case 1 : System.out.println("Monday");
//                         break;
//             case 2 : System.out.println("Tuesday");
//                         break;
//             case 3 : System.out.println("Wednesday");
//                         break;
//             case 4 : System.out.println("Thursday");
//                         break;
//             case 5 : System.out.println("Friday");
//                         break;
//             case 6 : System.out.println("Saturday");
//                         break;
//             case 7 : System.out.println("Sunday");
//         }
//     }
// }

// Q4:- Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.
// import java.util.*;

// public class assignment2 {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year: ");
//         int year = sc.nextInt();
//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0){
//                     System.out.println(year+ " is a leap year.");
//                 }
//                 else {
//                     System.out.println(year+ " is not a leap year.");
//                 }
//             }
//             else {
//                 System.out.println(year+ " is not a leap year.");
//             }
//         }
//         else {
//             System.out.println(year+ " is not a leap year.");
//         }
//     }
// }