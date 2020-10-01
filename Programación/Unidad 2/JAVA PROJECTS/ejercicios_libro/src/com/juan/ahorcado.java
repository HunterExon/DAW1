package com.juan;

import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            String secreta;
            String palabra ="1";
            String frase;
            char letra;
            int opcion;
            int intentos =7;


        System.out.println("========================");
        System.out.println("||JUGUEMOS AL AHORCADO||");
        System.out.println("========================");
        System.out.println("   _______");
        System.out.println("  |      O");
        System.out.println("  |     ¡|¡");
        System.out.println("  |      |");
        System.out.println("  |     //");
        System.out.println("  |");
        System.out.println("__|___________");
        System.out.println("J1 - > Introduzca la palabra secreta: ");
        secreta = teclado.nextLine();
        /*----------------------------------------------------------------*/
        System.out.println("================");
        System.out.println("||TURNO DEL J2||");
        System.out.println("================");
        /*----------------------------------------------------------------*/
        System.out.printf("%d letra(s) tiene la palabra secreta: ",secreta.length());
        for(int k=0;k<secreta.length();k++){
            System.out.print("_ ");
        }
        frase=secreta;
        for(int l=0;l<frase.length();l++){
            StringBuilder frase2 = new StringBuilder(frase);
            frase2.setCharAt(l,'-');
            frase = frase2.toString();
        }

        /*----------------------------------------------------------------*/

        do {
            System.out.println();
            System.out.printf("------MENU (%d intentos)------\n", intentos);
            System.out.println("La palabra es: " + frase);
            System.out.println();
            System.out.println("1-Introducir letra");
            System.out.println("2-Intentar resolver");
            System.out.print("--Elija una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca una letra: ");
                    palabra = teclado.next();
                    letra = palabra.charAt(0);

                    for (int i = 0; i < secreta.length(); i++) {
                        if (letra == secreta.charAt(i)) {
                            StringBuilder frase2 = new StringBuilder(frase);
                            frase2.setCharAt(i, letra);
                            frase = frase2.toString();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduzca una palabra: ");
                    palabra = teclado.next();
                    if (palabra.equals(secreta)) {
                        break;
                    } else {
                        System.out.print("INCORRECTO - Sigue intentándolo");
                    }
            }
            if (!palabra.equals(secreta) || frase.equals(secreta)) {
                if (intentos == 7) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("__|___________");
                }
                if (intentos == 6) {
                    System.out.println();
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("__|___________");
                }
                if (intentos == 5) {
                    System.out.println("   _______");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("__|___________");
                }
                if (intentos == 4) {
                    System.out.println("   _______");
                    System.out.println("  |      O");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("__|___________");
                }
                if (intentos == 3) {
                    System.out.println("   _______");
                    System.out.println("  |      O");
                    System.out.println("  |     ¡|¡");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("__|___________");
                }
                if (intentos == 2) {
                    System.out.println("   _______");
                    System.out.println("  |      O");
                    System.out.println("  |     ¡|¡");
                    System.out.println("  |      |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("__|___________");
                }
            }
            intentos--;
        } while (intentos > 0 && !palabra.equals(secreta));

        if (intentos == 0 && !palabra.equals(secreta)) {
            System.out.println();
            System.out.println("----HAS PERDIDO EL JUEGO----");
            System.out.println("   _______");
            System.out.println("  |      x");
            System.out.println("  |     ¡|¡");
            System.out.println("  |      |");
            System.out.println("  |     //");
            System.out.println("  |");
            System.out.println("__|___________");
            System.out.print("----LA PALABRA SECRETA ERA: ");
            System.out.print(secreta);
        } else {
            System.out.println();
            System.out.println("=======================");
            System.out.println("||ENHORABUENA GANASTE||");
            System.out.println("=======================");
        }
    }
}