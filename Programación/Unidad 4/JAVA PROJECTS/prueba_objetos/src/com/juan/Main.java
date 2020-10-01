package com.juan;

public class Main {
    public static void main(String[] args) {
        Conjunto c1=new Conjunto();
        Conjunto c2=new Conjunto(3);

        System.out.println(c1.getNumElementos());
        System.out.println(c1.estaElemento(13));

        c1.insertarElemento(1);
        c1.insertarElemento(7);
        c1.insertarElemento(8);
        c1.insertarElemento(4);

        c2.insertarElemento(1);
        c2.insertarElemento(1);
        c2.insertarElemento(2);
        c2.insertarElemento(3);
        c2.insertarElemento(5);

        c2.insertarConjunto(c1);

        c2.eliminarElemento(5);
        c2.eliminarElemento(7);
        c2.eliminarElemento(8);

        c2.eliminarConjunto(c1);

        Conjunto.incluido(c1,c2);

        Conjunto c3=Conjunto.union(c1,c2);
        Conjunto c4=Conjunto.interseccion(c1,c2);
        Conjunto c5=Conjunto.diferencia(c1,c2);

    }
}
