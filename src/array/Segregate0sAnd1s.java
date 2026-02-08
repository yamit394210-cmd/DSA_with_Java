package array;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 0 , 1, 0, 1, 1, 0, 1, 0, 0, 1};
//        int n = arr.length;
//        int count0 = 0;
//        int count1 = 1;
//        for (int i = 0; i < n; i++){
//            if(arr[i] == 0){
//                count0 += 1;
//            }
//            else{
//                count1 += 1;
//            }
//        }
////        Arranging 0s to 1s
//        for (int i = 0; i < count0; i++){
//            arr[i] = 0;
//        }
//        for (int i = count0; i < n; i++){
//            arr[i] = 1;
//        }
//
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//        By Swapping
        int j = arr.length-1;
        int i = 0;
        while(i < j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(i > j) break;
            else if(arr[i] == 1 && arr[j] ==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
