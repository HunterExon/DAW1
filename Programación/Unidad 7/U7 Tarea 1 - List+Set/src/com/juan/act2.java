package com.juan;

import java.util.*;

public class act2 {
    public static void main(String[] args) {
/*
Actividad 2: Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 2 |");
        System.out.println("===============");

        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(i, ((int) (Math.random() * 100) + 1));
        }

        //son dos formas de hacer lo mismo
        Collections.sort(lista);
        Collections.reverse(lista);

        Comparator<Integer> comparador = Collections.reverseOrder();
        lista.sort(comparador);
        //son dos formas de hacer lo mismo

        System.out.println(lista + "\n");
    }
}
