package PracticeQuestions;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args){
//      Time Complexity = O(n*n)
        int[] arr = {3, 2, 1, 3, 1, 0, 3, 2, 2, -2, -2};
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0 ; i < n; i++){
            int count = 1;
            for (int j = i; j < n-1; j++){
                if(arr[i] == arr[j+1]){
                    count++;
                    i = j+1;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
