package com.juan;
/*
Actividad 5: Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.

-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.

-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.

-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
 */
public class Texto {
    String mCadena;
    int mLongitud;


    public Texto(int longitud){
        this.mLongitud=longitud;
        this.mCadena="";
    }
    public boolean addCharStart(char c){
        if(mCadena.length()<this.mLongitud){
            this.mCadena = c+this.mCadena;
            return true;
        }else{
            return false;
        }
    }
    public boolean addCharEnd(char c){
        if(mCadena.length()<this.mLongitud){
            this.mCadena = this.mCadena+c;
            return true;
        }else{
            return false;
        }
    }
    public boolean addStringStart(String s){
        if(this.mCadena.length()+s.length()<=this.mLongitud){
            this.mCadena=s+this.mCadena;
            return true;
        }else{
            return false;
        }
    }
    public boolean addStringEnd(String s){
        if(this.mCadena.length()+s.length()<=this.mLongitud){
            this.mCadena=this.mCadena+s;
            return true;
        }else{
            return false;
        }
    }
    public int numVocales(){
        int num=0;
        String cadena = this.mCadena.toLowerCase();
        for (int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'){
                num++;
            }
        }
        return num;
    }
}


