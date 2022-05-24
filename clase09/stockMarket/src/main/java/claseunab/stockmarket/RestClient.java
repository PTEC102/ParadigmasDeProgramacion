/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseunab.stockmarket;

import claseunab.stockmarket.DTO.AccionesBolsaDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.System.Logger.Level;
import java.util.List;
import java.util.logging.Logger;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


/**
 *
 * @author luster
 */
public class RestClient {
    
    public String urlBase = "https://stockmarketunab.azurewebsites.net/api/";
    
    
    public List<AccionesBolsaDTO> makeRequestGet(String pathUrl) throws IOException, InterruptedException {

        String urlFinal = this.urlBase + pathUrl;

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(urlFinal);
        request.addHeader("accept", "application/json");
        
        HttpResponse response = null;
        
        try {            
            response = httpClient.execute(request);
        } catch (IOException ex) {
            System.out.println("Error en la llamada");
        }
        
        List<AccionesBolsaDTO> myObjects = null;
        
        if (response != null) {
            System.out.print("Status llamada: ");
            System.out.println(response.getStatusLine().getStatusCode());             
            
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            
            StringBuffer result = new StringBuffer();
            String line;
            
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            
            String jsonResponse = result.toString();
            
            myObjects = new ObjectMapper().readValue(jsonResponse, new TypeReference<List<AccionesBolsaDTO>>(){});
        }
                
        return myObjects;
    }
    
    public AccionesBolsaDTO makeRequestPost(String pathUrl, String stockName) throws UnsupportedEncodingException, IOException{
        String urlFinal = this.urlBase + pathUrl;

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(urlFinal);
        request.addHeader("accept", "application/json");
        
        
        String json = "{\"strockName\" : \""+stockName +"\"}";
        StringEntity entity = new StringEntity(json);
        request.setEntity(entity);
        request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        
        HttpResponse response = httpClient.execute(request);
        
        AccionesBolsaDTO myObject = null;
        
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            
        StringBuffer result = new StringBuffer();
        String line;

        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        String jsonResponse = result.toString();
        
        myObject = new ObjectMapper().readValue(jsonResponse, AccionesBolsaDTO.class);
        
        return myObject;    
    
    }

}
