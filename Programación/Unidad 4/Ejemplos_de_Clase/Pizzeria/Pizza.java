package com.jdperez;

public class Pizza {
    private Size size;
    private Ingrediente[] ingredientes;
    private int numIngredientes;

    Pizza() {
        this.size = Size.FAMILIAR;
        this.numIngredientes = 0;
        this.ingredientes = new Ingrediente[3];
    }

    Pizza(Size tam) {
        this.size = tam;
        this.numIngredientes = 0;
        this.ingredientes = new Ingrediente[3];
    }

    Pizza(Size tam, Ingrediente[] in) {
        this.size = tam;
        this.ingredientes = new Ingrediente[3];
        for (int j = 0; j < in.length; j++) {
            addIngrediente(in[j]);
        }
    }

    public boolean addIngrediente(Ingrediente i) {
        if (this.numIngredientes< this.ingredientes.length) {
            this.ingredientes[numIngredientes] = i;
            this.numIngredientes++;
            return true;
        } else {
            return false;
        }
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    @Override
    public String toString() {
        String output = "";
        output += "\n"+this.size.toString()+"\n";
        if (this.numIngredientes == 0 ) {
            output += "Pizza Vacía";
        } else {
            for (int i = 0; i < this.numIngredientes ; i++) {
                output += ingredientes[i].getNombre()+"-"+ingredientes[i].getCalorias()+"\n";
            }
        }
        return output;
    }

    static String getSizes() {
        String output= "";
        for (int i = 0; i <Size.values().length ; i++) {
          output+= Size.values()[i];
        }

        return output;
    }
}
