package com.juan;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class LineaPedido {
    private String nombreProducto;
    private int cantidad;

    public LineaPedido(String nombreProducto, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
     public static void formatoLista(List<LineaPedido> lista, Map<String,Float> mapa){
         float total = 0;
         DecimalFormat formato1 = new DecimalFormat("#.00");

         System.out.println("_________________________________________");
         System.out.println("  Producto   Precio   Cantidad  Subtotal");
         System.out.println("-----------------------------------------");
         for(LineaPedido l1: lista){

             float subtotal=l1.getCantidad()*mapa.get(l1.getNombreProducto().toUpperCase());
             total+=subtotal;
             System.out.println("   "+l1.getNombreProducto()+ "       "
                     + mapa.get(l1.getNombreProducto().toUpperCase())
                     + "       "+l1.getCantidad()+"        "
                     + subtotal);
         }
         System.out.println("-----------------------------------------");

         System.out.println("  TOTAL=                          "+formato1.format(total));// Resultado => 3,30 no quita el cero, si lo quiero sin cero es DecimalFormat formato2 = new DecimalFormat("#.##"); Ante la duda visitar--> https://programandoointentandolo.com/2017/11/limitar-numero-decimales-double-float-java.html
         System.out.println("_________________________________________");
     }
}
