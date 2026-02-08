package Searching;

public class ArrangingCoins {
    public static void main(String[] args) {
//        Important Formula => k = -1+(squareOf8n+1)/2
        int n = 14*8+1;
        int low = 1;
        int high = n;
        int mid = 0;
        int sqrt = 0;
        while(low <= high){
            mid = low+(high-low)/2;
            if(mid*mid == n) {
                sqrt = mid;
                break;
            }
            else if(mid*mid > n){
                high = mid-1;
            }
            else{
                sqrt = mid;
                 low = mid+1;
            }
        }
        System.out.println((-1+sqrt)/2);
    }
}
