package com.juan;

public class Tren {
    private Locomotora mLocomotora;
    private Maquinista mMaquinista;
    private Vagon[] mVagon = new Vagon[5];

    /*
    Tren(Locomotora mLocomotora, int numVagones, Maquinista mMaquinista) {
        this.mLocomotora = mLocomotora;
        this.mMaquinista = mMaquinista;
        if(numVagones>5) {
            System.out.println("No es posible tener más de 5 vagones");
        }else {
            this.mVagon = new Vagon[numVagones];
        }
    }
    */

    Tren(){
        this.mMaquinista=new Maquinista("Pepe Pérez","2222222x",20000,"Capitán");
    }

    Tren(Locomotora mLocomotora, Vagon[] mVagon, Maquinista mMaquinista) {
        this.mLocomotora = mLocomotora;
        this.mMaquinista = mMaquinista;
        this.mVagon = mVagon;
    }

    public Locomotora getmLocomotora() {
        return mLocomotora;
    }

    public void setmLocomotora(Locomotora mLocomotora) {
        this.mLocomotora = mLocomotora;
    }

    public Vagon[] getmVagon() {
        return mVagon;
    }

    public void setmVagon(Vagon[] mVagon) {
        this.mVagon = mVagon;
    }

    public Maquinista getmMaquinista() {
        return mMaquinista;
    }

    public void setmMaquinista(Maquinista mMaquinista) {
        this.mMaquinista = mMaquinista;
    }
}
