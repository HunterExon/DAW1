package com.jdperez;

public class Banco {

    private String mNombre;
    private String mDireccion;
    private float mCapital;

    public Banco(String nombre,String direccion,float capital) {
        this.mNombre = nombre;
        this.mDireccion = direccion;
        this.mCapital = capital;
    }

    public Banco(String nombre,String direccion) {
        this.mNombre = nombre;
        this.mDireccion = direccion;
        this.mCapital = 5200000;
    }

    public String getDireccion() {
        return mDireccion;
    }

    public void setDireccion(String mDireccion) {
        this.mDireccion = mDireccion;
    }

    public float getCapital() {
        return mCapital;
    }

    public void setCapital(float mCapital) {
        this.mCapital = mCapital;
    }

    public String getNombre() {
        return mNombre;
    }
}
