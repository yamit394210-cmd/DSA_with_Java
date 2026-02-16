package array;

public class RotateArray1 {
    public static void main(String[] args){
        int[] arr = {6, 8, 1, 2, 4, 0, 9};
        int n = arr.length-1;
        int j = 0;
        while(j < 4){
            int i = 0;
            while(i < n){
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                i++;
            }
            j++;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
