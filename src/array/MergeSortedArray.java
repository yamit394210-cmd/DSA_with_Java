package array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 ={1, 3, 5, 6, 8, 12};
        int[] arr2 = {2, 4, 7, 9};
        int[] merge = new int[10];

        int i = 0; // i = 0 1 2 3 4 5
        int j = 0; // j = 0 1 2 3 4
        int k = 0; // k = 0 1 2 3 4 5 6 7 8 9
        int size = merge.length;
        while(k < size){
            if(j == arr2.length){
                merge[k] = arr1[i];
                i++;
            }
            else if(i == arr1.length){
                merge[k] = arr2[j];
                j++;
            }
            else if(arr1[i] <= arr2[j]){
                merge[k] = arr1[i]; // [1, 2, 3, 4, 5, 6, 7, 8, 9]
                i++;
            }
            else{
                merge[k] = arr2[j];

                j++;
            }
            k++;
        }
        for (int ele: merge){
            System.out.print(ele+" ");
        }
    }
}
