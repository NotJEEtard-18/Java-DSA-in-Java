import java.util.*;

public class incometaxcalculator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;      // Started a tax counter
        if (income < 500000) {
            tax = 0;
            System.out.println("Tax = "+tax);
        } else if(income >= 500000 && income < 1000000){
            tax = (float)income*0.2f;
            System.out.println("Tax = "+tax);
        }
        else {
            tax = (float)income*0.3f;
            System.out.println("Tax = "+tax);
        }
    }
}