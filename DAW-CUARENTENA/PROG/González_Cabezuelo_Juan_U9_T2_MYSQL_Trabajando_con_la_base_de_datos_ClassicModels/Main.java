package com.juan;

public class Main {
    public static void main(String[] args) {
        ADClassicModels ADC = new ADClassicModels();
        System.out.println(ADC.getEmployee());
        System.out.println(ADC.getOffice());
        ConexionDB.DBClose();
    }
}
