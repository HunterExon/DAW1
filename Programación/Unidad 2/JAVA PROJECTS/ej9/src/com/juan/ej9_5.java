package com.juan;

import java.util.Scanner;

public class ej9_5 {
    public static void main(String[] args) {
        /*
Actividad 9-5: Los habitantes de Javalandia tienen un idioma algo extraño;
cuando hablan siempre comienzan sus frases con "Javalín, javalón",
para después hacer una pausa más o menos larga (la pausa se representa
mediante espacios en blanco) y a continuación expresan el mensaje. Existe un
dialecto que no comienza sus frases con la muletilla anterior, pero siempre
las terminan con un silencio, más o menos prolongado y la coletilla
"javalén, len, len". Se pide diseñar un traductor que, en primer lugar,
nos diga si la frase está escrita en el idioma de Javalandia (en cualquiera de sus dialectos),
y en caso afirmativo, nos muestre el mensaje sin muletillas.
*/
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Introduzca la frase: ");
        frase = teclado.nextLine();

        if ((frase.startsWith("Javalín, javalón")&&!frase.endsWith("javalén, len, len"))||!(frase.startsWith("Javalín, javalón")&&frase.endsWith("javalén, len, len"))){
            System.out.println("El mensaje está escrito en el idioma de Javalandia.");
            System.out.println("La frase traducida es: ");

            frase = frase.replaceAll("Javalín, javalón","");
            frase = frase.replaceAll("javalén, len, len","");
            System.out.println(frase.trim());

        }else{
            System.out.println("El mensaje no está en el idioma de Javalandia");
        }

    }
}