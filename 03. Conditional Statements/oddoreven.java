import java.util.*;

public class oddoreven {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 != 0){
            System.out.println("The input given is an odd number.");
        }
        else {
            System.out.println("The input given is an even number.");
        }
    }
}