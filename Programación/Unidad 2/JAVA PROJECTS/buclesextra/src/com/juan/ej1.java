package com.juan;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        /*
Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
“Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha
abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
        Scanner teclado = new Scanner(System.in);
        int pass;
        int intentos;
        for(intentos=4;intentos>0;intentos--) {
            System.out.printf("Contraseña: ");
            pass = teclado.nextInt();
            if(pass!=1234){
                System.out.println("Lo siento, esa no es la combinación");
            }else{
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
        }
        if(intentos<=0){
            System.out.println("Se ha quedado sin intentos.");
        }
    }
}
