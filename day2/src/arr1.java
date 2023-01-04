

public class arr1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 1};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
