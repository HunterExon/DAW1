package com.juan;

import com.sun.source.tree.Tree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class act7 {
    public static void main(String[] args) throws IOException {
/*
Actividad 7: Introducir por teclado, hasta que se introduzca "fin", una serie de
nombres que se insertarán por orden alfabético en una colección que no permita
repeticiones. Mostrar luego la lista de nombres por pantalla.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 7 |");
        System.out.println("===============");

        Scanner teclado = new Scanner(System.in);
        String frase;
        TreeSet<String> lista = new TreeSet<>();

        do {
            System.out.println("[ESCRIBE FIN PARA SALIR] Introduzca un nombre: ");
            frase = teclado.nextLine();
            frase = frase.trim();
            frase = frase.toLowerCase();
            if (!frase.toUpperCase().equals("FIN")) {
                lista.add(frase);
                System.out.println(lista);
            } else {
                System.out.println("------SALIENDO------");
                System.out.println("LISTA FINAL: " + lista);
                System.out.println("------SALIENDO------");
            }
        } while (!frase.toUpperCase().equals("FIN"));

        try {
            BufferedWriter fs = new BufferedWriter(new FileWriter(new File("fichero.txt"), true));
            Iterator it = lista.iterator();

            while(it.hasNext()){
                fs.write(it.next().toString());
                fs.newLine();
            }
            fs.close();
        } catch (IOException errorDeFichero) {
            System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
        }
    }
}
