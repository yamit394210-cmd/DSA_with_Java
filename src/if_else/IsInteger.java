package if_else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        //Check for x = -3.14
        double x = sc.nextDouble();
        int  y = (int) x;
        if(x-y == 0)
            System.out.println("Is An Integer");
        else
            System.out.println("Not An Integer");
    }
}
