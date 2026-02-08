package array;

public class RotateArray {
    public static void main(String[] args) {


        //reversing 2, 4, 0, 9
//        int j = arr.length;
//        for (int i = 3; i < j; i++){
//            int temp = arr[i];
//            arr[i] = arr[j-1];
//            arr[j-1] = temp;
//            j--;
//        }
//        int temp = arr[0];
//        arr[0] = arr[2];
//        arr[2] = temp;
//
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//
//        int i = 0;
//        int n = arr.length-1;
//        while(i < n){
//            int temporary = arr[i];
//            arr[i] = arr[n];
//            arr[n] = temporary;
//            i++;
//            n--;
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }

        //Another Method

        int[] arr = {6, 8, 1, 2, 4, 0, 9};

        int[] brr = new int[arr.length];
        int d = 3;
        int n = arr.length;
//        pushing elements from index 0 - 3
        for (int i = 0; i < n-3; i++){

            brr[i] = arr[i+3];

        }
//        pushing elements from index 4 - 6
        for (int i = n-d; i < n; i++){
            brr[i] = arr[i-4];
        }

//        Making Shallow Copy

        arr = brr;

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
