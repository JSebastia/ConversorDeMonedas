package com.Sebastian.ConversorDeMonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PasarJsonGson {
    //ATRIBUTOS
    private String json;
    private MonedaExchangeRateAPI monedaExchangeRateAPI;
    private Gson gson;

    //METODOS
    public PasarJsonGson(String json) {
        this.json = json;
        this.gson = new GsonBuilder().create();
    }

    public MonedaExchangeRateAPI pasarGson
}
