package com.juan;
/*
Actividad 6: Diseñar la clase Banco de la que interesa guardar su nombre,
capital y la dirección central. Los bancos tienen las siguientes restricciones:

a) Siempre tienen que tener un nombre, que no puede ser modificado

b) Si no se especifica, todos los bancos tienen un capital por defecto
de 5.2 millones de euros al crearse.

c) El capital y la dirección de un banco son modificables.

Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto
de tipo Banco. Escribir los métodos necesarios en la clase CuentaCorriente
para gestionar el banco al que pertenece (cambiar de banco, mostrar
la info de la cuenta, incluídos los datos del banco si lo tiene vinculado).
Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún banco.
 */
public class Banco {
    private String mNombre;
    private Double mCapital;
    private String mDireccion;

    public Banco (String nombre, Double capital, String direccion){
        this.mNombre=nombre;
        this.mCapital=capital;
        this.mDireccion=direccion;
    }
    public Banco (String nombre, String direccion){
        this.mNombre=nombre;
        this.mCapital=5200000.0;
        this.mDireccion=direccion;
    }
    public String getmNombre() {
        return mNombre;
    }
    public Double getmCapital() {
        return mCapital;
    }
    public void setmCapital(Double mCapital) {
        this.mCapital = mCapital;
    }
    public String getmDireccion() {
        return mDireccion;
    }
    public void setmDireccion(String mDireccion) {
        this.mDireccion = mDireccion;
    }
}
