package Sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 8, 6, 2, 7, -2};
        int n = arr.length;
        boolean issorted = true;
//      Check Array is sorted or not
        for (int i = 0; i < n-1; i++){
            if (arr[i] > arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted == true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }

//      for(int i = 0; i < n-1; i++){
//          for(int j = 0; j < n-i-1; j++){
//              if(arr[j] > arr[j+1]){
//                  int temp = arr[j];
//                  arr[j] = arr[j+1];
//                  arr[j+1] = temp;
//              }
//          }
//      }
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }

    }
}
