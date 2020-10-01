package com.juan;

public class Pizza {
    /**
     * Clase: Pizza
     * Atributos: Size (enum para los tamaños), Ingredientes[] (array con los ingredientes de la pizza)
     */
    enum size {MEDIANA, FAMILIAR};
    private size tamanio;
    private Ingredientes[] ingredientes;

    /**
     * Constructor de pizza: damos el tamaño de la pizza pero establecemos los ingredientes máximos a 3
     */
    public Pizza(size tamanio) {
        this.tamanio = tamanio;
        this.ingredientes=new Ingredientes[3];
    }

    /**
     * Construcctor de Pizza por defecto, con datos por defecto.
     */
    public Pizza() {
        this.tamanio = size.FAMILIAR;
        this.ingredientes = new Ingredientes[3];
    }

    /**
     * Función para añadir ingredientes
     */
    public boolean AddIngredientes(Ingredientes ingrediente) {
        if (ContarIngredientes()<3){
            this.ingredientes[ContarIngredientes()]=ingrediente;
            return true;
        }
        return false;
    }

    /**
     * Función para contar ingredientes
     */
    public int ContarIngredientes(){
        int cont = 0;
        for (int i = 0; i < ingredientes.length; i++) {
            if(ingredientes[i]!=null){
                cont++;
            }
        }
        return cont;
    }

    /**
     * Función para mostrar los tamaños
     */
    public String MostrarTamanios() {
        return "Las pizzas son de tamanio "+ size.FAMILIAR + " y "+size.MEDIANA+".";
    }

    /**
     * Función para mostrar todos los datos
     */
    public String MostrarDatos() {
        String mostrar="Pizza{";
        for (int i = 0; i < ingredientes.length; i++) {
            if(ingredientes[i]!=null){
                mostrar += ingredientes[i].getNombre() +"|"+ ingredientes[i].getCalorias() + " ";
            }
        }
        mostrar += " "+tamanio;
        return mostrar;
    }
}
