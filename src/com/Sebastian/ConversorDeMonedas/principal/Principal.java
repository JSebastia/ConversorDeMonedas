package com.Sebastian.ConversorDeMonedas.principal;

import com.Sebastian.ConversorDeMonedas.modelos.*;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String claveAPI = "073d2249095a441d139d910c";
        DatosMonedaConvertir datosMonedaConvertir = new DatosMonedaConvertir("USD","COP",3000);
        String direccionURI = datosMonedaConvertir.generarDireccionURI(claveAPI);

        ConsultarAPI consultarAPI = new ConsultarAPI(direccionURI);
        consultarAPI.pedirDatosAPI();
        String json = consultarAPI.consultarDatos();

        ConvertirJsonGson convertirJsonGson = new ConvertirJsonGson(json);
        MonedaExchangeRateAPI monedaExchangeRateAPI = convertirJsonGson.convertirGson();

        DatosUsuarioMoneda datosUsuarioMoneda = new DatosUsuarioMoneda(monedaExchangeRateAPI);
        datosUsuarioMoneda.mostrarDatosMoneda(20);
    }

}
