package Sortings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 1, 4};
        int[] b = {2, 4, 9, 3, 1, 5};
//        ArrayList<Integer> common = new ArrayList<>();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        int i = 0;
//        int j = 0;
//        while (i == a.length-1 && j == b.length-1){
//            if (a[i] == b[j]){
//                common.add(a[i]);
//                i++;
//                j++;
//            }
//            else {
//                i++;
//            }
//        }
        ArrayList<Integer> common = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i <= a.length-1 && j <= b.length-1){
            if(a[i] == b[j]){
                common.add(a[i]);
                i++;
                j++;
            } else {
                i++;
            }
        }
//        System.out.print(common);
        for(int ele: common){
            System.out.print(ele+" ");
        }
    }
}
