package com.juan;

public class Casa {
    private Bombilla[] mBombilla;
    private boolean mFusibles;

    /**
     * @param NumBombillas
     * Esta es la forma de crear cada bombilla individualmente y el número de bombillas que habrá
     */
    public Casa(int NumBombillas) {
        this.mBombilla = new Bombilla[NumBombillas];
        for(int i=0;i<NumBombillas;i++){
            this.mBombilla[i]=new Bombilla();
        }
        this.mFusibles = true;
    }

    public void setmFusibles(boolean mFusibles) {
        this.mFusibles = mFusibles;
    }

    /**
     * @param numero
     * @return
     * Aquí me dice como está cada bombilla, teniendo en cuenta el fusible
     */
    public boolean getmBombilla(int numero) {
        boolean estado = this.mBombilla[numero].isEstado();

        if(!mFusibles){
            this.mBombilla[numero].interruptor(false);
        }else{
            this.mBombilla[numero].interruptor(estado);
        }
        return this.mBombilla[numero].isEstado();
    }

    /**
     * @param numero
     * @param estado
     * Con esto declaramos si una bombilla está encendida o apagada y que bombilla en concreto.
     */
    public void setmBombilla(int numero, boolean estado) {
        this.mBombilla[numero].interruptor(estado);
    }





}
