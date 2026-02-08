package Loops;

import com.sun.source.doctree.EndElementTree;

import java.util.Scanner;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int r = 0;
        int min = Integer.MIN_VALUE;
        while(x != 0){
            r  = x % 10;
            if(r > min){
                min = r;
            }
            x /= 10;
        }
        System.out.println("Largest digit in number is "+min);
    }
}
