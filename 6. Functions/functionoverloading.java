public class functionoverloading {
    //func to calculate sum of two int nos.
    public static int sum(int a, int b) {
        return a + b;
    }

    //func to calculate sum of three int nos.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //func to calculate sum of two float values.
    public static float sum (float a, float b){
        return a + b;
    }

    //func to calculate sum of three float values.
    public static float sum (float a, float b, float c){
        return a + b + c;
    }

    public static void main (String args[]) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1.5f,2.2f));
        System.out.println(sum(1.3f,2.4f,3.5f));
    }
}