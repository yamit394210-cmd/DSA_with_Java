package PracticeQuestions;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 10, 10, 12, 19};
        int n = arr.length;
        int x = 10;
        int low = 0;
        int high = n-1;
        int mid = 0;
        int idx = -1;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] >= x){
                idx = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("Floor : "+idx);
    }
}
