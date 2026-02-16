package array;

public class ForEach {
    public static void main(String[] args) {
//        Used to traverse on array or data structure
//        Can not change the array elements
        int[] arr = {10, 20, 2, 30, 40};
//        for(int x : arr){
//            System.out.print(x+" ");
//        }

        for(int x : arr){
           arr[1]= x;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
