package interviewQuestions;

public class question_2 {
    public static void main(String[] args){
//        Given an array with duplicate elements, find first and last occurence
        int[] arr = {1, 2, 2, 2, 2, 3, 3};
        int target = 1;
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int idx = -1;
//        Finding First Occurence
        while(low <= high){
            mid = low+(high - low)/2;
            if(arr[mid] >= target){
                idx = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("First Occurence At index : "+idx);

//        Finding Second Occurence
        low = 0;
        high = arr.length-1;
        mid = 0;
        idx = -1;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[mid] <= target){
                idx = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("Last Occurence At index : "+idx);

    }
}
