package com.jdperez;

public class Pizzeria {
    private Pedido[] pedidos;
    private int numPedidos;

    Pizzeria() {
        this(5);
    }

    Pizzeria(int capacidad) {
        this.numPedidos = 0;
        this.pedidos = new Pedido[capacidad];
    }

    public void addPedido(Pedido p) {
        if (numPedidos < this.pedidos.length) {
            this.pedidos[numPedidos] = p;
        } else {
            Pedido[] aux = new Pedido[numPedidos+1];
            for (int i = 0; i < pedidos.length ; i++) {
                aux[i] = pedidos[i];
            }
            aux[numPedidos] = p;
            this.pedidos = aux;

        }
        numPedidos++;
    }

    public int getNumPedidos() {
        return numPedidos;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < numPedidos; i++) {
            output += pedidos[i].toString();
        }

        return output;
    }
}

