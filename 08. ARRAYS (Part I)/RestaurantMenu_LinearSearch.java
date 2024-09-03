import java.util.*;

public class RestaurantMenu_LinearSearch{
    public static int Menu_Check(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(item)) {     // .equals function used to compare strings in JAVA.
                return i;
            }
        }
        return -1;
    }
    
    public static void main (String args[]) {
        String menu[] = new String[5]; 
        menu[0] = "Samosa";
        menu[1] = "Bread Pakoda";
        menu[2] = "Chole Bhature";
        menu[3] = "Vadapao";
        menu[4] = "Chicken Tikka";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item you want to check: ");
        String input_item = sc.nextLine();
        int index = Menu_Check(menu, input_item);

        if (index == -1) {
            System.out.println("The item is not available in our Canteen.");
        }
        else if (index == 1){
            System.out.println("This item is present at the "+index+"st position in our menu. Contact the reception to place the order.");
        }
        else if (index == 2){
            System.out.println("This item is present at the "+index+"nd position in our menu. Contact the reception to place the order.");
        }
        else if (index == 3){
            System.out.println("This item is present at the "+index+"rd position in our menu. Contact the reception to place the order.");
        }
        else {
            System.out.println("This item is present at the "+index+"th position in our menu. Contact the reception to place the order.");
        }
    }
}