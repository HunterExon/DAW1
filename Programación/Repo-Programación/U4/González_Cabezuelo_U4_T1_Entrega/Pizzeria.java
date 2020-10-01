package com.juan;

import java.util.Arrays;

public class Pizzeria {
    private Pedido[] Pedido;
    private int NumPedidos;

    public Pizzeria() {
        this.Pedido = new Pedido[5];
        NumPedidos = 0;
    }
    public Pizzeria(int reservado) {
        this.Pedido = new Pedido[reservado];
        NumPedidos = 0;
    }

    public void AddPedido(Pedido pedido){
        if(NumPedidos<Pedido.length){
            Pedido[NumPedidos]=pedido;
        }else{
            this.Pedido= Arrays.copyOf(Pedido, Pedido.length+1);
            this.Pedido[NumPedidos] =pedido;
        }
        this.NumPedidos++;
    }
    public int getNumPedidos() {
        return NumPedidos;
    }
    public String PizzeriaPedidos(){
        String mostrar="Pedidos: ";
        for (int i = 0; i < Pedido.length; i++) {
            if(Pedido[i]!=null){
                mostrar += Pedido[i].MostrarPedido();
            }
        }
        return mostrar;
    }
}
