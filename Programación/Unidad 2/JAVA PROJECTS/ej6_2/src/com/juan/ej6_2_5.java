package com.juan;

import java.util.Scanner;

public class ej6_2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int login;

        do{
            System.out.printf("Introduzca su usuario: ");
            login = teclado.nextInt();
            if(login!=1809){
                System.out.println("USUARIO DESCONOCIDO");
            }
            System.out.println("*********************");
        }while(login!=1809);

        int pass;
        int intentos = 5;

        do{
            System.out.printf("USUARIO "+login);
            System.out.println("");
            System.out.printf("Contraseña: ");
            pass = teclado.nextInt();
            if(pass!=1234){
                intentos--;
                System.out.println("*********************");
                System.out.println("ERROR [Quedan "+intentos+" intentos]");
            }
        }while(pass!=1234 && intentos!=0);

        if(pass==1234) {
            System.out.println("*********************");
            System.out.println("BIENVENIDO " + login);
            System.out.println("*********************");
        }else{
            System.out.printf("Pruebe de nuevo más tarde");
        }
    }
}