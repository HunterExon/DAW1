package com.juan;

import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args) {
	/*
Ejercicio 4:
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.

Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
	 */
        Scanner teclado = new Scanner(System.in);
        int num, cont;
        boolean primo;

        do{
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = teclado.nextInt();

            if(num<0){
                System.out.println("=============================================");
                System.out.println("==Error, el numero debe ser entero positivo==");
                System.out.println("============Vuelva a introducirlo============");
                System.out.println("=============================================");
            }
        }while(num<0);

        for(int i=0;i<5;i++){
            primo=true;
            cont=2;
            do{
                if (num % cont == 0) {
                    primo = false;
                }
                cont++;
            }while ((primo) && (cont!=num));

            System.out.print(num);

            if(primo){
                System.out.print(" es primo");
            }else{
                System.out.print(" no es primo");
            }
            num++;
            System.out.println();
        }
    }
}

