package com.juan;

import java.util.Scanner;

public class Ex4 {

    /*
    Ejercicio 4:
    Realiza un programa que calcule el máximo, el mínimo y la media de una serie de
    números enteros positivos introducidos por teclado. El programa terminará
    cuando el usuario introduzca un número primo. Este último número no se tendrá en
    cuenta en los cálculos. El programa debe indicar también cuántos
    números ha introducido el usuario (sin contar el primo que sirve para salir).

    Ejemplo:
    Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un
    número primo:
    6
    8
    15
    12
    23
    Ha introducido 4 números no primos.
    Máximo: 15
    Mínimo: 6
    Media: 10.25
    */
    public static void main(String[] args) {

        //0-Declaración del scanner y las variables a utilizar en el programa, así como su inicialización.
        Scanner teclado = new Scanner(System.in);
        int num;
        int cont = 0;
        int min = 0;
        int max = 0;
        int suma = 0;
        boolean primo;

        //1-Petición por pantalla para la introducción de datos
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        do {
            num = teclado.nextInt();
            //1.1-Mensaje de error cuando introducimos algo erroneo
            if (num <= 0) {
                System.out.println("ERROR - Debe ser entero positivo");
                //1.1.1-Aquí iniciamos a false el boolean primo porque sino nos sacará del bucle sin seguir pidiendo.
                primo = false;
                //1.2- A continuación entramos en el bucle en el que hemos introducido un numero correcto.
            } else {
                //1.2.1-Partimos de la base de que el numero es primo, vamos a demostrar lo contrario, o no.
                primo = true;
                //1.2.1.1-Entramos en un bucle for que nos va a levantar una bandera en el momento que el numero se demuestre no ser primo
                //y, si el numero resulta ser primo, la bandera permanecerá en verdadero y saldrá del programa
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
                //1.3-Si el numero no es primo, toca hacer cuentas, por lo tanto entramos en este condicional
                if (!primo) {
                    //1.3.1-Sumamos 1 al contador de numeros no primos introducidos y empezamos a sumar los datos que se nos proporcionen.
                    cont++;
                    suma = suma + num;

                    //1.3.2-Al entrar por primera vez en este condicional, el contador se establece a 1, por lo tanto también debemos
                    //inicializar el valor minimo y maximo con el primer valor que se nos proporciona.
                    if (cont == 1) {
                        min = num;
                        max = num;
                        //1.3.3-Al terminar la primera vuelta, ya no entramos mas en el bucle de arriba, por lo tanto entramos aquí
                    } else {
                        //1.3.3.1-Aquí establecemos el numero maximo cuando se cumple la condición de que el nuevo
                        //numero introducido por el usuario es mayor que el que teníamos
                        if (num > max) {
                            max = num;
                        }
                        //1.3.3.2-Aquí hacemos lo mismo que justo antes, pero con el minimo.
                        if (num < min) {
                            min = num;
                        }
                    }
                    //1.4-En el caso que el numero introducido sea primo, sacamos un texto de resultados y procedemos a salir del bucle.
                } else {
                    System.out.println("---RESULTADOS---");
                }
            }
        } while (num <= 0 || !primo);

        //2-Una vez se terminan de introducir datos, si el contador no se ha actualizado significa que
        //solo hemos introducido un primo, por lo tanto he decidido que el programa muestre un mensaje de error
        //yq eue no podemos realizar operaciones.
        if (cont == 0) {
            System.out.println("ERROR - Solo ha introducido un número primo");
            //3-En caso contrario existirán no primos con los que realizar los calculos y mostrar los resultados correctamente.
        } else {
            System.out.println("Ha introducido " + cont + " números no primos.");
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
            System.out.println("Media: " + (double) suma / cont); //3.1-Esto es la simple ecuación para realizar la media.
        }
    }
}
