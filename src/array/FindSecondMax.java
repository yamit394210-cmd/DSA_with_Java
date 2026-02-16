package array;

public class FindSecondMax {
    public static void main(String[] args) {

        int[] arr = {-10, -20, -30, -40, -5};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] == max){
                continue;
            }
            else if(arr[j] > secondMax){
                secondMax = arr[j];
            }
        }
        System.out.print("Second Max Element "+ secondMax);
    }
}
