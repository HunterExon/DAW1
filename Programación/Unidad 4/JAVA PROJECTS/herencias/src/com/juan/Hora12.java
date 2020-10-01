package com.juan;

public class Hora12 extends Hora {
    public enum horario{AM,PM}
    private horario h;

    public Hora12(int hora, int minuto, horario h) {
        super(hora, minuto);
        this.h = horario.AM;
        setH(h);
    }
    public horario getH() {
        return h;
    }
    public void setH(horario h) {
        this.h = h;
    }
    @Override
    void setHora(int hora) {
        if(hora>=1 && hora<=12) {
            super.setHora(hora);
        }
    }
    @Override
    public void inc(){
        if(this.getMinuto()==59){
            this.setMinuto(0);
            if(this.getHora()==12){
                this.setHora(1);
                if(this.h==horario.AM){
                    this.h=horario.PM;
                }else {
                    this.h=horario.AM;
                }
            }else{
                this.setHora(this.getHora()+1);
            }
        }else{
            this.setMinuto(this.getMinuto()+1);
        }
    }
    @Override
    public String toString() {
        return super.toString()+" "+this.h.toString();
    }
}
