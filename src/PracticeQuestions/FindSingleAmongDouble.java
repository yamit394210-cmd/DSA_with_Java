package PracticeQuestions;

public class FindSingleAmongDouble {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        int idx = -1;
        while(low <= high){
            mid = low+(high-low)/2;
//            for Checking 0 And 1 Index
            if(arr[0] != arr[1]){
                System.out.println(arr[0]);
                break;
            }
            else if(arr[n-1] != arr[n-2]){
                System.out.println(arr[n-1]);
                break;
            }
//            Binary Search
            if(arr[mid] == arr[mid-1]){
                if((mid-1-low) % 2 == 0 ){
                   low = mid+1;
                }
                else high = mid-1;
            }
            else if(arr[mid] == arr[mid+1]){
                if((n-mid+1+1) % 2 == 0 ){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else {
                idx = mid;
                high = mid-1;
            }
        }
        System.out.println("Single is : "+arr[idx]);
    }
}
