package PracticeQuestions;

public class FindFloorSqrt {
    public static void main(String[] args) {
//        Time Complexity = O(squareroot Of n)
//        For Integer Numbers
        int n = 9;
        int root = 0;
        int i = 1;
        while(i <= n){
            if(i*i > n) break;
            root = i;
            i++;
        }
        System.out.println(root);
    }
}
