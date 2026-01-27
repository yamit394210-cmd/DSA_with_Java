package methods;

import java.util.Scanner;

public class BuiltIn {
    public static void main(String[] args) {
        //sqrt, cbrt, max, min, floor, ceil
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int x = sc.nextInt();
//        System.out.print("Enter Number : ");
//        int y = sc.nextInt();
//        System.out.print("Enter Number : ");
//        int z = sc.nextInt();
//        System.out.println(Math.sqrt(x));
//        System.out.println(Math.cbrt(x));
//        System.out.println(Math.max(Math.max(x, y), z));

        System.out.println(Math.floor(-3.01)); //gives a floor pure integer number
        System.out.println(Math.ceil(3.99)); // gives a ceiling pure integer number
        System.out.println(Math.abs(-5)); // makes number positive
    }
}
