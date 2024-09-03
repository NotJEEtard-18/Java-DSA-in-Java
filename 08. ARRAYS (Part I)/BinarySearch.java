public class BinarySearch {
    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            //comparisons
            if (numbers[mid] == key) {  //found
                return mid;
            }
            else if (numbers[mid] < key) {  //search continues in the right side
                start = mid + 1;
            }
            else {      //search continues in the left side
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Index for the key is: "+BinarySearch(numbers, key));
    }
}
