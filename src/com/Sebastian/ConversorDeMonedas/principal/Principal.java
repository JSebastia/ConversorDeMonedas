package com.Sebastian.ConversorDeMonedas.principal;

import com.Sebastian.ConversorDeMonedas.modelos.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String claveAPI = "073d2249095a441d139d910c";
        Scanner teclado  = new Scanner(System.in);
        String [] datos = new String[4];

        while (true) {
            try {
                String monedaIngresada = "";
                String monedaPedida = "";
                String paisMonedaIngresada = "";
                String paisMonedaPedida = "";
                menu();


                System.out.println("Ingrese: ");
                int opcion = Integer.valueOf(teclado.nextLine());

                if (opcion == 0) {
                    System.out.println("Gracias por usar el Conversor de monedas...");
                    break;
                }

                System.out.println("Ingrese la cantidad que decea convertir: ");
                double cantidad = teclado.nextDouble();
                teclado.nextLine();


                switch (opcion) {
                    case 1:
                        monedaIngresada = "USD";
                        monedaPedida = "COP";
                        paisMonedaIngresada = "Dolar";
                        paisMonedaPedida = "Peso Colombiano";
                        break;
                    case 2:
                        monedaIngresada = "COP";
                        monedaPedida = "USD";
                        paisMonedaIngresada = "Peso Colombiano";
                        paisMonedaPedida = "Dolar";
                        break;
                    case 3:
                        monedaIngresada = "USD";
                        monedaPedida = "ARS";
                        paisMonedaIngresada = "Dolar";
                        paisMonedaPedida = "Peso Argentino";
                        break;
                    case 4:
                        monedaIngresada = "ARS";
                        monedaPedida = "USD";
                        paisMonedaIngresada = "Peso Argetino";
                        paisMonedaPedida = "Dolar";
                        break;
                    case 5:
                        monedaIngresada = "USD";
                        monedaPedida = "BRL";
                        paisMonedaIngresada = "Dolar";
                        paisMonedaPedida = "Real Brasileño";
                        break;
                    case 6:
                        monedaIngresada = "BRL";
                        monedaPedida = "USD";
                        paisMonedaIngresada = "Real Brasileño";
                        paisMonedaPedida = "Dolar";
                        break;
                    default:
                        System.out.println("----> La opcion " + opcion + ", no fue encontrada... <----");
                        continue;
                }

                DatosMonedaConvertir datosMonedaConvertir = new DatosMonedaConvertir(monedaIngresada, monedaPedida, cantidad);
                String direccionURI = datosMonedaConvertir.generarDireccionURI(claveAPI);

                ConsultarAPI consultarAPI = new ConsultarAPI(direccionURI);
                consultarAPI.pedirDatosAPI();
                String json = consultarAPI.consultarDatos();

                ConvertirJsonGson convertirJsonGson = new ConvertirJsonGson(json);
                MonedaExchangeRateAPI monedaExchangeRateAPI = convertirJsonGson.convertirGson();

                DatosUsuarioMoneda datosUsuarioMoneda = new DatosUsuarioMoneda(monedaExchangeRateAPI);
                datosUsuarioMoneda.mostrarDatosMoneda(cantidad, paisMonedaIngresada, paisMonedaPedida);

            } catch (NumberFormatException  | InputMismatchException  e) {
                System.out.println("----> ¡Ooops!, solo se admiten números en esta sección...");
                System.out.println(e);
            }
        }

        teclado.close();
    }

    public static void menu(){
        String menu = """
                ****************************************
                *    ---> CONVERSOR DE MONEDAS <---    *  
                ****************************************
                *   1 - Dolar ----> Peso Colombiano.   *
                *   2 - Peso Colombiano ----> Dolar.   *
                *   3 - Dolar ----> Peso Argentino.    *   
                *   4 - Peso Argentino ----> Dolar.    *
                *   5 - Dolar ----> Real Brasileño.    *
                *   6 - Real Brasileño ----> Dolar.    *
                *   0 - Salir.                         *
                ****************************************""";

        System.out.println(menu);
    }

}
