import java.util.*;

public class ternaryoperator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        // Using ternary operator:- 
        String type = ((num%2)==0)?"Even":"Odd";
        System.out.println(type);
    }
}