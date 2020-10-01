package com.juan;

import java.io.*;
import java.util.*;

public class act8 {
    public static void main(String[] args) {
/*
Actividad 8: Implementar una función a la que se le pase una lista de nombres y
devuelva una copia sin elementos repetidos (sin modificar la original), con el prototipo:
*/
        System.out.println("===============");
        System.out.println("| ACTIVIDAD 8 |");
        System.out.println("===============");

        String[] nombres= {"ana", "jose", "rosa", "umberto", "jose", "alberto", "pedro", "jose", "rosa"};
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(nombres));

        System.out.println(eliminarRepetidos(lista));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("fichero.bin")));
            Iterator it = eliminarRepetidos(lista).iterator();

            while(it.hasNext()){
                it.next();
                oos.writeObject(eliminarRepetidos(lista));
            }
            oos.close();
        } catch (IOException errorDeFichero) {
            System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
        }
    }
    public static List eliminarRepetidos(List lista){
        Set<String>conjunto=new LinkedHashSet<>();
        conjunto.addAll(lista);
        List<String>lista2=new ArrayList<>();
        lista2.addAll(conjunto);

        return lista2;
    }
}
