package array;

public class FindSecondMax {
    public static void main(String[] args) {

        int[] arr = {-10, -20, -30, -40, -5};
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]> min){
                min = arr[i];

            }
        }
        System.out.println("First Max Element "+min);

        int found = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            else {
                if(arr[i] > found){
                    found = arr[i];
                }
            }
        }
        System.out.print("Second Max Element "+found);
    }
}
