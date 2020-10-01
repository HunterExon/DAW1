package com.juan;

import java.util.*;

public class act3 {
    public static void main(String[] args) {
    /*
Actividad 3: Crear una colección de 20 números enteros aleatorios menores
que 10, guardarlos por orden decreciente a medida que se vayan generando
y mostrar la colección por pantalla.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 3 |");
        System.out.println("===============");

        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(i, ((int) (Math.random() * 10) + 1));
            Collections.sort(lista);
            Collections.reverse(lista);
            System.out.println(lista);
        }
    }
}
