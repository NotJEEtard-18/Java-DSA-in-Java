import java.util.*;

public class InputOutputUpdate {
    public static void main (String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();    //phy
        marks[1] = sc.nextInt();    //chem
        marks[2] = sc.nextInt();    //maths
        System.out.print("Length of array is: "+marks.length);      //length of any array
        System.out.println("Physics Marks: "+marks[0]);
        System.out.println("Chemistry Marks: "+marks[1]);
        System.out.println("Maths Marks: "+marks[2]);

        marks[2] = 2;
        System.out.println("Maths Marks: "+marks[2]);        //updating the array
    }
}
