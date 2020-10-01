package com.juan;

public class ejercicio_5 {
    public static int aleatorioDeArray(int[] a){
        int aleatorio = (int) (Math.random() * a.length);


        return a[aleatorio];
    }

    public static void main(String[] args) {
        int[] prueba = {1, 2, 3, 4, 5, 6, 7, 87, 13, 76, 12};

        System.out.println("=="+aleatorioDeArray(prueba)+"==");
    }
}