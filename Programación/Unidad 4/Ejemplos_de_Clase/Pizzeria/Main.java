package com.jdperez;

public class Main {

    public static void main(String[] args) {

        Ingrediente i1 = new Ingrediente();
        Ingrediente i2 = new Ingrediente("Jamón",500);
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza(Size.MEDIANA);

        Ingrediente[] ingredientes = new Ingrediente[2];
        ingredientes[0] = i1;
        ingredientes[1] = i2;

        Pizza p3 = new Pizza(Size.MEDIANA, ingredientes);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        Pedido ped1 = new Pedido();
        Pedido ped2 = new Pedido(p3);

        Pizzeria t = new Pizzeria();

        for (int i = 0; i < 10 ; i++) {
            t.addPedido(new Pedido());
        }

        System.out.println(t.toString());


        System.out.println(Pizza.getSizes());

        System.out.println(ped1.toString());
        System.out.println(ped2.toString());



    }
}
