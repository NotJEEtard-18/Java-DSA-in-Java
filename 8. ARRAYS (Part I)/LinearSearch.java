public class LinearSearch {
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main (String args[]) {
        int numbers[] = {1,23,4,5,6,7,8,9,10};
        int key = 7;
        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found.");
        }
        else{
            System.out.println("Key found at "+index+"th index position.");
        }
    }
}


