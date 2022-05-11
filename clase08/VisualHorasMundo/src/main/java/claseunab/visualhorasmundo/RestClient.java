/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseunab.visualhorasmundo;

import DTO.WorldTime;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author luster
 */
public class RestClient {
    public WorldTime getTimeLocation(String locationUrl) throws IOException, InterruptedException{
        WorldTime newWordHour = new WorldTime();
        
        String baseUrl = "http://worldtimeapi.org/api/timezone/";
        
        String fullUrl = baseUrl + locationUrl;
        
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(fullUrl) )
              .build();
        
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        
        HttpResponse<String> respuesta = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        String jsonResponse = respuesta.body();
        
        newWordHour = new ObjectMapper().readValue(jsonResponse, WorldTime.class);
        
        return newWordHour;
    }
}
