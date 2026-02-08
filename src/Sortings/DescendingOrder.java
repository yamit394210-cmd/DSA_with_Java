package Sortings;

public class DescendingOrder {
    public static void main(String[] args) {
        //Time Complexity Cases
        //Best Case = O(n)
        //Average Case = O(n*n)
        //Worst Case = O(n*n)
        int[] arr = {5, 3, 0, 8, 6, 2, 7, -2};
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            boolean issorted = true;
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    issorted = false;
                }
            }
            if(issorted == true){
                break;
            }
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
