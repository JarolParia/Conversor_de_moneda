package com.alura.reto.models;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;


public class ConversorMoneda {

    private static final String API_KEY = "";

    public Moneda obtenerTasa(String base, String destino){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+ API_KEY +"/pair/"+
                base + "/" + destino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);

            if (!"success".equals(moneda.result())) {
                throw new RuntimeException("Error en la consulta a la API");
            }

            return moneda;

        } catch (IOException | InterruptedException e){
            throw new RuntimeException("No es posible la conversion", e);
        }

    }

    public double conversion(double cantidad, double tasa){
        return cantidad * tasa;
    }
}
