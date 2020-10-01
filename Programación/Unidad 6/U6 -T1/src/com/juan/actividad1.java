package com.juan;

import java.io.*;
import java.util.Scanner;

public class actividad1 {

    public static void main(String[] args) throws IOException {
/*
Actividad1: Realizar un programa que solicite al usuario el nombre de un fichero de texto
y muestre su contenido en pantalla. Si no se proporciona ningún nombre de fichero,
la aplicación utilizará por defecto "prueba.txt".
*/
        String archivo;
        Scanner teclado = new Scanner(System.in);
        String linea=null;

        System.out.println("===========================================");
        System.out.println("|Introduzca el nombre del archivo de texto|");
        System.out.println("===========================================");

        System.out.println("ESCRIBA: ");
        archivo = teclado.nextLine();
        archivo=archivo.toLowerCase();
        File f = new File(archivo);

        if (archivo.equals("")){
            System.out.println("========================");
            System.out.println("|Mostrando 'prueba.txt'|");
            System.out.println("========================");

            BufferedReader fichero = new BufferedReader(new FileReader("prueba.txt"));

            while ((linea=fichero.readLine())!= null) {
                System.out.println(linea);
            }
            fichero.close();

        }else {
            if (!f.exists()){
                System.out.println("================================");
                System.out.println("|No he encontrado '" +archivo+"'|");
                System.out.println("================================");
            }else {
                System.out.println("=============================");
                System.out.println("|Leyendo fichero de texto...|");
                System.out.println("=============================");

                try {
                    BufferedReader fichero = new BufferedReader(new FileReader(archivo));

                    while ((linea = fichero.readLine()) != null) {
                        System.out.println(linea);
                    }
                    fichero.close();
                } catch (IOException errorDeFichero) {
                    System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
                }
            }
        }
    }
}
