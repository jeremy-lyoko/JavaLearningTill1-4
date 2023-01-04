import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //评委打分0-100
        //6个评委分数，去头尾，求剩下4个的平均值
        int[] arr = getScores();
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = ave(max, min, arr);
        double ave=sum/4;
        System.out.println(ave);


    }

    public static int[] getScores() {
        int[] score = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        for (int i = 0; i < 6; ) {
            int scores = sc.nextInt();
            if (scores < 101 & scores >= 0) {
                score[i] = scores;
                i++;
            } else System.out.println("范围错误");
        }
        return score;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int ave(int max, int min, int[] arr) {
        int ave = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max & arr[i] != min) {
                ave = ave + arr[i];
            }
        }
        return ave;
    }
}
