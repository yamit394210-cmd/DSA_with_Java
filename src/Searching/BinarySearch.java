package Searching;

public class BinarySearch {
    public static void main(String[] args) {
//      Binary Search Works on Sorted Array
//      Follows divide & Conquer principle
//      it divides elements in 2 parts
//      Improves time complexity from O(n) -> O(lognn)

        int[] arr = {0, 2, 3, 5, 7, 9, 11, 20, 22, 39};
        int target = 1;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        boolean flag = true;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                System.out.println(arr[mid]);
                flag = false;
                break;
            }
        }
        if(flag != false){
            System.out.println("Not Found");
        }

    }
}
