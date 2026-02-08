package PracticeQuestions;

public class FindMaxInMountain {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 8, 9, 24, 24, 1, 0, -1, -2,};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while (low <= high){
            mid = (low + high)/2;
            if(arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1]){
                System.out.println("Found At Index : "+mid);
                break;
            }
            else if(arr[mid] > arr[mid+1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
    }
}
