package interviewQuestions;

public class question_1 {
    public static void main(String[] args){
//        Given an sorted array find the idx of target element
        int[] arr = {0, 2, 4, 7, 9};
        System.out.println("idx is : "+find(arr));

    }
    public static int find (int[] arr){
        int target = 3;
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int idx = -1;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[mid] > target){
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                idx = mid;
                return idx;
            }
        }
        return -1;
    }
}
