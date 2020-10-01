package com.juan;

abstract class Hombre extends Personaje {
    Hombre(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        super(nombre, energia, ataque, defensa, encantado);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
