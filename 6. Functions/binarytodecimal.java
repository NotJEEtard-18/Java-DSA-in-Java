public class binarytodecimal {
    public static void BintoDec(int BinNum) {
        int myNum = BinNum;
        int pow = 0;
        int dec = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            dec = dec + lastdigit*((int)Math.pow(2, pow));
            pow++;
            BinNum = BinNum / 10; 
        }
        System.out.println("Decimal number of "+myNum+" is: "+dec);
    }

    public static void main(String args[]) {
        BintoDec(101);
    }
}