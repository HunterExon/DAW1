package com.juan;

import java.io.*;
import java.util.Scanner;

public class actividad6 {

    public static void main(String[] args) throws IOException {
/*
Actividad6: Un libro de firmas es útil para recoger todas las personas
que han pasado por un determinado lugar. Crear una aplicación que permita
mostrar el libro de firmas o insertar un nuevo nombre (comprobando que no
se encuentre repetido). Llamaremos al fichero firmas.txt.
*/
        Scanner teclado = new Scanner(System.in);
        String linea=null;
        String firma;
        int opcion;
        int cont=0;

        BufferedReader bf = new BufferedReader(new FileReader("firmas.txt"));

        while ((linea = bf.readLine()) != null) {
            cont++;
        }
        linea=null;

        do {
            do {
                System.out.println("===============================");
                System.out.println("|Selecciona una opción        |");
                System.out.println("|-----------------------------|");
                System.out.println("|1-Mostrar el libro de firmas |");
                System.out.println("|2-Introducir una nueva firma |");
                System.out.println("|0-Salir                      |");
                System.out.println("===============================");
                opcion = teclado.nextInt();
                if (opcion != 1 && opcion != 2 && opcion != 0) {
                    System.out.println("--------------ERROR---------------");
                    System.out.println("| Introduzca una opción correcta |");
                    System.out.println("--------------ERROR---------------");
                }
            } while (opcion != 1 && opcion != 2 && opcion != 0);
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        bf = new BufferedReader(new FileReader("firmas.txt"));
                        while ((linea = bf.readLine()) != null) {
                            System.out.println(linea);
                        }
                        bf.close();
                    } catch (IOException errorDeFichero) {
                        System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Introduzca su nombre");
                        firma = teclado.nextLine();
                        cont++;

                        BufferedWriter fs = new BufferedWriter(new FileWriter(new File("firmas.txt"), true));
                        fs.newLine();
                        fs.write((cont-3)+"-"+ firma);
                        fs.close();
                    } catch (IOException errorDeFichero) {
                        System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
                    }
                default:
                    break;
            }
        }while(opcion!=0);
    }
}
