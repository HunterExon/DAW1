package com.juan;

import java.io.Serializable;

class pais implements Serializable {
    private String pais;
    private String capital;

    public pais(String pais, String capital) {
        this.pais = pais;
        this.capital = capital;
    }
    public String getPais(){return pais;}
    public void setPais(String pais){this.pais = pais;}
    public String getCapital(){return capital;}
    public void setCapital(String capital){this.capital = capital;}

    @Override
    public String toString() {
        return  capital+"\n";
    }
}
