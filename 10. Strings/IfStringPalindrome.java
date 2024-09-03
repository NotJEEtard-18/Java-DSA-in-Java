import java.util.*;;

public class IfStringPalindrome {
    public static boolean CheckPalindrome(String str) {
        int n = str.length(); //outside the loop to improve efficiency
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string to check if palindrome or not: ");
        String str = sc.next();
        System.out.println(CheckPalindrome(str));
    }
}
