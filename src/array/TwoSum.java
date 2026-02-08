package array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -3};
        int target = 5;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Founded"+ i +" "+ j);
                }
            }
        }
        System.out.print("Not Founded");
    }
}
