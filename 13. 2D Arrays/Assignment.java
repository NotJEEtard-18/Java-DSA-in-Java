import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            //taking initial informations about the matrix :-
            System.out.print("Enter the number of rows for the matrix you want to enter: ");
            int row = sc.nextInt();
            System.out.print("Enter the number of columns for the matrix you want to enter: ");
            int col = sc.nextInt();
            int matrix[][] = new int[row][col];

            //displaying the user about the data he/she entered :-
            System.out.println("Ok, you want a (" + row + "," + col + ") matrix.");
            int n = matrix.length;
            int m = matrix[0].length;

            //taking the required matrix as input :-
            System.out.println("Enter a (" + row + "," + col + ") matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            //reading the values :-
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            //asking for the key :-
            System.out.print("Now enter the key of which, you want to find out the number of that key available: ");
            int key = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == key) {
                        count++;
                    }
                    else {
                        continue;
                    }
                }
            }

            //to avoid the infinite loop
            System.out.println("The number of " + key + "s available in the entered matrix is: " + count);
            System.out.print("Do you want to enter another matrix? (yes/no): ");
            sc.nextLine();  // Consume the newline
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Exiting the program.");
                break;
            }
        }
    }
}
