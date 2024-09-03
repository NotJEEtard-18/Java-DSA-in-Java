public class OddOrEven {
    public static void oddorEven (int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            //even number :-
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(11);
        oddorEven(14);
    }
}
