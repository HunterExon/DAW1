package com.juan;

import java.util.Objects;

public class Publicacion {
    /*
Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
características comunes de las revistas y de los libros son el código ISBN, el
título, y el año de publicación. Los libros tienen además un atributo prestado.
Cuando se crean los libros, no están prestados. Las revistas tienen un número.
La clase Libro debe implementar la interfaz Prestable que tiene los métodos
presta, devuelve y estaPrestado.
     */
    protected String isbn;
    private String titulo;
    private int estreno;

    public Publicacion(String isbn, String titulo, int estreno) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.estreno = estreno;
    }

    public String getIsbn(){return isbn;}
    public void setIsbn(String isbn){this.isbn = isbn;}
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    public int getEstreno(){return estreno;}
    public void setEstreno(int estreno){this.estreno = estreno;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return getIsbn().equals(that.getIsbn());
    }
    @Override
    public String toString() {
        return "" +
                "ISBN: '" + isbn + '\'' +
                ", TITULO: '" + titulo + '\'' +
                ", ESTRENO: '" + estreno+"', ";
    }
}
