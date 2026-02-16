package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 40, 5, 0};
//        int j = arr.length;
//        for (int i =0; i < arr.length/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[j-1];
//            arr[j-1] = temp;
//            j--;
//        }
//        for (int ele : arr){
//            System.out.println(ele+" ");
//        }
//        Another method to done same thing
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
