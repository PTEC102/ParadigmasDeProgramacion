/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.horasmundo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.codehaus.jackson.map.ObjectMapper;

 

/**
 *
 * @author mat
 */
public class HorasMundo {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello World!");
        
        String url = "http://worldtimeapi.org/api/timezone/Europe/London";
        
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(url) )
              .build();
        System.out.println(request);
        
        
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.toString()); // muestra el request
        System.out.println(response.body()); // muestra la respuesta
        
        
        String jsonResponse = response.body();
        
        WorldTime horas = null;
        horas = new ObjectMapper().readValue(jsonResponse, WorldTime.class);
        System.out.println(horas.datetime);
        System.out.println(horas.utc_datetime);
    
        
        
    }
}
