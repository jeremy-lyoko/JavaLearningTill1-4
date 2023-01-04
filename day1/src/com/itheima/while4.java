package com.itheima;

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {

//不使用乘除来计算除法
        Scanner sc=new Scanner(System.in);
        System.out.println("输入两个数");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int shang=0;
        int yu=0;
        while(n1>=n2){
            n1=n1-n2;
            shang++;


        }

        System.out.println("n1/n2商"+shang+"余"+n1);

    }
}
