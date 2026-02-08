package PracticeQuestions;

public class SecondLargest {
    public static void main(String[] args) {
//        Time Complexity = O(n)
        int[] arr = {4, 1, 6, 5, -3, 22, 0};
        int n = arr.length;
        int mindex = -1;
        int second = -1;
        for (int i = 0; i < 2; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++){
                if(j == second){
                    continue;
                }
                else if(arr[j] > max){
                    max = arr[j];
                    mindex = j;
                }
            }
            second = mindex;
                System.out.println("Largest : "+max);
        }

    }
}
