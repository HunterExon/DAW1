package com.juan;

import java.util.Scanner;

public class cuadradosconcentricos {
    public static void main(String[] args) {
        int filas;
        char c='*';
        int x=0;
        int y=0;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la altura del cuadrado: ");
        filas = teclado.nextInt();

        System.out.printf("Introduzca el caracter de construcción: ");
        c = teclado.next().charAt(0);


        if(filas%2==0){
            for (int alto=1;alto<=filas;alto++) {
                for (int ancho=1;ancho<=filas;ancho++){
                    // La condición tiene 4 partes
                    // Primera parte: Filas hasta la mitad
                    // Segunda parte: Filas desde la mitad en adelante
                    // Tercera parte: Columnas hasta la mitad
                    // Cuarta parte: Columnas desde la mitad en adelante
                    if((alto%2!=0 && ancho>=alto && ancho<=filas-x) || (alto%2==0 && alto+ancho>filas && ancho<=alto)
                        || (ancho%2!=0 && alto>=ancho && ancho<=filas-x)/* || (ancho%2==0 && alto+ancho>filas+1 && ancho>(filas/2)+y)*/){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
                System.out.println();
                x=x+1;
            }
        }else{
            for (int alto=0;alto<filas;alto++) {
                for (int ancho=0;ancho<filas;ancho++){
                    // La condición tiene 4 partes
                    // Primera parte: Filas hasta la mitad
                    // Segunda parte: Filas desde la mitad en adelante
                    // Tercera parte: Columnas hasta la mitad
                    // Cuarta parte: Columnas desde la mitad en adelante
                    if((alto%2==0 && ancho>=alto && ancho<=filas-1-alto) || (alto%2==0 && alto+ancho >=filas-1 && ancho<=alto)
                            || (ancho%2==0 && alto>=ancho && ancho<=filas-alto-1) || (ancho%2==0 && alto+ancho>=filas-1 && alto<=ancho)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}