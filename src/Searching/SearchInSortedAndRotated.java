package Searching;

public class SearchInSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        int idx = 0;
        int idx1 = 0;
        while (low <= high){
            mid = low+(high-low)/2;
            if(arr[low] < arr[mid] && arr[mid] < arr[high]){
                idx = low;
            }
            else if(arr[low] < arr[mid]){
                low = mid+1;
            }

            else{
//                idx1 = mid;
                high = mid-1;

            }
        }
        System.out.println(high);
    }
}
