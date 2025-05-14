package com.Sebastian.ConversorDeMonedas.modelos;

public class DatosMonedaConvertir {
    //ATRIBUTOS
    private String monedaQueDeceaConvertir;
    private String monedaALaQueDeceaConvertir;
    private double montoAConvertir;

    //METODOS
    public DatosMonedaConvertir(String monedaQueDeceaConvertir, String monedaALaQueDeceaConvertir, double montoAConvertir) {
        this.monedaQueDeceaConvertir = monedaQueDeceaConvertir;
        this.monedaALaQueDeceaConvertir = monedaALaQueDeceaConvertir;
        this.montoAConvertir = montoAConvertir;
    }

    public String generarDireccionURI(String claveAPI) {
        return "https://v6.exchangerate-api.com/v6/" + claveAPI + "/pair/" + monedaQueDeceaConvertir
                + "/" + monedaALaQueDeceaConvertir + "/" + montoAConvertir;
    }
}
