package DZ_1_2_1;

public class WorkWithArrays {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
            for (int i = 0;i != arr.length ; i++){
            System.out.println(arr[i]);
            }
        System.out.println("------------------------");
            int j = arr.length - 1;
            do {
                System.out.println(arr[j]);
                j--;
            }
            while (j>=0);
        System.out.println("------------------------");
            int k = arr.length - 1;
            while(k>=0){
                System.out.println(arr[k]);
                k--;
            }
        System.out.println("------------------------");
            for (int i : arr){
                System.out.println(i);
            }
    }
}
