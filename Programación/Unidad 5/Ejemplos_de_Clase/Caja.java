package com.jdperez;

import javax.naming.NameNotFoundException;

public class Caja {

    protected final double alto;
    protected final double ancho;
    protected final double fondo;
    protected final Unidad unidad;
    protected Etiqueta etiqueta;

    public Caja(int alto, int ancho, int fondo,Unidad u) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.unidad = u;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getFondo() {
        return fondo;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public double getVolumen() {
        if (this.unidad == Unidad.M) {
            return alto*ancho*fondo;
        } else {
            return (alto*ancho*fondo)/1000000;
        }
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Alto:"+alto+"\n"+
                "Ancho:"+ancho+"\n"+
                "Fondo:"+fondo+"\n"+
                "Unidad"+unidad+"\n"+
                etiqueta.toString();
    }
}
