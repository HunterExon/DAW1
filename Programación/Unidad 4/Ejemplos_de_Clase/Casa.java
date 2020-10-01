package com.jdperez;

public class Casa {
    private Bombilla[] mBombillas;
    private boolean mFusible;

    public Casa(int numBombillas) {
        this.mFusible = true;
        this.mBombillas = new Bombilla[numBombillas];

        for (int i = 0; i < this.mBombillas.length; i++) {
            mBombillas[i] = new Bombilla();
        }
    }

    /**
     * Encender una bombilla determinada
     * @param i int posición de la bombilla
     */
    public void encenderBombilla(int i) {
        this.mBombillas[i].encender();
    }

    /**
     * Apagar una bombilla determinada
     * @param i int posición de la bombilla
     */
    public void apagarBombilla(int i) {
        this.mBombillas[i].apagar();
    }

    /**
     * Sube el interruptor general
     */
    public void subirFusible() {
        this.mFusible = true;
    }

    /**
     * Baja el interruptor general
     */
    public void bajarFusible() {
        this.mFusible = false;
    }

    /**
     * Devuelve en un booleano el estado de la luz general
     * @return boolean
     */
    public boolean estadoGeneral() {
        return this.mFusible;
    }

    public boolean estadoBombilla(int i) {
        if (!estadoGeneral()) {
            return false;
        } else {
            return this.mBombillas[i].encendida();
        }
    }



}
