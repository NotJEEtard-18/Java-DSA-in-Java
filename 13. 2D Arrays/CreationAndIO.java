import java.util.*;

public class CreationAndIO {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        //input in a 2D - Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input for the matrix: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        //displaying the 2D - Array
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
