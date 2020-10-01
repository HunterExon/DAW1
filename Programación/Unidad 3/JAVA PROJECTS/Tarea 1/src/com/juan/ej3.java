package com.juan;

import java.util.Scanner;

public class ej3 {
    /*Actividad 3: Realizar una función que calcule y muestre el área
     o el volumen de un cilindro, según se especifique. Para distinguir
      un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
      Además, hemos de pasarle a la función el radio de la base y la altura.*/

    public static void area(float x, float y){
        float area = (float)(2*3.14*x*(y+x));
        System.out.printf("El área del cilindro es: %.2f",area);
    }
    public static void volumen(float x, float y){
        float volumen = (float)(3.14*(x*x)*y);
        System.out.printf("El volumen del cilindro es: %.2f",volumen);
    }

    public static void main(String[] args) {
        float radio;
        float alto;
        int opcion;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduzca el radio de la base del cilindro:");
            radio = teclado.nextFloat();
            if(radio<=0){
                System.out.println("Por favor, introduzca un número positivo:");
            }
        }while(radio<=0);

        do {
            System.out.println("Introduzca la altura del cilindro:");
            alto = teclado.nextFloat();
            if(alto<=0){
                System.out.println("Por favor, introduzca un número positivo:");
            }
        }while(alto<=0);

        do {
            System.out.println("===========");
            System.out.println("=OPCIONES==");
            System.out.println("===========");
            System.out.println("|1-Área===|");
            System.out.println("|2-Volumen|");
            System.out.println("===========");

            opcion = teclado.nextInt();
            if(opcion!=1 && opcion!=2){
                System.out.println("Por favor, introduzca una opción valida:");
            }
        }while(opcion!=1 && opcion!=2);

        switch (opcion){
            case 1:
                area(radio,alto);
                break;
            case 2:
                volumen(radio,alto);
                break;
        }
    }
}