package com.itheima;

import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
//求质数
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for (int i = 2; i < n; i++) {
            flag=true;
            if(n%i==0){
                System.out.println("合数");flag=false;break;
            }

        }
        if(flag)
        System.out.println("质数");





    }
}
