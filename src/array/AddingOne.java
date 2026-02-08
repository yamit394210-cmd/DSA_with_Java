package array;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        ArrayList<Integer> ans = new ArrayList<>();

        System.out.println(arr);

        int num = 1;
        for (int i = arr.size()-1; i >=0; i--){ //i= 0 1 2 3
            num = arr.get(i)+num; // num = 10 10 10 1
            if(num >= 10){
               ans.add(num%10); // [0,0,0]
               num = 1;
            } else {
                ans.add(num);
                num = 0;
            }
        }
        if(num == 1){
            ans.add(num);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
