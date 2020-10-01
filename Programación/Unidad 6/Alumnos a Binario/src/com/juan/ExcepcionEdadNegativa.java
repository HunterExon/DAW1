package com.juan;

public class ExcepcionEdadNegativa extends Exception{
    //estamos mandandole al construcctor un string, que realmente le viene dado del constructor de alumno
    public ExcepcionEdadNegativa(String message) {
        super(message);
    }
    //estamos mandandole al construcctor un string, que realmente le viene dado del constructor de alumno

}
