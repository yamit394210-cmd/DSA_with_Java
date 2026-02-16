package basic;

public class BODMAS {
    public static void main(String[] args) {
//       /, *, % > +, -
//        Associativity Rule(left to right)
        int x = 4*2/3+2-1%5/3-(2*(20+1-22));//2+2-0+2=6
        System.out.println(x);
    }
}
