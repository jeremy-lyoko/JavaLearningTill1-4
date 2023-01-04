import java.util.Random;
import java.util.Scanner;

public class test3 {
    //双色球模拟
    public static void main(String[] args) {
        int[] arr = create();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] userArr = user();
        for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i] + " ");
        }
        System.out.println();
        //判断红球篮球中奖个数
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userArr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (userArr[i] == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }
        if (arr[arr.length-1] == userArr[userArr.length-1])
            blueCount++;
        System.out.println(redCount);
        System.out.println(blueCount);

    }

    public static int[] create() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int num = r.nextInt(33) + 1;
            boolean flag = contain(arr, num);
            if (!flag) {
                arr[i] = num;
                i++;
            }
        }
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }

    public static boolean contain(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] user() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            int redNum = sc.nextInt();
            boolean flag = contain(arr, redNum);
            if (redNum > 0 && redNum <= 33) {
                if (!flag) {
                    arr[i] = redNum;
                    i++;
                } else {
                    System.out.println("输入范围错误");
                }
            } else {
                System.out.println("输入范围错误");
            }

        }
        while (true) {
            int blue = sc.nextInt();
            if (blue > 0 && blue < 17) {
                arr[6] = blue;
                break;
            }

        }
        return arr;
    }
}
