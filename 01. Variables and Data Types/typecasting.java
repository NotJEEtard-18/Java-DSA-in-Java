// import java.util.*;

// public class typecasting {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float a = 25.12f;  // 'f' to avoid double to float or vice-versa error.
//         // int b = a;      // Throws an error as float can't be converted into int.
//         int b = (int)a;
//         System.out.println(b);
//     }
// }

public class typecasting {
    public static void main (String args[]) {
        char ch1 = 'a';
        char ch2 = 'b';
        int a = (int)ch1;
        int b = (int)ch2;
        System.out.println(a);
        System.out.println(b);
    }
}