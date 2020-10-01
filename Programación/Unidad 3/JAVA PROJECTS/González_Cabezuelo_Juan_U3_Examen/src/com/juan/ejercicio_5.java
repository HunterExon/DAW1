package com.juan;

import java.util.Arrays;

public class ejercicio_5 {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9};

        int[] resultado = vectoresExamen.unir(vector1, vector2);
        System.out.print("El resultado de 'unir' es este: ");
        System.out.println(Arrays.toString(resultado));

        resultado = vectoresExamen.rotar(vector1,2);
        System.out.print("El resultado de 'rotar' es este: ");
        System.out.println(Arrays.toString(resultado));
    }
}
