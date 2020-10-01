package com.juan;

import java.util.*;

public class act1 {
    public static void main(String[] args) {
/*
Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100,
y guardarlos en el orden en que se vayan generando; mostrar por pantalla dicha
lista una vez creada. Ordenarla en sentido creciente y volverla a mostrar por pantalla.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 1 |");
        System.out.println("===============");

        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(i, ((int) (Math.random() * 100) + 1));
        }

        System.out.println(lista);

        //son dos formas de hacer lo mismo
        Collections.sort(lista);

        lista.sort(Integer::compareTo);
        //son dos formas de hacer lo mismo

        System.out.println(lista + "\n");
    }
}
