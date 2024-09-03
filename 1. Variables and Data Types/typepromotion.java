// public class typepromotion {
//     public static void main (String args[]) {
//         char ch1 = 'a';
//         char ch2 = 'b';
//         // char ch3 = a-b;     //Throws an error as a-b becomes an integer due to type promotion.
//         System.out.println((int)(ch1));
//         System.out.println((int)(ch2));
//         System.out.println(ch2-ch1);     //Works successfully as in java, type promotion happens whenever there is byte, short or char operand to int when we are  evaluating an expression.
//     }
// }


// public class typepromotion {
//     public static void main (String args[]) {
//         short a = 5;
//         byte b = 25;
//         char c = 'c';
//         // byte bt = a+b+c;        //Throws an error due to the same reason as above.
//         byte bt = (byte)(a+b+c);
//         System.out.println(bt);     //Works successfully if we do typecasting.
//     }
// }


public class typepromotion {
    public static void main (String args[]) {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30; 
        double ans = a+b+c+d;
        System.out.println(ans);        //If one operand is long, float or double, the whole expression is promoted to long, float or double respectively.
    }
}