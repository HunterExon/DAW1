package com.jdperez;

public class VectoresExamen {

    public static String[] unir(String[] v1,String[] v2) {

        String[] resultado = new String[v1.length+v2.length];

        for (int i = 0; i < resultado.length; i++) {
            if (i<v2.length) {
                resultado[i] = v2[i];
            } else {
                resultado[i] = v1[i-v2.length];
            }
        }

        return resultado;
    }

    public static String[] rotar(String[] v, int num) {

        String[] resultado = new String[v.length];

        for (int i = 0; i < v.length; i++) {
            resultado[(i+num)%v.length] = v[i];
        }

        return resultado;
    }
}
