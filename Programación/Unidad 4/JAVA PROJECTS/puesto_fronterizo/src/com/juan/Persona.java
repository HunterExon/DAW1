package com.juan;

class Persona {
    private String mNombre;
    private String mDNI;

    Persona(String mNombre, String mDNI) {
        this.mNombre = mNombre;
        this.mDNI = mDNI;
    }

    String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    String getmDNI() {
        return mDNI;
    }

    public void setmDNI(String mDNI) {
        this.mDNI = mDNI;
    }
}
