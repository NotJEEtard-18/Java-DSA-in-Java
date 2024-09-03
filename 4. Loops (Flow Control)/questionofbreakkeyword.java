// Q:- Keep entering numbers till user enters a multiple of 10 and also find the sum of the numbers entered.
import java.util.*;

public class questionofbreakkeyword {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int N;
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            N = sc.nextInt();       // Can't define 'N' as integer two times, it is     already defined above, just before the loop.
            if (N % 10 == 0) {
                break;
            }
            System.out.println(N);
            sum += N;       // Adds to the sum counter created.
            N++;            // Counter.
        }
        System.out.println("Loop has been exited.");
        System.out.println("Sum of the numbers entered: "+sum);
    }
}

//Alternative Method :- 
// import java.util.*;

// public class questionofbreakkeyword {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int sum = 0;
//         do {
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//             sum += n;
//         }
//         while(true);
//         System.out.println("Loop has been exited.");
//         System.out.println("Sum of the numbers entered: "+sum);
//     }
// }