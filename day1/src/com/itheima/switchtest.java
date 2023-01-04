package com.itheima;

import java.util.Scanner;

public class switchtest {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        /*switch(a){
            case 1:
                System.out.println("游泳");
                break;
            case 2:
                System.out.println("jianshen");
            break;
            default:
                System.out.println("relax");
                break;
        }*/

        switch(a){
            case 1-> System.out.println("right");
            case 2-> System.out.println("no");
            default -> System.out.println("unknown");
        }






    }
}
