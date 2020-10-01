//Crea un programa que pida al usuario dos números y muestre
//su división si el segundo no es cero, o un mensaje de aviso en caso contrario.
package com.juan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduce el dividendo numero: ");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();

        System.out.println("Introduce el divisor numero: ");
        Scanner y = new Scanner(System.in);
        int num2 = y.nextInt();

        if (num2 != 0) {
            System.out.printf("%d / %d = %d", num, num2, num / num2);
            System.out.println("");
            if(num%num2!=0){
                System.out.printf("La operacion tiene decimales que no se muestran");
            }
        }else if(num2>num){
            System.out.printf("Por favor, introduzca un divisor mayor que el dividendo");
        }else{
            System.out.printf("Hay un problema en la operación, el denominador no puede ser cero.");
        }
    }
}