package com.juan;

import com.sun.source.tree.Tree;

import java.util.*;

public class act4 {
    public static void main(String[] args) {
    /*
Actividad 4: Introducir por consola una frase que conste exclusivamente de palabras
separadas por espacios. Almacenar en una lista las palabras de la frase, una en cada
nodo y mostrar por pantalla las palabras que estén repetidas. A continuación,
mostrar las que no lo estén.
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 4 |");
        System.out.println("===============");

        Scanner teclado = new Scanner(System.in);
        String frase;
        String s1 = "";
        String s2 = "";

        System.out.println("Introduce una frase: ");
        frase =teclado.nextLine();

        frase=frase.trim();
        for(int i=0;i<frase.length();i++){
            if(i<frase.length()-2){
                if(frase.charAt(i)==' ' && frase.charAt(i+1)==' '){

                }
            }
        }
        List<String> lista = new ArrayList<>(Arrays.asList(frase.split(" ")));

        for (Iterator<String> it=lista.iterator();it.hasNext();){
            s1 = it.next();
            if(Collections.frequency(lista, s1)>1){
                s2+=s1+" ";
            }
        }

        TreeSet<String> repetidos = new TreeSet<>(Arrays.asList(s2.split(" ")));
        lista.removeAll(repetidos);
        repetidos.remove(" ");
        repetidos.remove("");

        System.out.println("Lista de repetidos: "+repetidos);
        System.out.println("Lista sin repetidos: "+lista);





    }
}