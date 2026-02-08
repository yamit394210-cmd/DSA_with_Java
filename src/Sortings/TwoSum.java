package Sortings;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] arr = {1, 4, 6, 77, -4, 5, 10};
        Arrays.sort(arr); // merge sort ke principle par work karta hai, T.C = O(nlogn)
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i] + arr[j] == target){
                System.out.println("Found at index :"+i+"&"+j);
                break;
            }
            else if(arr[i] + arr[j] > target) j--;
            else i++;
        }
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
    }

}
