package com.juan;
/*
Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero), nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:

-Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de -50 euros.

-Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano que indique lo mismo.

-Ingresar dinero: se incrementa el saldo.

-Mostrar información: muestra la información de la cuenta corriente.
 */
public class CuentaCorriente {
    private double mSaldo;
    private double mLimiteDescubrimiento;
    private String mNombre;
    private String mDNI;
    private Banco mBanco;

    public void crearCuenta(String nombre, String DNI){
        this.mDNI = DNI;
        this.mNombre = nombre;
        this.mSaldo = 0;
        this.mLimiteDescubrimiento = -50;
    }

    public boolean sacarDinero(double cantidad) {
        if(this.mSaldo-cantidad>=this.mLimiteDescubrimiento){
            this.mSaldo-=cantidad;
            System.out.println("==TRANSACCIÓN POSIBLE==");
            System.out.println("==SU NUEVO SALDO ES: "+this.mSaldo+"==");
            return true;
        }else{
            return false;
        }
    }
    public void ingresarDinero(double cantidad) {
        this.mSaldo+=cantidad;
    }
    public void mostrarCuenta() {
        System.out.println("===============");
        System.out.println("||INFORMACIÓN||");
        System.out.println("||Cliente: "+this.mNombre+"||");
        System.out.println("||DNI: "+this.mDNI+"||");
        System.out.println("||Saldo: "+this.mSaldo+"||");
        System.out.println("||Límite: "+this.mLimiteDescubrimiento+"||");
        System.out.println("===============");
    }
    public void setmBanco(Banco mBanco) {
        this.mBanco = mBanco;
    }
}


