package methods;

public class Syntax {
    public static int amit(int a){
        System.out.println("Amit");
        return abc(a);
    }
    public static int abc(int a){
        return 45;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(amit(x));
    }
}
