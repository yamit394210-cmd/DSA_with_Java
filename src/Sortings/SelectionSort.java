package Sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        int n = arr.length;
//        for(int i = 0; i < n-1; i++){
//            boolean issorted = true;
//            for (int j = i; j < n-1; j++){
//                if(arr[i] > arr[j+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[j+1];
//                    arr[j+1] = temp;
//                    issorted = false;
//                }
//            }
//            if(issorted == true){
//                break;
//            }
//        }

        //Second Approach
//        for(int i = 0; i < n-1; i++){
//            int min = Integer.MAX_VALUE, mindex = -1;
//
//            for (int j = i; j < n; j++){
//                if(arr[j] < min){
//                    min = arr[j];
//                    mindex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = min;
//            arr[mindex] = temp;
//        }
        int mindex = -1;

        for(int i = 0; i < n-1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j < n; j++){
                if(arr[j] > max){
                    max = arr[j];
                    mindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = max;
            arr[mindex] = temp;

        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
