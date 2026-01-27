package if_else;

import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Char: ");
        int x = sc.nextInt();
//        int y = (int) x;
//        System.out.print("Enter 2nd: ");
//        int y = sc.nextInt();
//        System.out.print("Enter 3nd: ");
//        int z = sc.nextInt();
//        if(x >= 0){
//            if(x>0){
//                System.out.println("Positive");
//            } else {
//                System.out.println("Zero");
//            }
//
//        } else {
//            System.out.println("Negative");
//        }
//        if(x % 4 == 0){
//            System.out.println("Leap Year");
//        } else {
//            System.out.println("Not Leap Year");
//        }

//        if(x >= 90 && x <= 100){
//            System.out.println("A");
//        }
//        else if(x >= 75 && x <= 89){
//            System.out.println("B");
//        }
//        else if(x >= 50 && x<=74){
//            System.out.println("C");
//        }
//        else{
//        if(x < 50){
//            System.out.println("Fail");
//        } else {
//            System.out.println("Number is Above 100");
//        }
//
//        }
//        if(x == 'a' || x == 'e' || x == 'i' || x =='o' || x == 'u'){
//            System.out.println("Vowel");
//        }
//        else if(x == 'A' || x == 'E' || x == 'I' || x =='O' || x == 'U'){
//            System.out.println("Vowel");
//        }
//        else if(x >= 97 && x <= 122 || x >= 65 && x <= 90){
//            System.out.println("Consonant");
//        }
//        else {
//            System.out.println("Others");
//        }

//        if(x <= 100){
//            System.out.println("2 Per Unit");
//        }
//        else if(x <= 200){
//            System.out.println("3 Per Unit");
//        }
//        else {
//            System.out.println("5 Per Unit");
//        }

        if(x == 1){
            System.out.print("Enter 1st Number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number: ");
            int b = sc.nextInt();
            System.out.println("Sum is: "+a+b);
        }
        else if(x == 2){
            System.out.print("Enter 1st Number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number: ");
            int b = sc.nextInt();
            System.out.println("Sum is: "+(a-b));
        }
        else if(x == 3){
            System.out.print("Enter 1st Number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number: ");
            int b = sc.nextInt();
            System.out.println("Sum is: "+(a*b));
        }
        else {
            System.out.print("Enter 1st Number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number: ");
            int b = sc.nextInt();
            System.out.println("Sum is: "+(a/b));
        }
    }
}
