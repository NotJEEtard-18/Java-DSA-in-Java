// import java.util.*; 

// public class Halfpyramid {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the n value: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.*;

public class Halfpyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();

        printHalfPyramid(n);
    }

    public static void printHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            printNumbersInRow(i);
            System.out.println();
        }
    }

    public static void printNumbersInRow(int rowNum) {
        for (int j = 1; j <= rowNum; j++) {
            System.out.print(j);
        }
    }
}
