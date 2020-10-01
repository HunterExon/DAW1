package com.juan;

class Hora {
    private int hora;
    private int minuto;

    Hora(int hora, int minuto) {
        this.hora = 0;
        this.minuto = 0;
        setHora(hora);
        setMinuto(minuto);
    }
    public int getHora() {
        return hora;
    }
    void setHora(int hora) {
        if(hora>=0 && hora<=23) {
            this.hora = hora;
        }
    }
    public int getMinuto() {
        return minuto;
    }
    void setMinuto(int minuto) {
        if(minuto>=0 && minuto<=59) {
            this.minuto = minuto;
        }
    }
    public void inc(){
        if(minuto==59){
            minuto=0;
            if(hora==23){
                hora=0;
            }else{
                hora++;
            }
        }else{
            minuto++;
        }
    }
    public String toString() {
        return hora+":"+minuto;
    }
}
