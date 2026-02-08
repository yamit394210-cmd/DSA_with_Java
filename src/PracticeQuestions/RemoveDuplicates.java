package PracticeQuestions;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        Time Complexity = O(n*n)
//        Space Complexity = O(2)
//        Auxillary Complexity = O(1)
        int[] arr = {0, 1, 1, 1, 2, 2, 4, 5, 5};
        ArrayList<Integer> brr = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            boolean isadded = true;
            for (int j = i; j <n-1; j++){
                if (arr[i] == arr[j+1]){
                    i = j+1;
                    if(isadded == true){
                        brr.add(arr[i]);
                        isadded = false;
                    }
                }
                else if(isadded == true){
                    brr.add(arr[i]);
                    break;
                }
                else break;
            }
        }
//        int i = 0;
//        for (int ele : brr){
//            arr[i]=ele;
//            i++;
//        }

//        for (int x : arr){
//            System.out.print(x+" ");
//        }

    }
}
