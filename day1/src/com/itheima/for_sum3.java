package com.itheima;

import java.util.Scanner;

public class for_sum3 {
    public static void main(String[] args) {
//录入两个数字，统计能被3和5整除的数量
        Scanner sc = new Scanner(System.in);
        System.out.println("start");
        int start = sc.nextInt();
        System.out.println("end");
        int end = sc.nextInt();


        int sum2 = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum2 = sum2 + 1;
            }

        }
        System.out.println(sum2);
    }
}
