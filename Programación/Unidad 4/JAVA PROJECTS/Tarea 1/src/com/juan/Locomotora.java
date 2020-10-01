package com.juan;

public class Locomotora {
    private String mMatricula;
    private String mPotencia;
    private int mAnioFabricacion;
    private Mecanico mMecanico;

    public Locomotora(String mMatricula, String mPotencia, int mAnioFabricacion, Mecanico mMecanico) {
        this.mMatricula = mMatricula;
        this.mPotencia = mPotencia;
        this.mAnioFabricacion = mAnioFabricacion;
        this.mMecanico = mMecanico;
    }

    public String getmMatricula() {
        return mMatricula;
    }

    public void setmMatricula(String mMatricula) {
        this.mMatricula = mMatricula;
    }

    public String getmPotencia() {
        return mPotencia;
    }

    public void setmPotencia(String mPotencia) {
        this.mPotencia = mPotencia;
    }

    public int getmAnioFabricacion() {
        return mAnioFabricacion;
    }

    public void setmAnioFabricacion(int mAnioFabricacion) {
        this.mAnioFabricacion = mAnioFabricacion;
    }

    public Mecanico getmMecanico() {
        return mMecanico;
    }

    public void setmMecanico(Mecanico mMecanico) {
        this.mMecanico = mMecanico;
    }
}
