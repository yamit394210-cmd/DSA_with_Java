package interviewQuestions;

public class Question_3 {
    public static void main (String[] args){
//        Find pivot index in rotated array
        int[] arr = {3, 4, 8, 10, 0, 1, 2};
        int low =0;
        int high = arr.length-1;
        int mid = 0;
        int idx = -1;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[low] < arr[mid] && arr[mid] < arr[high]){
                idx = low;
                break;
            }

            else if(arr[mid] > arr[low]){
                low = mid+1;
            }
            else{
                idx = mid+1;
                high = mid-1;
            }
        }
        System.out.println("Pivot index : "+idx);
    }
}