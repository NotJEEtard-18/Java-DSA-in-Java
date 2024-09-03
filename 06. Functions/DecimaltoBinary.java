public class DecimaltoBinary {
    public static void DectoBin (int DecNum) {
        int myNum = DecNum;
        int bin = 0;
        int power = 0;
        while (DecNum > 0) {
            int rem = DecNum % 2;
            bin = bin + rem * ((int)Math.pow(10,power));
            power++;
            DecNum = DecNum / 2;
        }
        System.out.println("Binary number of "+myNum+" is: "+bin);
    }

    public static void main (String args[]) {
        DectoBin(5);
    }
} 