package com.juan;

import java.io.*;
import java.util.Scanner;

public class actividad2 {

    public static void main(String[] args) throws IOException {
/*
Actividad2: Diseñar una aplicación que pida al usuario su nombre y edad.
Estos datos deben guardarse en el fichero "datos.txt". Si este fichero
existe, debe borrarse su contenido, y en caso de no existir, debe crearse.
*/
        String nombre;
        int edad;
        Scanner teclado = new Scanner(System.in);
        String linea=null;

        System.out.println("======================");
        System.out.println("|Introduzca su nombre|");
        System.out.println("======================");
        nombre = teclado.nextLine();

        System.out.println("====================");
        System.out.println("|Introduzca su edad|");
        System.out.println("====================");
        edad = teclado.nextInt();


        try {
            BufferedWriter fs = new BufferedWriter(new FileWriter(new File("datos.txt")));
            fs.write("Nombre: " + nombre);
            fs.newLine();
            fs.write("Edad: " + edad);
            fs.newLine();
            fs.close();
        } catch (IOException errorDeFichero) {
            System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
        }

        BufferedReader fichero = new BufferedReader(new FileReader(new File("datos.txt")));
        while ((linea=fichero.readLine())!= null) {
            System.out.println(linea);
        }
        fichero.close();
    }
}
