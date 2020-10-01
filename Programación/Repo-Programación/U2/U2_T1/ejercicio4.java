package com.juan;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
/*
Crear programa que pinte una flecha doble hacia la izquierda.
Se pide al usuario la altura de la figura, que debe ser un
número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 5 espacios. Si la altura introducida
por el usuario no es un número impar mayor o igual que 3, el programa
debe mostrar un mensaje de error.
*/
        int filas;
        char c;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca la altura de la flecha: ");
            filas = teclado.nextInt();
            if(filas%2==0 && filas<3) {
                System.out.println("ERROR - El numero debe ser impar y mayor o igual a 3");
            }
        }while(filas%2==0 && filas<3);

        System.out.print("Introduzca el caracter de construcción: ");
        c = teclado.next().charAt(0);

        for(int i=0;i<filas;i++){
            if(i<filas/2) {
                for (int j = 0; j <= filas / 2; j++) {
                    if (i + j == filas / 2) {
                        System.out.printf("%c     %c", c,c);
                    } else {
                        System.out.print(" ");
                    }
                }
            }else{
                for(int j=0;j<=filas/2;j++){
                    if(i==j+3){
                        System.out.printf("%c     %c", c,c);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
