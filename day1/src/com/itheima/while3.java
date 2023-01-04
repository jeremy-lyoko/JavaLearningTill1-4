package com.itheima;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {

//回文数，正反一致的对称数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数");
        int num = sc.nextInt();
        int num0 = num;
        int ge = 1;
        int sum = 0;

        while (num > 0) {

            ge = num % 10;//求个位
            num = num / 10;//去掉个位
            sum = sum * 10 + ge;//将个位放到新数字开头

        }
        System.out.println(sum);
        System.out.println(num0 == sum);
    }
}
