package Searching;

public class KthMissingElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 11};
        int k = 4;
        int low = 0 ;
        int high = arr.length-1;
        int mid = 0;
        while(low <= high){
            mid = low+(high-low)/2;
            int correctNum = mid+1;
            int missing = arr[mid] - correctNum;
            if(missing >= k){
                high = mid-1;
            }
            else low = mid+1;
        }
        System.out.println(low+k);
    }
}
