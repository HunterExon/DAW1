package com.juan;

import java.io.*;
import java.util.Arrays;

public class actividad8 {
    /*
        Actividad 8. Crear una tabla de números aleatorios menores que 100,
        ordenados de menor a mayor, y guardarlos en un fichero binario.
        A continuación, recuperarlos y mostrarlos por consola.
         */
    public static void main(String[] args) throws IOException {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 99);
        }
        Arrays.sort(numeros);

        try {
            FileOutputStream fos = new FileOutputStream(new File("numeros.bin"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < numeros.length; i++) {
                oos.writeInt(numeros[i]);
            }
            oos.close();
        } catch (Exception errorDeFichero) {
            System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("numeros.bin"));
            for (int i = 0; i < numeros.length ; i++) {
                int n = ois.readInt();
                if(i%10==0){
                    System.out.println();
                }else{
                    System.out.printf("%2d ",n);
                }
            }
        } catch (Exception errorDeFichero) {
            System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
        }
    }
}
