package array;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int num = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);

//        By Functions
        Collections.reverse(arr);

//        Reverse Array List
//        int i = 0;
//        int j = arr.size() - 1;
//        while(i < j){
//            int temp = arr.get(i);
//            arr.set(i, arr.get(j));
//            arr.set(j, temp);
//            i++; // Standalone
//            j--; // Standalone
//        }

//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
        System.out.println();
        System.out.print(arr); // Array Like Structure Print kartan hai


    }
}
