package Sortings;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 17, 31, 9, 2, 0, 8, 6};
//        for(int i = 1; i < arr.length; i++){
//            int j = i;
//            while (j > 0 && arr[j] < arr[j-1]){
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//                j--;
//            }
//        }
//        for (int ele : arr) {
//            System.out.print(ele+" ");
//        }
        int i = 1;
        while(i < arr.length){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
            i++;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
