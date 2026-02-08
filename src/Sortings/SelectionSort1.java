package Sortings;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        int n = arr.length;
        for (int i = n-1 ; i > n-7; i--){
            int max = Integer.MIN_VALUE, madex = -1;
            for(int j = i; j > n-8; j--){
                if(arr[j] > max){
                    max = arr[j];
                    madex = j;
                }
            }
            //Swapping
            int temp = arr[i];
            arr[i] = max;
            arr[madex] = temp;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
