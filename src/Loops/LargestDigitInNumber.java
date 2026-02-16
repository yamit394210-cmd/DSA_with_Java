package Loops;

import java.util.Scanner;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = sc.nextInt();
        int max = Integer.MIN_VALUE;
//        int r = 0;
//        int min = Integer.MIN_VALUE;
//        while(x != 0){
//            r  = x % 10;
//            if(r > min){
//                min = r;
//            }
//            x /= 10;
//        }
//        System.out.println("Largest digit in number is "+min);
        while(x > 0){
            int temp = x%10;
            if(temp > max){
                max = temp;
            }
            x /= 10;
        }
        //For Negative Numbers
//        while(x < 0){
//            int temp = x%10;
//            if(-1*temp > max){
//                max = -1*temp;
//            }
//            x /= 10;
//        }
//        System.out.print("Greatest digit is : "+max);
    }
}
