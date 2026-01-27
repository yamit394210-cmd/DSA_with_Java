package basic;

public class ModulusProperties {
    public static void main(String[] args) {
        //1. a % b = a if(a < b)
        //2. a % (-b) = a % b
        //3. (-a) % b = -(remainder)
        //4. (-a) % (-b) = -(remainder)
        //remainder ka sense int mein banta hai double mein nahi

        int a = -3;
        int b = -5;
        System.out.println(a%b);
    }
}
