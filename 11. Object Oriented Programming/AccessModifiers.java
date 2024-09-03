public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shubham";
        myAcc.setPassword("shubh2005");
        System.out.println(myAcc.username);
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pswrd) {
        password = pswrd;
    }
    public String getPassword() {       //function created to display the password
        return password;
    }
}