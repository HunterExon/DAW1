package com.juan;

import java.util.Scanner;
import java.util.Random;

public class ej1 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        int numero=0;
        int intentos=10;
        int misterio = aleatorio.nextInt(100);
        int limite = intentos;

        System.out.println("************");
        System.out.println("|BIENVENIDO|");
        System.out.println("************");
        System.out.println("¡Averiguemos el número secreto!");

        for(int i=0;i<limite;i++) {
            System.out.printf("***%d intentos***",intentos);
            System.out.println();
            System.out.println("1.Introduzca un numero");
            System.out.println("2.Salir");
            System.out.println("Elija una opción: ");

            do {
                opcion = teclado.nextInt();
                if (opcion != 1 && opcion != 2) {
                    System.out.println("Por favor, introduzca el numero correctamente");
                }
            } while (opcion != 1 && opcion != 2);


            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el numero: ");
                    numero = teclado.nextInt();
                    if (numero == misterio) {
                        System.out.flush();
                        System.out.println("****CONGRATULATIONS****");
                    } else {
                        intentos--;
                        System.out.printf("ERROR: Le quedan %d intentos", intentos);
                        System.out.println();
                        if(intentos==0){
                            System.out.println("---YOU LOSE---");
                            System.out.println("El numero secreto era " + misterio);
                            intentos=0;
                            break;
                        }else {
                            if (numero > misterio) {
                                System.out.printf("El numero %d es mayor que el SECRETO", numero);
                                System.out.println();
                            } else {
                                System.out.printf("El numero %d es menor que el SECRETO", numero);
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("---YOU LOSE---");
                    System.out.println("El numero secreto era " + misterio);
                    intentos=0;
            }
        }
    }
}
