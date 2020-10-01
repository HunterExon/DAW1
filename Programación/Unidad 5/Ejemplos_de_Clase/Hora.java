package com.jdperez;

public class Hora {
    protected int hora;
    protected int minutos;

    Hora(int h, int m) {
        this.hora = h;
        this.minutos = m;
    }

    public void inc() {
        if (this.minutos<59) {
            minutos++;
        } else {
            minutos = 0;
            if (hora < 23) {
                hora++;
            } else {
                hora = 0;
            }
        }
    }

    public void setHora(int hora) {
        if (hora>=0 && hora<=23) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos>=0 && minutos<=59) {
            this.minutos = minutos;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(this.hora)+":"+
                Integer.toString(this.minutos);
    }
}
