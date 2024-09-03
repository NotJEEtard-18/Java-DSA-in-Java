import java.util.*;

public class Passingarrayasargument {
    public static int[] Update(int marks[]){
        for (int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
        return marks;
    }
    
    public static void main (String args[]) {
        int marks[] = new int[3]; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Mathematics marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        marks[2] = sc.nextInt();
        
        System.out.print("Updated Marks: [");
        int[] updated_marks = Update(marks);
        for (int i = 0; i < updated_marks.length; i++){
            System.out.print(updated_marks[i]);
            if (i < updated_marks.length - 1) {     // this loop to make sure that the commas in the array, comes only till the second element in the array and not the third i.e., to avoid the output look like :- [1,2,3,].
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
