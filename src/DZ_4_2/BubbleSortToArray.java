package DZ_4_2;


public class BubbleSortToArray {
    public static void sorted(int[] sortArr) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < sortArr.length; i++) {
                int previous = sortArr[i - 1];
                int current = sortArr[i];
                if (previous > current){
                    swap(sortArr,i - 1, i);
                    isSorted = false;
                }
            }
        }
    }
    private static void swap(int[] sortArr, int index1, int index2){
        int temp = sortArr[index1];
        sortArr[index1] = sortArr[index2];
        sortArr[index2] = temp;
    }
}