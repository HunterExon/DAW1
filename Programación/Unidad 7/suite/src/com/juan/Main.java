package com.juan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Aspirante> aspirantes = new TreeSet<>();

        Prueba p1 = new Prueba ("Escrito", Prueba.TIPO.ESCRITO);
        Prueba p2 = new Prueba ("Oral", Prueba.TIPO.ORAL);

        Aspirante a1 = new Aspirante("999999", "Rosa", 666666);
        Aspirante a2 = new Aspirante("888888", "Pepe", 555555);
        Aspirante a3 = new Aspirante("777777", "Jose", 444444);
        Aspirante a4 = new Aspirante("666666", "Juan", 333333);
        Aspirante a5 = new Aspirante("555555", "Alba", 222222);

        a1.addCalificacion(new Calificacion(p1, 8));
        a1.addCalificacion(new Calificacion(p2, 6));

        a2.addCalificacion(new Calificacion(p1, 5));
        a2.addCalificacion(new Calificacion(p2, 4));

        a3.addCalificacion(new Calificacion(p1, 9));
        a3.addCalificacion(new Calificacion(p2, 3));

        a4.addCalificacion(new Calificacion(p1, 2));
        a4.addCalificacion(new Calificacion(p2, 0));

        a5.addCalificacion(new Calificacion(p1, 7));
        a5.addCalificacion(new Calificacion(p2, 6));

        aspirantes.add(a1);
        aspirantes.add(a2);
        aspirantes.add(a3);
        aspirantes.add(a4);
        aspirantes.add(a5);


    }
}
