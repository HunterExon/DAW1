package com.juan;

abstract class Personaje{
    private String nombre;
    private int energia;
    private int ataque;
    private int defensa;
    private boolean encantado;

    Personaje(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.encantado = encantado;
    }

    String getNombre(){return nombre;}
    void setNombre(String nombre){this.nombre = nombre;}
    int getEnergia(){return energia;}
    void setEnergia(int energia){this.energia = energia;}
    int getAtaque(){return ataque;}
    void setAtaque(int ataque){this.ataque = ataque;}
    int getDefensa(){return defensa;}
    void setDefensa(int defensa){this.defensa = defensa;}
    boolean isEncantado(){return encantado;}
    void setEncantado(boolean encantado){this.encantado = encantado;}

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Energia: " + energia +
                " | Ataque: " + ataque +
                " | Defensa: " + defensa +
                " | Encantado: " + encantado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return getEnergia() == personaje.getEnergia();
    }
}

