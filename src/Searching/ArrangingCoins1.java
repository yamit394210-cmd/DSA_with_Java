package Searching;

public class ArrangingCoins1 {
    public static void main(String[] args){
        int n = 16;
        int low = 0;
        int high = n;
        int k = 0;
        int m = 0;
        boolean flag = true;
        while (low <= high){
           k = low+(high-low)/2; //k =7 11 9 8
           m = k*(k+1)/2; //m= 11 66 45 32
           if(m == n){
               System.out.println(n);
               flag = false;
               break;
           }
           else if(m > n){
               high = k-1;
           }
           else {
                low = k+1;
           }
        }
        if(flag!=false) System.out.println(high);

    }
}
