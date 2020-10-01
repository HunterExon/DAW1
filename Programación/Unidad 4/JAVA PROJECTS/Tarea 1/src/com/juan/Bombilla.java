package com.juan;
/*
Actividad 8: Modelar una casa con muchas bombillas,
de forma que cada bombilla se pueda encender o
apagar individualmente. Para ello hacer una clase
Bombilla con una variable privada que indique si
está encencida o apagada, así como un método que nos
diga el estado de la bombilla. Además, queremos poner
un interruptor general, de forma que si saltan los fusibles,
todas las bombillas se muestran como apagadas. Cuando el fusible
se repara, las bombillas vuelven a estar encendidas o apagadas,
según estuvieran antes del percance. Cada bombilla se enciende o
se apagan individualmente, pero solo responde si su interruptor
particular está activado y además hay luz general.
*/

public class Bombilla {
    private boolean mEstado;

    /**
     * Esto crea cada bombilla individualmente apagadas por defecto
     */
    public Bombilla() {
        this.mEstado = false;
    }

    /**
     * @return
     * Con esto podemos saber el estado de la bombilla en concreto.
     */
    public boolean isEstado() {
        return mEstado;
    }

    /**
     * @param estado
     * Aquí volvemos a definir el estado de la bombilla con el interruptor.
     */
    public void interruptor(boolean estado) {
        this.mEstado = estado;
    }
}
