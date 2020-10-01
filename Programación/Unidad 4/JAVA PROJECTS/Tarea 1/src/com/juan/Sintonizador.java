package com.juan;
/*
Actividad 7: Se quiere definir una clase que permita controlar un sintonizador
digital de emisoras FM; concretamente, se desea dotar al controlador
de una interfaz que permita subir (up) o bajar (down) la frecuencia
(en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un
momento dado (display). Supondremos que el rango de frecuencias a
manejar oscila entre los 80MHz y los 108MHz y que, al inicio, el
controlador sintonice a 80MHz. Si durante una operación de subida o
bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada
debe pasar a ser la del extremo contrario. Escribir un pequeño programa
principal para probar su funcionamiento.
 */

public class Sintonizador {
    private double mFrecuencia;
    private double mLimiteMayor;
    private double mLimiteMenor;

    public Sintonizador(){
        this.mFrecuencia=80;
        this.mLimiteMayor=108;
        this.mLimiteMenor=80;
    }

    public void subir(){
        this.mFrecuencia+=0.5;

        if(this.mFrecuencia>this.mLimiteMayor){
            this.mFrecuencia=this.mLimiteMenor;
        }
    }
    public void bajar(){
        this.mFrecuencia-=0.5;

        if(this.mFrecuencia<this.mLimiteMenor){
            this.mFrecuencia=this.mLimiteMayor;
        }
    }
    public void display(){
        System.out.println("Frecuencia: "+this.mFrecuencia);
    }
}
