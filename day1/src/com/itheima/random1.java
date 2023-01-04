package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class random1 {
    public static void main(String[] args) {
//猜数字
        Random r=new Random();
        int n1=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int n2=0;

        while (n2!=n1) {
            System.out.println("请输入1-100");
             n2=sc.nextInt();
             if(n2>n1)
            System.out.println("高了");
             else if(n2<n1)
            System.out.println("低了");
        }
        System.out.println("yes!");


    }
}
