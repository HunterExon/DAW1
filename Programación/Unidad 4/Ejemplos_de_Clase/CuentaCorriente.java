package com.jdperez;

import java.util.Scanner;

/**
 * Clase CuentaCorriente
 * Información bancaria
 * @author Juan Diego Pérez
 * @version 0.1
 */
public class CuentaCorriente {

    //ATRIBUTOS

    /**
     * Saldo de la cuenta corriente
     */
    private float mSaldo;
    /**
     * Límite del descubierto
     */
    private float mLimiteDescubrimiento;
    /**
     * Nombre del cliente
     */
    private String mNombre;
    /**
     * DNI del cliente
     */
    private String mDni;
    /**
     * Banco al que pertenece la cuenta
     */
    private Banco mBanco;


    /**
     * Método para dar valores por defecto a la cuenta
     * @param nombre String que contiene el nombre del cliente
     * @param dni String que contiene el dni del cliente
     */
    public void crearCuenta(String nombre, String dni) {
        this.mNombre = nombre;
        this.mDni = dni;
        this.mSaldo = 0;
        this.mLimiteDescubrimiento = -50;
    }

    /**
     * Método que retira una cantidad determinada de la cuenta corriente
     * @param cantidad float que indica la cantidad que debemos retirar de la cuenta
     * @return booleano indicando si es posible la retirado de dinero sin sobrepasar el
     * descubierto
     */
    public boolean sacarDinero(float cantidad) {
        if (this.mSaldo-cantidad >= this.mLimiteDescubrimiento) {
            this.mSaldo-=cantidad;
            System.out.println("Transacción posible. Su nuevo saldo es:"+this.mSaldo);
            return true;
        }

        return false;
    }

    /**
     * Método que realiza un ingreso en la cuenta
     * @param cantidad float que representa la cantidad del nuevo ingreso.
     */
    public void ingresar(float cantidad) {
            this.mSaldo += cantidad;
    }


    /**
     * Método para presentar de manera normalizadala información de la cuenta     *
     */
    public void mostrar() {
        System.out.println("Información de la cuenta");
        System.out.println("Cliente:"+this.mNombre);
        System.out.println("DNI Cliente:"+this.mDni);
        System.out.println("Saldo:"+this.mSaldo);
        System.out.println("Límite de descubrimiento:"+this.mLimiteDescubrimiento);
    }

    public void establecerBanco(String nombre, String direccion,float capital) {
        this.mBanco = new Banco(nombre,direccion,capital);
    }

}
