package com.juan;

public class ejercicio_4 {
    public static String convierteArrayEnString(int[] a){
        String frase="";

        for (int i=0;i<a.length;i++){
            frase=frase+(a[i]);
        }
        return frase;
    }

    public static void main(String[] args) {
        int[] prueba = {1, 2, 3, 4, 5, 6, 7, 87, 13, 76, 12};

        System.out.print(convierteArrayEnString(prueba));
    }
}
