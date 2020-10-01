package com.juan;

import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
	/*
Ejercicio 1:
Escribe un programa que pinte por pantalla un par de calcetines,
de los que se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario
introduce una altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.

Ejemplo 1:
Introduzca la altura de los calcetines: 6

***     ***
***     ***
***     ***
***     ***
******  ******
******  ******

Ejemplo 2:
Introduzca la altura de los calcetines: 4


***     ***
***     ***
******  ******
******  ******
	 */
        Scanner teclado = new Scanner(System.in);
        int altura;

        do{
            System.out.print("Introduzca la altura de los calcetines: ");
            altura = teclado.nextInt();

            if(altura<4){
                System.out.println("===============================================");
                System.out.println("==Error, la altura debe ser mayor o igual a 4==");
                System.out.println("=============Vuelva a introducirlo=============");
                System.out.println("===============================================");
            }
        }while(altura<4);

        System.out.println();

        for(int i=0; i<altura;i++){
            if(i<altura-2){
                System.out.print("***     ***");
            }else{
                System.out.print("******  ******");
            }
            System.out.println();
        }
    }
}
