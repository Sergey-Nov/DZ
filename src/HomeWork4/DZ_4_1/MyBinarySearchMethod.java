package HomeWork4.DZ_4_1;

public class MyBinarySearchMethod {
    public static int binarySearch(int [] arr, int numberToSearch){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex){
            int midIndex = (firstIndex + lastIndex)/2;
            if (arr[midIndex] == numberToSearch){
                return midIndex;
            } else if (arr[midIndex] < numberToSearch) {
                firstIndex = midIndex + 1;
            } else if (arr[midIndex] > numberToSearch) {
                lastIndex = midIndex - 1;
            }
        }
        return -1;
    }


}
