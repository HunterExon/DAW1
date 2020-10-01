package com.juan;

import java.util.*;

public class act6 {
    public static void main(String[] args) {
/*
Actividad 6: Introducir por teclado, hasta que se introduzca "fin", una serie de
nombres que se insertarán en una colección, de forma que se conserve el orden de
inserción y que no puedan repetirse. Mostrar la estructura por pantalla.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 6 |");
        System.out.println("===============");

        Scanner teclado = new Scanner(System.in);
        String frase;
        Set<String> lista = new LinkedHashSet<>();

        do {
            System.out.println("[ESCRIBE FIN PARA SALIR] Introduzca un nombre: ");
            frase = teclado.nextLine();
            frase=frase.trim();
            frase=frase.toLowerCase();
            if(!frase.toUpperCase().equals("FIN")){
                lista.add(frase);
            }else{
                System.out.println("------SALIENDO------");
            }
            System.out.println(lista);
        }while(!frase.toUpperCase().equals("FIN"));
        System.out.println("LISTA FINAL: "+lista);
    }
}
