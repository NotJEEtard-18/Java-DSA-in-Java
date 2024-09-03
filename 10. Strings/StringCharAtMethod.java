public class StringCharAtMethod {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++ ) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstname = "Shubham";
        String middlename = "Kumar";
        String lastname = "Jha";
        String fullname = firstname + " " + middlename + " " + lastname;
        // System.out.println(fullname);
        // System.out.println(fullname.charAt(3));
        printLetters(fullname);
    }
}
