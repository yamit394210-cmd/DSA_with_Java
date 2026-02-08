package PracticeQuestions;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {-5, -4, -4, 0, 1, 3, 5, 5, 5, 5, 67, 123, 124, 125};
        int x = -4;
        int idx = -1;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] > x){
                idx = mid;
                high = mid-1;
            }
            else if(arr[mid] < x){
                low = mid+1;
            }
            else{
                idx = mid;
                high = mid-1;
            }
        }
        System.out.println("First Occurence At : "+idx);

        high = n-1; //5
        low = 0;
        while (low <= high){
            mid = (low+high)/2;
            if(arr[mid] > x){
                high = mid-1;
            }
            else if(arr[mid] < x){
               low = mid+1;
            }
            else {
                idx = mid;
                low = mid+1;
            }
        }
        System.out.println("Last Occurence At : "+idx);
    }
}
