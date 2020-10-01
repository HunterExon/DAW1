package com.juan;

import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {
	/*
Ejercicio 3:
Ahora que se acerca la notería de Navidad queremos saber si un
número va a proporcionar suerte a un usuario. Solicitaremos a
un usuario cuáles son sus 3 números favoritos y para calcular
si un número le va a dar suerte dicho número tendrá más
ocurrencias de esos números que de los demás.

Ejemplo 1:
Introduzca sus números favoritos 1:
3
5
7

Introduzca el número de la lotería: 74123
Ese número no le va a dar suerte

Ejemplo 2:
Introduzca sus números favoritos 1:
3
5
7

Introduzca el número de la lotería: 55173
Ese número le va a dar suerte.
	 */
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,loteria;
        int cont_suerte=0,cont_neg=0;

        do{
            System.out.println("Introduzca sus números favoritos: ");
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();
            num3 = teclado.nextInt();

            if(num1<0 || num2<0 || num3<0){
                System.out.println("==================================================");
                System.out.println("==Error, los numeros deben ser enteros positivos==");
                System.out.println("==============Vuelva a introducirlos==============");
                System.out.println("==================================================");
            }
        }while(num1<0 || num2<0 || num3<0);

        do{
            System.out.print("Introduzca el número de la lotería: ");
            loteria = teclado.nextInt();

            if(loteria<0){
                System.out.println("=============================================");
                System.out.println("==Error, el numero debe ser entero positivo==");
                System.out.println("============Vuelva a introducirlo============");
                System.out.println("=============================================");
            }
        }while(loteria<0);


        do{
            if(loteria%10==num1 || loteria%10==num2 || loteria%10==num3){
                loteria=loteria/10;
                cont_suerte++;
            }else{
                loteria=loteria/10;
                cont_neg++;
            }
        }while(loteria>0);

        if(cont_suerte>cont_neg){
            System.out.println("Ese número le va a dar suerte.");
        }else{
            System.out.println("Ese número no le va a dar suerte");
        }
    }
}

