package PracticeQuestions;

public class SearchInDescOrder {
    public static void main(String[] args) {
        int[] arr  = {15, 13, 11, 10, 9, 7, 6, 3, 0, -5};
        int n = arr.length;
        int target = 10;
        int low = 0;
        int high = n-1;
        int mid = 0;
        boolean flag = true;
        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] > target){
                low = mid+1;
            }
            else if (arr[mid] < target){
                high = mid-1;
            }
            else {
                if(flag == true){
                    System.out.println("Target Found At Index : "+mid);
                    flag = false;
                    break;
                }
            }
        }
       if(flag != false){
           System.out.println("Target Not Found");
       }
    }
}
