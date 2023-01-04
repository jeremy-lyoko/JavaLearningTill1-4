import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //模拟抽奖
        //建立数组
        int[] arr = {2, 588, 888, 1888, 20000};
        //定义新数组
        int[] newArr = new int[arr.length];


        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(newArr.length);
            int price = arr[randomIndex];
            boolean flag = contains(newArr, price);
            if (!flag) {
                newArr[i] = arr[i];
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }

    }

    public static boolean contains(int[] arr, int price) {
//输入数组和奖项判断是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }
}
