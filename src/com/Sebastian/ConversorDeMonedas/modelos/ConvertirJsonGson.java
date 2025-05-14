package com.Sebastian.ConversorDeMonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertirJsonGson {
    //ATRIBUTOS
    private String json;
    private MonedaExchangeRateAPI monedaExchangeRateAPI;
    private Gson gson;

    //METODOS
    public ConvertirJsonGson(String json) {
        this.json = json;
        this.gson = new GsonBuilder().create();
    }

    public MonedaExchangeRateAPI convertirGson() {
        //Se cambian los datos de json a tipo Titulo.
        monedaExchangeRateAPI = gson.fromJson(json, MonedaExchangeRateAPI.class);
        return monedaExchangeRateAPI;
    }
}
