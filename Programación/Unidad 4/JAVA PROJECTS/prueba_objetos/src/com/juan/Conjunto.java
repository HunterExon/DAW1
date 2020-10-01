package com.juan;

import java.util.Arrays;

public class Conjunto {
    private int[] mElementos;
    int mNumElementos;

    Conjunto() {
        this(10);
    }

    Conjunto(int capacidad) {
        this.mElementos = new int[capacidad];
        this.mNumElementos = 0;
    }

    public int getNumElementos() {
        return this.mNumElementos;
    }

    public boolean estaElemento(int num) {
        for (int i = 0; i < this.mNumElementos; i++) {
            if (num == this.mElementos[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean insertarElemento(int num) {
        if (estaElemento(num)) {
            return false;
        } else {
            if (mNumElementos >= mElementos.length) {
                mElementos = Arrays.copyOf(mElementos, mElementos.length + 1);
            }
            mElementos[mNumElementos] = num;
            mNumElementos++;
            return true;
        }
    }

    public void insertarConjunto(Conjunto c) {
        for (int i = 0; i < c.mNumElementos; i++) {
            insertarElemento(c.mElementos[i]);
        }
    }

    public boolean eliminarElemento(int num) {
        if (!estaElemento(num)) {
            return false;
        } else {
            int pos = 0;
            for (int i = 0; i < mNumElementos; i++) {
                if (num == mElementos[i]) {
                    break;
                }
                pos++;
            }
            for (int i = pos; i < mNumElementos - 1; i++) {
                mElementos[i] = mElementos[i + 1];
            }
            mNumElementos--;
            return true;
        }
    }

    public void eliminarConjunto(Conjunto c) {
        for (int i = 0; i < c.mNumElementos; i++) {
            eliminarElemento(c.mElementos[i]);
        }
    }

    static boolean incluido(Conjunto c1, Conjunto c2) {
        for (int i = 0; i < c1.mNumElementos; i++) {
            if(!c2.estaElemento(c1.mElementos[i])){
                return false;
            }
        }
        return true;
    }

    static Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto c3=new Conjunto();
        c3.insertarConjunto(c1);

        for (int i = 0; i < c2.mNumElementos; i++) {
            if(!c1.estaElemento(c2.mElementos[i])){
                c3.insertarElemento(c2.mElementos[i]);
            }
        }
        return c3;
    }

     static Conjunto interseccion(Conjunto c1, Conjunto c2){
         Conjunto c4=new Conjunto();

         for (int i = 0; i < c2.mNumElementos; i++) {
             if(c1.estaElemento(c2.mElementos[i])){
                 c4.insertarElemento(c2.mElementos[i]);
             }
         }
         return c4;
     }

    static Conjunto diferencia(Conjunto c1, Conjunto c2){
        Conjunto c5=new Conjunto();

        for (int i = 0; i < c1.mNumElementos; i++) {
            if(!c2.estaElemento(c1.mElementos[i])){
                c5.insertarElemento(c1.mElementos[i]);
            }
        }
        return c5;
    }

}
