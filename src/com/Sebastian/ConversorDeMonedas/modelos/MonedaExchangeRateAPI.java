package com.Sebastian.ConversorDeMonedas.modelos;

public record MonedaExchangeRateAPI(String base_code, String target_code,double conversion_rate, double conversion_result) {
}
