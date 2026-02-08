package PracticeQuestions;

public class FindFloorSqrt1 {
    public static void main(String[] args) {
        int n = 6;
        int low = 1;
        int high = n;
        int idx = -1;
        boolean flag = true;
        while(low <= high){
           int mid = low+(high-low)/2;
           if(n==0){
               System.out.println("0");
               flag = false;
               break;
           }
           else if(mid == n*mid) {
               System.out.println("Floor Squareroot is : "+mid);
               flag = false;
               break;
           }
           else if(mid > n/mid) {
               idx = mid;
               high = mid-1;
           }
           else{
               idx = mid;
               low = mid+1;
           }
        }
        if(flag != false){
            System.out.println("Floor sqrt : "+idx);
        }

    }
}
