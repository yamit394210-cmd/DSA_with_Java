package basic;

public class CharValues {
    //ASCII Values
    //A....Z = 65  - 90
    //a....z = 97 - 122
    //0....9 = 48 - 57
    //Char variables stores ascii value of any variable
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch; //implicit conversion(auto)
//        System.out.println(x);

//        character to integer
        char chh = '2';
//        explicit conversion(user)
//        System.out.println((int) chh);

//        operation mein ascii value use hoti hai
        char z = 'b';
//        System.out.println(z+0);
//        System.out.println(z*1);
//        System.out.println(z+z);

//        Integer to Character
        int b = 65;
        System.out.println((char) b);
    }


}
