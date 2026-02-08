package array;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array Size : ");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//        System.out.print("Enter An Elements : ");

        int[] arr = {-2, -3, -23, -4};
        // Input Procedure
//        for (int i = 0; i < arr.length; i++){
//            int x = sc.nextInt();
//            arr[i] = x;
//        }

        // Largest Number
//        int max = arr[0]; //or = integer.Min.Value;
        int max = -1; // if elements are positive+negative then -1 is ok but in term of
        // all negative integers it throws false decision

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
