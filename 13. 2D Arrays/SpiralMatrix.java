public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        while(startRow <= endRow && startCol <= endCol) {
            //printing top boundary :-
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //printing right boundary :- 
            for (int i = startRow + 1; i <= endRow; i++) {      //"startRow + 1" because the last element of first row is already printed.
                System.out.print(matrix[i][endCol] + " ");
            }

            //printing bottom boundary :-
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            } 

            //printing left boundary :- 
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}
