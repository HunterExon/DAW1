package com.juan;

import java.io.*;
import java.util.Scanner;

public class actividad3 {

    public static void main(String[] args) throws IOException {
/*
Actividad3: Crear un programa que duplique el conenido de un fichero.
Realizar dos versiones:
-Duplicaremos el fichero original.txt en uno que se llame copia.txt
-Pedir el nombre del fichero fuente y duplicarlo en un fichero
con el mismo nombre con el prefijo "copia_de".
*/
        Scanner teclado = new Scanner(System.in);
        String original;
        String copia;
        String linea=null;
        int opcion;

        do {
            System.out.println("===============================");
            System.out.println("|Selecciona una opción        |");
            System.out.println("|-----------------------------|");
            System.out.println("|1-De original.txt a copia.txt|");
            System.out.println("|2-Introduce fichero fuente   |");
            System.out.println("===============================");
            opcion = teclado.nextInt();
            if(opcion!=1 && opcion!=2){
                System.out.println("-------------ERROR--------------");
                System.out.println("|Introduzca una opción correcta|");
                System.out.println("-------------ERROR--------------");
            }
        }while(opcion!=1 && opcion!=2);
        teclado.nextLine();

        switch (opcion) {
            case 1:
                original = "original.txt";
                copia = "copia.txt";
                break;
            case 2:
                System.out.println("Introduce el nombre del fichero origen: ");
                original = teclado.nextLine();
                copia = "copia_de_" + original;
                break;
            default:
                original="";
                copia="";
                break;
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(original));
            BufferedWriter bw = new BufferedWriter(new FileWriter(copia));

            while ((linea=br.readLine())!= null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException errorDeFichero) {
            System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
        }
    }
}
