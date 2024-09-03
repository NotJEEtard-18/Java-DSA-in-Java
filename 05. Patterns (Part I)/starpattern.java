public class starpattern {
    public static void main (String args[]) {
        for(int i = 1; i <= 5; i++){
            //one line
            for(int star = 1; star <= i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}