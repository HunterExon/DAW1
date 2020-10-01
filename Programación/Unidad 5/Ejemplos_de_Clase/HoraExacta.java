package com.jdperez;

public class HoraExacta extends Hora {
    protected int segundos;

    HoraExacta(int hora, int minuto, int segundos) {
        super(hora,minuto);
        this.setSegundos(segundos);
    }

    public void setSegundos(int seg) {
        if (seg>=0 && seg<=59) {
            this.segundos = seg;
        }
    }

    @Override
    public void inc() {
        if (this.segundos<59) {
            this.segundos++;
        } else {
            this.segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString()+":"+this.segundos;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof HoraExacta)) {
            return false;
        } else {
            if (this.segundos == ((HoraExacta) obj).segundos &&
                this.minutos == ((HoraExacta) obj).minutos &&
                    this.hora == ((HoraExacta) obj).hora) {
                return true;
            } else {
                return  false;
            }
        }
    }
}
