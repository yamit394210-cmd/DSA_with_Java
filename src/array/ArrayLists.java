package array;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
//        ArrayList - Dynamic array means not a fixed size
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(10);
//        Printing
        System.out.println(arr.get(2));
//        Updating
        arr.set(2, 60);
        int n = arr.size();
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
//        For Each loop as it is
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(arr);
        arr.remove(2);
        System.out.print(arr);
    }
}
