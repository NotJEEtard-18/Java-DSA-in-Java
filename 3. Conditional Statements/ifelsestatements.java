import java.util.*;

public class ifelsestatements {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are an adult.");
        }
        if (age>13 && age<18){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are not adult.");
        }
    }
}