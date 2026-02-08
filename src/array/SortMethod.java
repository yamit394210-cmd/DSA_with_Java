package array;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 0, 2, 22};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] x){
        int i = 0;
        while(i < x.length){
            System.out.print(x[i]+" ");
            i++; //stand alone
        }
        System.out.println();
    }
}
