package PracticeQuestions;

public class LargestAndSmallest {
    public static void main(String[] args) {
//      Time Complexity = O(n)
        int[] arr = {4, 1, 6, 5, -3, 22, 0};
        int n = arr.length;
            int max = Integer.MIN_VALUE, maxdex = -1;
            int min = Integer.MAX_VALUE, mindex = -1;
            for (int j = 0; j < n; j++){ // j = 0 1 2 3 4 5 6 7
                if(arr[j] > max){
                    max = arr[j]; // max = 4 6 22
                    maxdex = j;
                }
                if(arr[j] < min){
                    min = arr[j]; // min = 4 1 -3
                    mindex = j;
                }
            }
        System.out.println("Largest is : "+max);
        System.out.println("Smallest is : "+min);

    }
}
