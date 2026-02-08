package Sortings;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 8, 6, 2, 7, -2};
//      int[] arr = {0, 1, 3, 4, 5, 6, 7, 8};
        //break = apne parent loop se bahar aata hai
        //return = apne parent function se

        int n = arr.length;
        //total number of operations = (n-1)(n-1)
        //time complexity = O(n)
//        for (int i = 0; i < n-1 ; i++){
//            for (int j = 0; j < n-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++){
//            System.out.print(arr[i]+" ");
//        }


        //Bubble Sort ( Thoda better)
        //total number of operations = n(n-1)/2 which is less than (n-1)(n-1)
//        for(int i = 0; i < n-1; i++){
//            for (int j = 0; j < n-1-i; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++){
//            System.out.print(arr[i]+" ");
//        }


        //Bubble sort (optimized)
        for(int i = 0; i < n-1; i++) {
            //for checking array is sorted or not on every passes
            boolean issorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    issorted = false;
                }
            }
            if (issorted == true) {
                break;
            }
        }
        //Printing Sorted Array
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
