package interviewQuestions;

public class Question_4 {
    public static void main(String[] args){
       int[] arr = {1, 2, 5, 7, 10, 9, 5, 1};
       int low = 0;
       int high = arr.length-1;
       int mid = 0;
       while(low <= high){
           mid = low+(high-low)/2;
           if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
               low = mid+1;
           }
           else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]){
               high = mid -1;
           }
           else {
               System.out.println(arr[mid]);
               break;
           }

       }
    }
}
