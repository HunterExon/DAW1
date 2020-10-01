package com.jdperez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class Pedido {
    private Calendar momento;
    private Pizza pizza;

    Pedido() {
        Ingrediente i1 = new Ingrediente();
        Ingrediente i2 = new Ingrediente("Jamón",500);
        Ingrediente[] ingredientes = new Ingrediente[2];
        ingredientes[0] = i1;
        ingredientes[1] = i2;
        pizza = new Pizza(Size.FAMILIAR,ingredientes);
        momento = Calendar.getInstance();
    }

    Pedido(Pizza pizza) {
        momento = Calendar.getInstance();
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        String output = "";
        output += this.pizza.toString();

        output += "PEDIDO: "+ momento.get(Calendar.DATE)+"/"+(momento.get(Calendar.MONTH)+1)+"/"+
                momento.get(Calendar.YEAR)+" "+momento.get(Calendar.HOUR_OF_DAY)+":"+
                momento.get(Calendar.MINUTE);

        return output;
    }
}
