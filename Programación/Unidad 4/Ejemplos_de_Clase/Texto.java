package com.jdperez;

public class Texto {

    public String mCadena;
    private int mLongitud;

    public Texto(int longitud) {
        this.mLongitud = longitud;
        this.mCadena = "";
    }

    public boolean addCharStart(char c) {
        if (this.mCadena.length() < this.mLongitud) {
            this.mCadena = c + this.mCadena;
            return true;
        }
        return false;
    }

    public boolean addCharEnd(char c) {
        if (this.mCadena.length() < this.mLongitud) {
            this.mCadena = this.mCadena + c;
            return true;
        }
        return false;
    }

    public boolean addStringStart(String s) {
        if (this.mCadena.length() + s.length() <= this.mLongitud) {
            this.mCadena = s + this.mCadena;
            return true;
        }
        return false;
    }

    public boolean addStringEnd(String s) {
        if (this.mCadena.length() + s.length() <= this.mLongitud) {
            this.mCadena = this.mCadena + s;
            return true;
        }
        return false;
    }

    public int numVocales() {
        int num = 0;
        for (int i = 0; i < this.mCadena.length(); i++) {
            if (this.mCadena.charAt(i) == 'a' || this.mCadena.charAt(i) == 'e'
                    || this.mCadena.charAt(i) == 'i' || this.mCadena.charAt(i) == 'o'
                    || this.mCadena.charAt(i) == 'u' || this.mCadena.charAt(i) == 'A'
                    || this.mCadena.charAt(i) == 'E'
                    || this.mCadena.charAt(i) == 'I' || this.mCadena.charAt(i) == 'O'
                    || this.mCadena.charAt(i) == 'U') {
                num++;
            }
        }

        return num;
    }
}
