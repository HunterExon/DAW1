package com.juan;

import java.util.Calendar;

/**
 * Clase: Pedido
 * Atributos: Pizza y fecha
 */
public class Pedido {
    private Pizza pizza;
    private Calendar fecha;

    /**
     * Construcctor que añade la piza y el momento en que se realiza el pedido
     */
    public Pedido(Pizza pizza) {
        this.pizza = pizza;
        this.fecha = Calendar.getInstance();
    }

    /**
     * Construcctor por defecto del producto estrella
     */
    public Pedido(){
        this.pizza = new Pizza(Pizza.size.FAMILIAR);
        pizza.AddIngredientes(new Ingredientes("jamon", 100));
        pizza.AddIngredientes(new Ingredientes());
        this.fecha = Calendar.getInstance();
    }

    /**
     * Función para mostrar los detalles del pedido
     */
    public String MostrarPedido() {
        return "Pedido{"+pizza.MostrarDatos()+" FECHA(" + (fecha.get(Calendar.DATE))+"/"+ (fecha.get(Calendar.MONTH))+"/"+ (fecha.get(Calendar.YEAR))+")}";
    }
}
