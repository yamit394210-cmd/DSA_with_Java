package if_else;

public class TernaryOperator {
    public static void main(String[] args) {
        //Greatest Three
        int a = 20;
        int b = 20;
        int c = 30;

        System.out.println((a>b)? ((a>c)? "a":"c"):((b>c)? "b":"c"));
    }
}
