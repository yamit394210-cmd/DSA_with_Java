package array;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 4, 4, 7};
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // By default value 0, 0, 0, 0, 0
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
