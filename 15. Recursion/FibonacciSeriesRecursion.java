public class FibonacciSeriesRecursion {
    public static int FibSeq(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            return FibSeq(n - 1) + FibSeq(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(FibSeq(n));
    }
}
