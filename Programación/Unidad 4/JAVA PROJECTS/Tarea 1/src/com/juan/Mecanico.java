package com.juan;

public class Mecanico {
    private String mNombre;
    private String mTelefono;
    private String mEspecialidad;

    public Mecanico(String mNombre, String mTelefono, String mEspecialidad) {
        this.mNombre = mNombre;
        this.mTelefono = mTelefono;
        this.mEspecialidad = mEspecialidad;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getmTelefono() {
        return mTelefono;
    }

    public void setmTelefono(String mTelefono) {
        this.mTelefono = mTelefono;
    }

    public String getmEspecialidad() {
        return mEspecialidad;
    }

    public void setmEspecialidad(String mEspecialidad) {
        this.mEspecialidad = mEspecialidad;
    }
}
