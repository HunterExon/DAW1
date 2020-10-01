package com.juan;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
	/*
Ejercicio 2:
Realizar un programa que dado un número que se solicita al usuario por consola
eliminará de ese número de ese número
todos los 0 y todos los 8 indicando adicionalmente cuántos números
ha eliminado. Deberá solicitar el número mientras que
el número introducido no sea positivo.

Ejemplo 1:
Introduzca un número entero positivo: 34084091
Número resultado: 34491
Dígitos eliminados: 3

Ejemplo 2:
Introduzca un número entero positivo: 84123
Número resultado: 4123
Dígitos eliminados: 1
NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS
	 */
        Scanner teclado = new Scanner(System.in);
        long numero;
        long aux=0;
        int cont=0;

        do{
            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextLong();

            if(numero<0){
                System.out.println("=============================================");
                System.out.println("==Error, el numero debe ser entero positivo==");
                System.out.println("============Vuelva a introducirlo============");
                System.out.println("=============================================");
            }
        }while(numero<0);


       do{
           if(numero%10==0 || numero%10==8){
               numero=numero/10;
               cont++;
           }else{
               aux=(aux*10)+(numero%10);
               numero=numero/10;
           }
       }while(numero>0);

       while(aux>0){
           numero=(numero*10)+(aux%10);
           aux=aux/10;
       }

        System.out.println("Número resultado: "+numero);
        System.out.println("Dígitos eliminados: "+cont);

    }
}

