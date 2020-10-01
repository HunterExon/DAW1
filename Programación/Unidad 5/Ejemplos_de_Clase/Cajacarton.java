package com.jdperez;

public class Cajacarton extends Caja {
    int etiqueta;
    static double cartontotal = 0;

    public Cajacarton(int alto, int ancho, int fondo) {
        super(alto, ancho, fondo, Unidad.CM);
        cartontotal = cartontotal+this.getSuperficie();
    }

    @Override
    public double getVolumen() {
        double d = super.getVolumen();
        return d*0.8*1000000;
    }

    public double getSuperficie() {
        return (ancho*alto*4)+(alto*fondo*2);
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Alto:"+alto+"\n"+
                "Ancho:"+ancho+"\n"+
                "Fondo:"+fondo+"\n"+
                "Unidad"+unidad+"\n"+
                "Id"+this.etiqueta+"\n"+
                "Volumen:"+getVolumen()+"\n"+
                "Superficie:"+getSuperficie()+"\n";
    }

    public static double getCartontotal() {
        return Cajacarton.cartontotal;
    }


}
