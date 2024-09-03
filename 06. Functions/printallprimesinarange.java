import java.util.*;

public class printallprimesinarange {
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
        System.out.print("Enter the N value: ");
        int N = sc.nextInt();
        System.out.print("Prime numbers between 2 and " + N + " are: ");
        for (int i = 2; i <= N; i++) {
            if (CheckPrime(i)) {
                System.out.print(i + " ");
            }
        }   
    }
}