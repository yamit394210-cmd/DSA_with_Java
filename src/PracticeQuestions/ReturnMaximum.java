package PracticeQuestions;

public class ReturnMaximum {
    public static void main(String[] args) {
        int[] arr = {-2, -1, -1, -1, 0, 0, 2, 2, 3, 4, 5};
        int neg = 0;
        int pos = 0;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        int idx = -1;
//        Finding First positive index
        while (low <= high){
            mid = (low+high)/2;
            if(arr[mid] < 1){
                low = mid+1;
            }
            else if(arr[mid] >= 1){
                idx = mid;
                high = mid-1;
            }
            else {
                idx = mid;
                low = mid+1;
            }
        }
        System.out.println("First Positive index at : "+idx);

//        Finding last negative index
        low = 0;
        high = n-1;
        while (low <= high){
            mid = (low+high)/2;
            if(arr[mid] > -1){
                high = mid-1;
            }
            else if(arr[mid] <= 0){
                idx = mid;
                low = mid+1;
            }
        }
        System.out.println("Last Negative index at : "+idx);
//        neg = idx+1;
//        pos = n- neg;
//        for(int x : arr){
//            if(x == 0) pos = pos -=1;
//        }
    }
}
