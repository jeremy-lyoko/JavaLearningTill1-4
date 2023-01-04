package com.itheima;

public class for_sum2 {
    public static void main(String[] args) {


        int sum2=0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                sum2=sum2+i;
            }

        }
        System.out.println("偶数和"+sum2);
    }
}
