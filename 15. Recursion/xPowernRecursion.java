// public class xPowernRecursion{
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * power(x, n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(power(2, 10));
//     }
// }        //O(n) time complexity

// Optimised way (O(logn)) :- 
public class xPowernRecursion {
    public static int OptimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        // int halfPowerSq = OptimizedPower(a, n/2) * OptimizedPower(a, n/2);
        int halfPower = OptimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd.
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(OptimizedPower(a, n));
    }
}
