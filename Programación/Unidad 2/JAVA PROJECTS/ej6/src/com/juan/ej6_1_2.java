package com.juan;

public class ej6_1_2 {
    public static void main(String[] args) {
        //PARES
        int i=20;
        while(i>=2) {
            System.out.println(i);
            i=i-2;
        }
        System.out.println("--------------------");
        //IMPARES
        int x=19;
        while(x>=1) {
            if(x%2!=0) {
                System.out.println(x);
            }
            x--;
        }
    }
}
