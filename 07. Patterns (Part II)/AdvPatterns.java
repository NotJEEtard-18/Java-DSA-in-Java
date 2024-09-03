public class AdvPatterns {
    public static void Hollow_Rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            // inner loop:
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) { // for boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvRotPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {       
            for (int j = 1; j <= rows-i; j++){        // for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {         // for stars
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    public static void InvHalfPyNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void FloydsTriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void Zero_One_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly_Pattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();            
        }


        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces - n-i
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // stars - n
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus (int n) {
        for (int i = 1; i <= n; i++) {
            // spaces-(n-i)
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) { // for boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond_Pattern (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(4, 5);
        System.out.println();
        InvRotPyramid(5);
        System.out.println();
        InvHalfPyNum(5);
        System.out.println();
        FloydsTriangle(5);
        System.out.println();
        Zero_One_Triangle(5);
        System.out.println();
        Butterfly_Pattern(4);
        System.out.println();
        Solid_Rhombus(5);
        System.out.println();
        Hollow_Rhombus(5);
        System.out.println();
        Diamond_Pattern(4);
    }
}