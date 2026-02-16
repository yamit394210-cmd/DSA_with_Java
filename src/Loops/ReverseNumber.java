package Loops;

import java.util.Scanner;

public class ReverseNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = 0;
            int num = 1234;
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int sum = a+b; // sum = 1286
//            while (sum != 0){
//                r *= 10;
//                r += (sum % 10);
//                sum /= 10;
//            }
            while(num != 0){
                r *= 10;
                r += (num%10);
                num /= 10;
            }
            System.out.println(r);
        }
    }

