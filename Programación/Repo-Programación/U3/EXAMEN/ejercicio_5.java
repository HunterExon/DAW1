package com.juan;

public class ejercicio_5 {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9};

        int[] resultado = vectoresExamen.unir(vector1, vector2);
        System.out.print("El resultado de 'unir' es este: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        System.out.println();

        resultado = vectoresExamen.rotar(vector1,2);
        System.out.print("El resultado de 'rotar' es este: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
