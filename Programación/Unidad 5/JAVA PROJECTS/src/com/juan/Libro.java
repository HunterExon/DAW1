package com.juan;

import java.util.Comparator;

public class Libro extends Publicacion implements Prestable, Comparable {
    boolean prestado;
    public Libro(String isbn, String titulo, int estreno) {
        super(isbn, titulo, estreno);
        this.prestado = false;
    }

    @Override
    public void presta(){this.prestado=true;}
    @Override
    public void devuelve(){this.prestado=false;}
    @Override
    public boolean estaPrestado(){return this.prestado;}
    @Override
    public int compareTo(Object o){return isbn.compareTo(((Libro)o).isbn);}
    @Override
    public String toString() {
        return "LIBRO {" + super.toString()+
                "PRESTADO: '" + prestado +"'"+
                "}"+"\n";
    }
}
