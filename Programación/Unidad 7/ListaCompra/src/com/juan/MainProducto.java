package com.juan;

import java.util.*;

public class MainProducto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Float> mapaPrecios=new HashMap<>(); //aqui ira cada producto con su precio
        //Como el mapa tiene datos fijos: relleno el mapa
        mapaPrecios.put("AVENA", (float) 2.21);
        mapaPrecios.put("GARBANZOS", (float) 2.39);
        mapaPrecios.put("TOMATE", (float) 1.59);
        mapaPrecios.put("JENGIBRE", (float) 3.13);
        mapaPrecios.put("QUINOA", (float) 4.50);
        mapaPrecios.put("GUISANTES", (float) 1.60);


        //OJO: PREGUNTAR A JDIEGO FALLO DEL SCANNER
        String nombre;
        int cantidad;
        List<LineaPedido> listaProducto=new ArrayList<>();

        do{
            System.out.println("Introduce el nombre del producto. Para salir pon 'Fin o fin'. ");

            nombre = sc.nextLine();
            //System.out.println();

            if (!(nombre.equalsIgnoreCase("fin"))&& (mapaPrecios.containsKey(nombre.toUpperCase()))) {

                System.out.println("Introduce la cantidad (en uds): ");
                cantidad= sc.nextInt();
                LineaPedido linea1=new LineaPedido(nombre, cantidad);
                listaProducto.add(linea1);
                sc.nextLine();

            }else{
                System.out.println("No tenemos ese producto disponible.");
            }


        }while (!(nombre.equalsIgnoreCase("fin")));

        System.out.println();
        System.out.println();
        System.out.println("****Su ticket de compra final:****");
        LineaPedido.formatoLista(listaProducto,mapaPrecios);
    }
}
