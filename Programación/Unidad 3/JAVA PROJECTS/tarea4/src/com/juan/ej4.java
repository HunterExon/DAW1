package com.juan;

import java.util.Scanner;

public class ej4 {

    /*
Actividad 4: Juego: La cámara secreta. El
jugador especifica el número de dígitos de la clave secreta.
La aplicación genera de forma aleatoria, una combinación
secreta de n dígitos del 1 al 5 (siendo n la longitud
indicada anteriormente por el usuario). El jugador
introduce ahora una combinación de prueba. En cada
intento se mostrará como pista, para cada dígito,
si es mayor menor o igual que el correspondiente
de la combinación secreta.

Ejemplo:
-Introduzca longitud de la clave
-3
(se genera la clave secreta, por ejemplo 152)
-Intente acertarla
-351
-3 es mayor,
 5 es igual,
 1 es menor
- Intente acertarla de nuevo
...
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int num;
        boolean acertado = true;
        do {
            System.out.println("Introduzca el numero de digitos de la clave: ");
            x = teclado.nextInt();
            if(x<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(x<=0);

        int[] a=new int[x];
        for(int i=0; i<a.length;i++){
            a[i]=(int) (Math.random()*5+1);
        }

        do {
            do {
                System.out.println("Introduzca una combinación: ");
                num = teclado.nextInt();
                if (Integer.toString(num).length() < a.length || Integer.toString(num).length() > a.length) {
                    System.out.println("ERROR - La combinación debe tener " + x + " digitos");
                }
            } while (Integer.toString(num).length() < a.length || Integer.toString(num).length() > a.length);

            String aux = Integer.toString(num);
            int[] b = new int[x];
            for (int i = 0; i < b.length; i++) {
                b[i] = Character.getNumericValue(aux.charAt(i));
            }

            acertado=true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    acertado = false;
                    break;
                }
            }

            if (!acertado) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] > b[i]) {
                        System.out.println(b[i] + " es menor");
                    } else if (a[i] < b[i]) {
                        System.out.println(b[i] + " es mayor");
                    } else {
                        System.out.println(b[i] + " es igual");
                    }
                }
                System.out.println("==Intente acertarla de nuevo==");
            } else {
                System.out.println("----CORRECTO----");
            }
        }while(!acertado);
    }
}