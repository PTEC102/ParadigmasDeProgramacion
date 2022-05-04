/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.valordolar;

/**
 *
 * @author mat
 */
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;

public class ValorDolar {

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        Date date = new Date();  
        System.out.println(formatter.format(date));  
    
        System.out.println("El dia de hoy es " + formatter.format(date));
        
        //String url = "https://mindicador.cl/api/dolar/04-05-2022"; 
        String url = "https://mindicador.cl/api/dolar/"+ formatter.format(date);
                
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(url) )
              .build();
        System.out.println(request);
        
        
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.toString()); // muestra el request
            System.out.println(response.body()); // muestra la respuesta
             
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(response.body());
            
            System.out.println( json.get("serie")  );
            
            JSONArray jsonArray = (JSONArray) json.get("serie") ;
            System.out.println("Salida 1 (Json):");
            System.out.println(jsonArray.get(0));
            
            System.out.println("Salida 2 (string del valor del dolar):");
            System.out.println((  (JSONObject)jsonArray.get(0)).get("valor")  );      
             
           
        } catch (InterruptedException ex) {
            Logger.getLogger(ValorDolar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
