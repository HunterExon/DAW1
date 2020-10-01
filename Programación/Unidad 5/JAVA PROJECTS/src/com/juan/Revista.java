package com.juan;

public class Revista extends Publicacion implements Comparable {
    private int numero;

    public Revista(String isbn, String titulo, int estreno, int numero) {
        super(isbn, titulo, estreno);
        this.numero = numero;
    }
    public int getNumero(){return numero;}
    public void setNumero(int numero){this.numero = numero;}

    @Override
    public String toString() {
        return "REVISTA {" + super.toString()+
                "NUMERO: '" + numero +"'"+
                "}"+"\n";
    }
    @Override
    public int compareTo(Object o) {
        return isbn.compareTo(((Revista)o).isbn);
    }
}
