package com.juan;

public class ej6_2_2 {
    public static void main(String[] args) {
        //PARES
        int i=20;
        do {
            System.out.println(i);
            i=i-2;
        }while(i>=2);
        System.out.println("--------------------");
        //IMPARES
        int x=19;
        do{
            if(x%2!=0) {
                System.out.println(x);
            }
            x--;
        }while(x>=1);
    }
}
