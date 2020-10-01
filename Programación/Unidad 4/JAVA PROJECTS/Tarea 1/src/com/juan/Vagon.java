package com.juan;

public class Vagon {
    private double mCargaMaxima;
    private double mCargaActual;
    private String mTipoCargaActual;

    public Vagon(double mCargaMaxima, double mCargaActual, String mTipoCargaActual) {
        this.mCargaMaxima = mCargaMaxima;
        this.mCargaActual = mCargaActual;
        this.mTipoCargaActual = mTipoCargaActual;
    }

    public void setmCargaMaxima(double mCargaMaxima) {
        this.mCargaMaxima = mCargaMaxima;
    }
    public void setmCargaActual(double mCargaActual) {
        this.mCargaActual = mCargaActual;
    }
    public void setmTipoCargaActual(String mTipoCargaActual) {
        this.mTipoCargaActual = mTipoCargaActual;
    }
}
