package com.juan;

public class HoraExacta extends Hora {
    private int segundos;

    HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        setSegundos(segundos);
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if(segundos>=0 && segundos<=59) {
            this.segundos = segundos;
        }
    }
    @Override
    public void inc(){
        if(this.getSegundos()==59) {
            this.setSegundos(0);
            super.inc();
        }else{
            this.setSegundos(this.getSegundos()+1);
        }
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof HoraExacta)){
            return false;
        }else{
            if(this.getSegundos()== ((HoraExacta) o).getSegundos()&&this.getMinuto()==((HoraExacta) o).getMinuto()&&this.getHora()==((HoraExacta) o).getHora()){
                return true;
            }else{
                return false;
            }
        }

    }
    @Override
    public String toString() {
        return super.toString()+":"+this.getSegundos();
    }
}
