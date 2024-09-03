import java.util.*;

public class ifprimeornot {
    // public static boolean CheckPrime(int num) {
    //     boolean CheckPrime = true;
    //     if (num == 2){
    //         return true;
    //     }
    //     for (int i = 2; i <= num-1; i++) {
    //         if (num % i == 0) {
    //             CheckPrime = false;
    //             break;
    //         }
    //     }
    //     return CheckPrime;
    // }

    //Optimised Version:- 
    public static boolean CheckPrime(int num) {
        boolean CheckPrime = true; 
        if (num == 2) {
            return true; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                CheckPrime = false;
                break;
            }
        }
        return CheckPrime;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        System.out.println(CheckPrime(N));
    }
}