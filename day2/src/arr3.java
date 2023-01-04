import java.util.Random;

public class arr3 {
    //打乱数组的数据
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int a=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}

