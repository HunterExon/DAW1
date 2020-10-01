package com.juan;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado=new Scanner(System.in);
        Map<String, pais> capitales=new HashMap<>();

        String nombre;
        List<pais> lista=new ArrayList<>();


        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("paises.bin"));

            while(true){
                pais p = (pais)ois.readObject();
                capitales.put(p.getPais(), p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        do{
            System.out.println("================================");
            System.out.println("| Introduce el nombre del Pais |");
            System.out.println("|       (FIN PARA SALIR)       |");
            System.out.println("================================");
            System.out.print(" Pais--> ");

            nombre = teclado.nextLine();
            nombre=nombre.toUpperCase();

            if(!nombre.equals("FIN")){
                if (capitales.containsKey(nombre)) {
                    System.out.println("Su capital es: "+capitales.get(nombre).getCapital());
                }else{
                    System.out.println("===============================");
                    System.out.println("| ESE PAIS NO ESTÁ REGISTRADO |");
                    System.out.println("===============================");
                    System.out.println("|                             |");
                    System.out.println("|     ¿Desea registrarlo?     |");
                    System.out.println("|            SI/NO            |");
                    System.out.println("|                             |");
                    System.out.println("===============================");
                    System.out.print(" Opcion--> ");
                    String opcion;

                    do {
                        opcion = teclado.nextLine();
                        opcion=opcion.toUpperCase();

                        if (opcion.equals("SI") || opcion.equals("NO")) {
                            if (opcion.equals("SI")) {
                                System.out.println("======================================");
                                System.out.println("| Introduzca el nombre de su capital |");
                                System.out.println("======================================");
                                System.out.print(" Capital--> ");
                                String capital = teclado.nextLine();
                                capital = capital.toUpperCase();
                                capitales.put(nombre, new pais(nombre, capital));
                            }
                        } else {
                            System.out.println("-ERROR- Escriba SI o NO");
                        }
                    }while(!(opcion.equals("SI") || opcion.equals("NO")));
                }
            }
        }while (!(nombre.equals("FIN")));

        System.out.println(capitales.toString());

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("paises.bin"));
            Collection<pais> paises =capitales.values();

            for(pais p : paises){
                oos.writeObject(p);
            }
            oos.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
