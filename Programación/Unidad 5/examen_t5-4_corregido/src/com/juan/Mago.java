package com.juan;

public class Mago extends Personaje implements Magia {
    private int long_barba;

    public Mago(String nombre, int energia, int ataque, int defensa, boolean encantado, int long_barba) {
        super(nombre, energia, ataque, defensa, encantado);
        this.long_barba=long_barba;
    }

    public int getLong_barba(){return long_barba;}
    public void setLong_barba(int long_barba){this.long_barba = long_barba;}

    @Override
    public String toString() {
        return "\n--(Raza: Humano"+" | Tipo: Mago"+" | Longitud de Barba: "+long_barba+" | "+super.toString();
    }
}
