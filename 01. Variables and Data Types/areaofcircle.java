import java.util.*;

public class areaofcircle {
    public static void main(String args[]) {
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r;     //'f' to make sure float is interpreted as float and not as double.
        System.out.println(area);
    }
}