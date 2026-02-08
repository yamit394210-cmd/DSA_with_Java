package PracticeQuestions;

public class CheckArraySorted {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 6, 8, 9, 0};
        int n = arr.length;
        boolean issorted = true;
        for (int i = 0 ; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted == true){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array not Sorted");
        }
    }
}
