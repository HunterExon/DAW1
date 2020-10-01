package com.juan;

import java.util.Comparator;

public class Enciclopedia extends Publicacion implements Comparable, Comparator {
    int numtomo;
    public Enciclopedia(String isbn, String titulo, int estreno, int numtomo) {
        super(isbn, titulo, estreno);
        this.numtomo = numtomo;
    }

    public int getNumtomo(){return numtomo;}
    public void setNumtomo(int numtomo){this.numtomo = numtomo;}

    @Override
    public int compareTo(Object o) {
        return isbn.compareTo(((Enciclopedia)o).isbn);
    }
    @Override
    public String toString() {
        return "ENCICLOPEDIA {" + super.toString() +
                "TOMOS: '" + numtomo + "'" +
                "}" + "\n";
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}