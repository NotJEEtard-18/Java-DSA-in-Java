import java.util.Scanner;

public class ElementSearchin2DArray {
    public static boolean search(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println(key+" not found in the matrix entered.");
        return false;
    }
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

        //element search in the 2D Array :- 
        System.out.println("Enter the key you want to check: ");
        int key = sc.nextInt();
        search(matrix, key);
    }
}
