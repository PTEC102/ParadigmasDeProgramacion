/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseunab.horasmundoclase;

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
public class RestClientHorasMundo {
    
    public WorldTime getHoraDelLugar(String lugarUrl) throws IOException, InterruptedException{
        WorldTime newWorldHora = new WorldTime();
        
        String baseUrl = "http://worldtimeapi.org/api/timezone/";
        
        String fullUrl = baseUrl + lugarUrl;
        
        
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(fullUrl))
                .build();
        
        HttpClient cliente = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2).build();
        
        
        HttpResponse<String> respuesta = 
                cliente.send( request, HttpResponse.BodyHandlers.ofString());
                
        String jsonResponse = respuesta.body();
        
        
        newWorldHora = new ObjectMapper().readValue(jsonResponse, WorldTime.class);
        
        return newWorldHora;    
    }
}
