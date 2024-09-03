// Q:- Display all the numbers entered by the user except the multiple of 10.
// import java.util.*;

// public class questionofcontinuekeyword {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int n = 0;
//         while (true) {
//             System.out.print("Enter a number: ");
//             n = sc.nextInt();
//             if (n % 10 == 0){
//                 continue;
//             }
//         System.out.println(n);
//         n++;
//         }
//     }
// }


//Alternative Method :- 
import java.util.*;

public class questionofcontinuekeyword {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                continue;
            }

            System.out.println("Entered number: "+n);
        }while(true);
    }
}