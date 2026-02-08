package Sortings;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 4, 9, 10, 1, 2};
        int n = arr.length;
        int k = 3;
        int i;
        for(i = 0; i < k; i++){
            int min = Integer.MAX_VALUE, mindex = -1;
            for(int j = i; j < n-1; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[mindex] = temp;
        }
        System.out.println(arr[i]);
    }
}
