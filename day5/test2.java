import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //数组打乱
        int[] arr = {22, 33, 44, 55, 678};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int Index = r.nextInt(arr.length - 1);
            int temp = arr[i];
            arr[i] = arr[Index];
            arr[Index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
