// print numbers from 1 to n(increasing order)

public class PrintNumInIncOrder {
    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        PrintInc(n - 1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        PrintInc(n);
    }
}
