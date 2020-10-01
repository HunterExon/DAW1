package com.juan;

import java.io.*;
import java.util.Scanner;

public class Main {
    /*
    Ejercicio propuesto 11.2.1: Crea un programa que pida al usuario que introduzca frases,
    y guarde todas ellas en un fichero de texto. Deberá terminar cuando el usuario introduzca "fin".
     */
    public static void main(String[] args) throws IOException {
        String frase;
        Scanner teclado = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("|Introduzca frases para guardar en el archivo|");
        System.out.println("|        INTRODUZCA 'FIN' PARA SALIR         |");
        System.out.println("==============================================");

        do {
            System.out.println("ESCRIBA: ");
            frase = teclado.nextLine();

            if(!salida.equals("fin")) {
                BufferedWriter fs = new BufferedWriter(new FileWriter(new File("fichero.txt"), true));
                try {
                    fs.write(frase);
                    fs.newLine();
                    fs.close();
                } catch (IOException errorDeFichero) {
                    System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
                }
            }
            frase=frase.toLowerCase();
        }while(!frase.equals("fin"));
    }
}