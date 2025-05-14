package com.Sebastian.ConversorDeMonedas.modelos;

public class DatosUsuarioMoneda {
    //ATRIBUTOS
    private String monedaIngresada;
    private String monedaConvertida;
    private double equivalenciaMonedaConvertida;
    private double montoConvertido;

    //METODOS
    public DatosUsuarioMoneda(MonedaExchangeRateAPI monedaExchangeRateAPI) {
        this.monedaIngresada = monedaExchangeRateAPI.base_code();
        this.monedaConvertida = monedaExchangeRateAPI.target_code();
        this.equivalenciaMonedaConvertida = monedaExchangeRateAPI.conversion_rate();
        this.montoConvertido = monedaExchangeRateAPI.conversion_result();
    }
    public void mostrarDatosMoneda(double montoPedido) {
        String datos = """
                Conversión de Moneda %s ------> Moneda %s.
                1 %s equivale a %f %s.
                Conversión: %f %s equivale a %f %s.
                """.formatted(monedaIngresada, monedaConvertida, monedaIngresada, equivalenciaMonedaConvertida,
                monedaConvertida, montoPedido, monedaIngresada, montoConvertido, monedaConvertida);
        System.out.println(datos);
    }
}
