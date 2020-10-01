package com.juan;

import java.util.Scanner;

public class libreria_cadenas {
    public static boolean contiene(String a, String b) {
        if (b.contains(a)) {
            return true;
        } else {
            return false;
        }
    }

    public static String extraer(String a, int inicio, int fin) {
        String resultado = "";

        for (int i = 0; i < a.length(); i++) {
            if (i >= inicio && i <= fin) {
                resultado = resultado + a.charAt(i);
            }
        }
        return resultado;
    }

    public static String[] dividir(String a, int partes) {
        String[] resultado = new String[partes];
        int num_partes = 0;
        int num_letras = 0;

        if(partes<a.length()) {
            while (num_partes!=partes) {
                resultado[num_partes] = a.substring(num_letras,(a.length()/partes)+num_letras);
                num_letras = num_letras + (a.length()/partes);
                num_partes++;
            }
            if (a.length()%partes!=0) {
                resultado[num_partes-1] = a.substring(num_letras-(a.length()/partes));
            }
        }else{
            return resultado;
        }
        return resultado;
    }

    public static String intercalar(String a, String b) {
        String resultado = "";
        int j = 0;
        int k = 0;

        for (int i = 0; i < a.length() + b.length(); i++) {
            if (a.length() > b.length()) {
                if (i % 2 != 0 && j < a.length() && k < b.length()) {
                    resultado = resultado + a.charAt(j);
                    j++;
                } else if (i % 2 == 0 && k < b.length()) {
                    resultado = resultado + b.charAt(k);
                    k++;
                } else {
                    resultado = resultado + a.charAt(j);
                    j++;
                }
            } else {
                if (i % 2 != 0 && j < a.length()) {
                    resultado = resultado + a.charAt(j);
                    j++;
                } else if (i % 2 == 0 && k < b.length() && j < a.length()) {
                    resultado = resultado + b.charAt(k);
                    k++;
                } else {
                    resultado = resultado + b.charAt(j);
                    j++;
                }
            }
        }
        return resultado;
    }

    public static String convertir(String a, String b) {
        b=b.toLowerCase();

        if(b.equals("mayus")){
            a=a.toUpperCase();
        }else if(b.equals("minus")){
            a=a.toLowerCase();
        }
        return a;
    }
}