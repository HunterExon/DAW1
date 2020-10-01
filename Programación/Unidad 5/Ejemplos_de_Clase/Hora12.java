package com.jdperez;

public class Hora12 extends Hora {

    public enum Meridiano {AM, PM};
    Meridiano m;

    Hora12(int hora, int minutos, Meridiano mer) {
        super(hora,minutos);
        this.m = mer;
    }

    @Override
    public void setHora(int hora) {
        if (hora>0 && hora<=12) {
            this.hora = hora;
        }
    }

    @Override
    public void inc() {
        if (this.minutos<59) {
            minutos++;
        } else {
            minutos = 0;
            if (hora <= 12) {
                hora++;
            } else {
                hora = 1;
                if (this.m == Meridiano.AM) {
                    this.m = Meridiano.PM;
                } else  {
                    this.m = Meridiano.AM;
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+this.m.toString();
    }
}
