package com.itheima;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
//求平方根,只保留整数
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        for(i=1;i<n;i++){
           // if(i*i<=n){continue;}
            if(i*i>n){break;}
        }
            System.out.println(i-1);

    }
}
