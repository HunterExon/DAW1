package com.juan;

import java.util.*;

public class Union_Interseccion {
    public static void main(String[] args) {
    /*
    Crear dos conjuntos de 5 terminos y realizar las funciones: union, intersección y diferencia.
    */
        System.out.println("===================");
        System.out.println("| ACTIVIDAD EXTRA |");
        System.out.println("===================");

        String[] l1 = {"ana", "jose", "rosa", "umberto", "jose", "alberto", "pedro", "jose", "rosa", "sevilla"};
        String[] l2 = {"tomares", "sevilla", "mairena", "umberto", "jose", "mairena"};
        Set<String> lista1 = new LinkedHashSet<>(Arrays.asList(l1));
        Set<String> lista2 = new LinkedHashSet<>(Arrays.asList(l2));

        System.out.println("UNION: "+conjuntoUnion(lista1, lista2));
        System.out.println("DIFERENCIA: "+conjuntoDiferencia(lista1, lista2));
        System.out.println("INTERSSECION: "+conjuntoInterseccion(lista1, lista2));
    }

    private static Set<String> conjuntoUnion(Set<String> lista1, Set<String> lista2) {
        Set<String> conjunto = new LinkedHashSet<>(lista1);
        conjunto.addAll(lista2);

        return conjunto;
    }
    private static Set<String> conjuntoInterseccion(Set<String> lista1, Set<String> lista2){
        Set<String> conjunto = new LinkedHashSet<String>(conjuntoUnion(lista1, lista2));

        conjunto.removeAll(conjuntoDiferencia(lista1, lista2));
        conjunto.removeAll(conjuntoDiferencia(lista2, lista1));

        return conjunto;
    }
    private static Set<String> conjuntoDiferencia(Set<String> lista1, Set<String> lista2){
        Set<String> conjunto = new LinkedHashSet<>(lista1);
        conjunto.removeAll(lista2);

        return conjunto;
    }
}
