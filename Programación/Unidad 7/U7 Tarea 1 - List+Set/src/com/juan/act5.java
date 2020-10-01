package com.juan;

import com.sun.source.util.Trees;

import java.util.*;

public class act5 {
    public static void main(String[] args) {
/*
Actividad 5: Crear una colección de 20 números enteros aleatorios distintos menores
que 100, guardarlos por orden decreciente a medida que se vayan generando, y mostrar
la colección por pantalla.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 5 |");
        System.out.println("===============");

        /*
        Set<Integer> distintos=new TreeSet<>(new Comparator<Integer>() { //comparator en el constructor con clase anonima
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        }); //aplico el comparator, porque con el .sort() y .reverse() no me dejaba

        while(distintos.size()<20){ //hasta que no tenga 20
            //relleno con 20 numeros
            distintos.add((int)(Math.random()*100)); //de 0 a 99
        }

        //mostramos el conjunto sin ordenar
        System.out.print(distintos);
         */

        Set<Integer> lista = new LinkedHashSet<>();
        while (lista.size() < 20) {
            lista.add((int) (Math.random() * 100) + 1);
            List<Integer> lista2 = new ArrayList<>(lista);
            Collections.sort(lista2);
            Collections.reverse(lista2);
            lista.clear();
            lista.addAll(lista2);
            System.out.println(lista);
        }
    }
}
