import java.util.*;

public class switchfunction {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1 : System.out.println("Fan");
                        break;
            case 2 : System.out.println("Cooler");
                        break;
            case 3 : System.out.println("TV");
                        break;
            case 4 : System.out.println("AC") ;
            default : System.out.println("Invalid");
        }
    }
}