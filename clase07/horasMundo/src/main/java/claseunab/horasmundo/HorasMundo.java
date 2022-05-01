/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package claseunab.horasmundo;

import claseunab.horasmundo.DTO.WorldTime;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;
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

/**
 *
 * @author luster
 */
public class HorasMundo {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String url = "http://worldtimeapi.org/api/timezone/Europe/London";
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("accept", "application/json");
        HttpResponse response = null;
        try {            
            response = httpClient.execute(request);
        } catch (IOException ex) {
            System.out.println("Error en la llamada");
        }
        
        if (response != null) {
            System.out.print("Status llamada: ");
            System.out.println(response.getStatusLine().getStatusCode());
            BufferedReader rd = null;
            try {
                rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));
            } catch (IOException ex) {
                Logger.getLogger(HorasMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (UnsupportedOperationException ex) {
                Logger.getLogger(HorasMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            StringBuffer result = new StringBuffer();
            String line = "";
            try {
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(HorasMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            System.out.println(result.toString());
            String jsonResponse = result.toString();
            WorldTime horas = null;
            try {
                horas = new ObjectMapper().readValue(jsonResponse, WorldTime.class);
            } catch (IOException ex) {
                Logger.getLogger(HorasMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
            System.out.print("Tiempo: ");
            System.out.println(horas.datetime);
        }
    }
}
