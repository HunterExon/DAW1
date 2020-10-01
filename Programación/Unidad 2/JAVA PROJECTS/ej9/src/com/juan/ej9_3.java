package com.juan;

import java.util.Scanner;

public class ej9_3 {
    public static void main(String[] args) {
        /*
Actividad 9-3: En una segunda versión del programa anterior,
se debe escribir "Acertaste" o "Menor" o "Mayor", según
la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
*/
        Scanner teclado = new Scanner(System.in);
        String contrasenia = "1";
        String pass = "0";
        int intentos, opcion;


        System.out.println("=================");
        System.out.println("||BIENVENIDO J1||");
        System.out.println("=================");
        System.out.println("Introduzca la contraseña: ");
        contrasenia = teclado.nextLine();
        System.out.println("Introduzca los intentos máximos: ");
        intentos = teclado.nextInt();
        System.out.println("================");
        System.out.println("||TURNO DEL J2||");
        System.out.printf("================");

        do {
            System.out.println();
            System.out.printf("------MENU (%d intentos)------",intentos);
            System.out.println();
            System.out.println("1-Pista letra inicial");
            System.out.println("2-Pista letra final");
            System.out.println("3-Pista número letras");
            System.out.println("4-Intentar resolver");
            System.out.print("--Elija una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La primera letra es: ");
                    System.out.print(contrasenia.charAt(0));
                    break;
                case 2:
                    System.out.println("La última letra es: ");
                    System.out.print(contrasenia.charAt(contrasenia.length()-1));
                    break;
                case 3:
                    System.out.print("El número de caracteres es: ");
                    System.out.print(contrasenia.length());
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("Averigue la contraseña (%d intentos): ", intentos);
                    pass = teclado.next();
                    intentos--;
                    if (contrasenia.equals(pass)) {
                        System.out.println("--ACERTASTE--");
                    } else {
                        System.out.println("--FALLASTE--");
                        if(contrasenia.compareTo(pass)<0){
                            System.out.println("La contraseña es mayor en caracteres");
                        }else if(contrasenia.compareTo(pass)>0){
                            System.out.println("La conseña es menor en caracteres");
                        }else{
                            System.out.println("La contraseña tiene los mismos caracteres");
                        }
                    }
                    break;
            }
        } while (intentos > 0 && !contrasenia.equals(pass));
        if (intentos == 0 && !contrasenia.equals(pass)) {
            System.out.println();
            System.out.println("----HAS PERDIDO EL JUEGO----");
            System.out.print("----LA PASS ERA: ");
            System.out.print(contrasenia);
        } else {
            System.out.println();
            System.out.println("=======================");
            System.out.println("||ENHORABUENA GANASTE||");
            System.out.println("=======================");
        }
    }
}