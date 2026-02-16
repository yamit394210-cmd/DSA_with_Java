package array;

import java.util.Arrays;

public class DeepAndShallowCopy {
    public static void main(String[] args) {
//        Pass By Reference
        int[] arr = {10, 20, 30, 40};
//        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);

//        Shallow copy => Changes in actual array
//        int[] x = arr;
//        x[2] = 50;
//        System.out.println(arr[2]);
//        System.out.println(x[2]);

//        Deep Copy => don't Changes in actual array
//        int[] deep = Arrays.copyOf(x, x.length);
//        deep[2] = 30;
//        System.out.println(deep[2]);
//        System.out.println(x[2]);

//        Another technique of making deep copy
//        int[] brr = new int[arr.length];
//        for (int i = 0 ;i < arr.length; i++ ){
//            brr[i] = arr[i];
//        }

    }
     public static void change(int[] x){
        x[1] = 50;
     }
}
