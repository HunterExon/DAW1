package com.jdperez;

public class Bombilla {
    /**
     * Variable que nos dice si está encendida
     */
    private boolean mEstado;

    Bombilla() {
        this.mEstado =false;
    }

    /**
     * Enciende la bombilla
     */
    public void encender() {
        this.mEstado = true;
    }

    /**
     * Apaga la bombilla
     */
    public void apagar() {
        this.mEstado = false;
    }

    /**
     * Devuelve el estado de la bombillas
     * @return Devuelve true si la bombilla está encendida
     */
    public boolean encendida() {
        return this.mEstado;
    }
}
