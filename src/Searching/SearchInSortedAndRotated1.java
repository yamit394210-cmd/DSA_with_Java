package Searching;

public class SearchInSortedAndRotated1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr.length;
        int target = 10;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[low] < arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else {
                if(target > arr[mid] && target <= arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
    }
}
