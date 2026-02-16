package array;

public class MergeSorted1 {
    public static void main (String[] args){
        int[] a = {2, 4, 9, 18, 27, 39};
        int[] b = {1, 2, 3, 5, 7, 9, 11, 33};
        int[] merged = new int[a.length+b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(k < merged.length){
            if(i == a.length){
                merged[k] = b[j];
                j++;
            }
            else if(j == b.length){
                merged[k] = a[i];
                i++;
            }
            else if(a[i] <= b[j]){
                merged[k] = a[i];
                i++;
            }
            else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        for(int ele: merged){
            System.out.print(ele+" ");
        }
    }
}
