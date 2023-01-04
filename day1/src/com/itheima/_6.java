package com.itheima;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        boolean d=a!=0&&a<b;
        System.out.println(d);

        boolean result= a!=0 && b!=0 && (a+b)%6==0 || a==6 || b==6 ;
    System.out.println(result);




    }
}
