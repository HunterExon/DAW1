package com.jdperez;

public class Persona {

    private String mNombre;
    private String mDNI;

    public Persona(String mNombre, String mDNI) {
        this.mNombre = mNombre;
        this.mDNI = mDNI;
    }

    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getDNI() {
        return mDNI;
    }

    public void setDNI(String mDNI) {
        this.mDNI = mDNI;
    }
}
