package com.juan;

public class JefeDeEstacion {
    private String mNombre;
    private String mDNI;

    public JefeDeEstacion(String mNombre, String mDNI) {
        this.mNombre = mNombre;
        this.mDNI = mDNI;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getmDNI() {
        return mDNI;
    }

    public void setmDNI(String mDNI) {
        this.mDNI = mDNI;
    }
}
