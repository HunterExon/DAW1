package com.juan;

public class Prueba {
    public static void main(String[] args){
        /*
        ==================
        [CUENTA CORRIENTE]
        ==================

        CuentaCorriente cc = new CuentaCorriente();

        cc.crearCuenta("Juan", "12345678A");
        cc.mostrarCuenta();
        cc.ingresarDinero(1000);
        cc.mostrarCuenta();

        if(!cc.sacarDinero(1200)){
            System.out.println("No hay fondos");
        }
        cc.mostrarCuenta();
         */

        /*
        =======
        [TEXTO]
        =======

        Texto texto = new Texto(10);

        texto.addStringStart("HOLA");
        texto.addStringEnd("ADIOS");

        System.out.println(texto.mCadena);

        if(!texto.addStringEnd("XXXX")){
            System.out.println("No cabe");
        }
        System.out.println(texto.mCadena);

        if(!texto.addStringEnd("X")){
            System.out.println("No cabe");
        }
        System.out.println(texto.mCadena);
         */

        /*
        ==============
        [SINTONIZADOR]
        ==============
        Sintonizador sn = new Sintonizador();
        sn.display();
        sn.subir();
        sn.subir();
        sn.display();
        sn.bajar();
        sn.display();
        sn.bajar();
        sn.bajar();
        sn.display();
         */

        /*
        ===========
        [BOMBILLAS]
        ===========
         */
        Casa miCasa=new Casa(10);

        miCasa.setmBombilla(5, true);
        miCasa.setmBombilla(2,true);
        miCasa.setmBombilla(7,true);

        if(miCasa.getmBombilla(7)){
            System.out.println("ENCENDIDA");
        }

        miCasa.setmFusibles(false);

        if(!miCasa.getmBombilla(7)){
            System.out.println("APAGADA");
        }

    }
}
