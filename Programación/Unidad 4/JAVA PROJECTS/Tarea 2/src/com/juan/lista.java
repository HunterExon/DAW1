package com.juan;

import java.util.Arrays;

//p225 libro
public class lista {
    //atributos
    private Integer [] mLista;
    private int mNumElementos;

    //contructor: hay 2
    lista(){
        this.mLista=new Integer[10]; //10 nulls
        this.mNumElementos=0;
    }
    lista(int tamanyo){
        this.mLista=new Integer[tamanyo];
        this.mNumElementos=0;
    }

    //getters y setters
    public Integer[] getLista() {
        return mLista;
    }

    public void setLista(Integer[] lista) {
        this.mLista = lista;
    }

    public int getNumElementos() { //este metodo me dice cuantos elementos hay metidos en la lista
        return mNumElementos;
    }

    public void setNumElementos(int mNumElementos) {
        this.mNumElementos = mNumElementos;
    }

    //metodos


    /*
    public int elementosInsertadosLista(Integer[] l1){
        this.mLista=l1;
        int contRes=0;
        int res=0;

        for (int i = 0; i <l1.length ; i++) {
            if(l1[i]!=null){
                contRes++;
                res=res+contRes;
            }
        }
        return res;

    }*/

    //lo suyo seria tener un metodo para rellenar la tabla, otro para mostrarla

    public void insertFinal(int num){
        if(getNumElementos()<this.mLista.length){
            this.mLista[mNumElementos]=num; //me lo pone en la ultima posicion
            this.mNumElementos++;
        }else{
            //Integer[] nuevaLista=new Integer[this.mLista.length+1];
            this.mLista= Arrays.copyOf(this.mLista,this.mLista.length+1);
            this.mLista[this.mLista.length-1]=num;
        }

    }
    public void insertPpio(int num){
        //si hay espacio en la lista
        if(getNumElementos()<this.mLista.length){
            //desplazo hacia el final
            for (int i = this.mNumElementos; i >= 1; i--) {
                this.mLista[i]=this.mLista[i-1];
            }
            this.mLista[0]=num;
            this.mNumElementos++;
        }
    }
    /**
     * Insertar un numero en un lugar de la lista que se pasa como parametro
     * @param pos
     */
    public boolean insertarElemento(int pos, int num){
        int auxiliar;

        if(pos>=0 && pos<=this.mNumElementos) {
            if(this.mLista.length>this.mNumElementos){
                for (int i = pos; i <= this.mNumElementos; i++) {
                    auxiliar = this.mLista[i];
                    this.mLista[i] = num;
                    num = auxiliar;
                }
            }else{
                this.mLista=Arrays.copyOf(this.mLista, this.mLista.length+1);

                for (int i = pos; i <= this.mNumElementos; i++) {
                    auxiliar = this.mLista[i];
                    this.mLista[i] = num;
                    num = auxiliar;
                }
            }
            this.mNumElementos++;
            return true;
        }
        return false;
    }

    /**
     * Metodo que une dos vectores de limites diferentes
     */
    public void unirVectores (int lista2[]){
        int j=0;
        if(this.mNumElementos+lista2.length>mLista.length){
            this.mLista=Arrays.copyOf(this.mLista, this.mLista.length+lista2.length);
        }
        for (int i=this.mNumElementos;i<this.mNumElementos+lista2.length;i++){
            this.mLista[i]=lista2[j];
            j++;
            this.mNumElementos++;
        }
    }

    public int[] eliminarElemento(int pos){

        if(pos<=mNumElementos) {
            for (int i = pos; i < mNumElementos; i++) {
                if (i < mNumElementos-1) {
                    mLista[i] = mLista[i + 1];
                }else{
                    mLista[i]=null;
                }
            }
            mNumElementos--;
        }
        mNumElementos--;
        return null;
    }

    /**
     * Metodo para obtener el elemento cuyo indice se pasa como parametro
     */
    public Integer devolverElemento (int pos){
        if(pos<0 || pos>mNumElementos){
            return null;
        }
        return mLista[pos];
    }

    /**
     *Buscar un numero en la lista devolviendo el indice del primer lugar en el que
     * se encuentre. Si no está, devolver -1.
     */
    public int numeroEnLista(int num){
        for(int i=0;i<mNumElementos;i++){
            if(mLista[i]==num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Representar la lista con una cadena de caracteres
     */
    public String listaComoCadena(){
        String cadena="[";
        if(mNumElementos==0){
            return "[]";
        }else {
            for (int i = 0; i < mNumElementos; i++) {
                cadena+=mLista[i]+"-";
            }
            cadena+="]";
        }
        return cadena;
    }

    /**
     * Metodo que muestra el array
     * @return
     */
    @Override
    public String toString() {
        return "Lista{" +
                "mLista=" + Arrays.toString(mLista) +
                ", mNumElementos=" + mNumElementos +
                '}';
    }
}
