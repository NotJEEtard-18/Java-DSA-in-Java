public class continuestatement {
    public static void main (String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;       //Skips 5 and prints rest all integers.
            }
        System.out.println(i);
        }
    }
}