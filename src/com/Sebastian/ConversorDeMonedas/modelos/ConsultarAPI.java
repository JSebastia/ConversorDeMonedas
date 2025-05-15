package com.Sebastian.ConversorDeMonedas.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {
    //ATRIBUTOS
    private String direccionURI;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    //METDOS
    public ConsultarAPI(String direccionURI) {//CONSTRUCTOR
        this.direccionURI = direccionURI;
        //HttpClient se encarga de enviar la solicitud al servidor.
        client = HttpClient.newHttpClient();
    }

    public void pedirDatosAPI() throws IOException, InterruptedException {
        System.out.println("Cargando...");//Muestra al usuario un "anuncio" (la consulta a la API puede tardar)
        //HttpRequest se encarga de realizar la petición al servidor con los detalles solicitados.
        request = HttpRequest.newBuilder().uri(URI.create(direccionURI)).build();
        //HttpRespose se encarga de recibir la respuesta de la petición (recibe los datos entregados por el servidor).
        response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println("Completado.");//Mustra al usuario un "anuncio" (dar como terminada la consulta)
    }

    public String consultarDatos() {
        //Retorna el Json de los datos.
        return response.body();
    }
}
