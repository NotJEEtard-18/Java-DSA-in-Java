import java.util.*;

public class passfailusingternaryoperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float marks = sc.nextFloat();
        String reportcard = ((marks>=33))?"Pass":"Fail";
        System.out.println(reportcard);
    }
}