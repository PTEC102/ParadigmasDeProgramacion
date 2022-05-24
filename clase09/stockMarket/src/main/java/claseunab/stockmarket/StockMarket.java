/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package claseunab.stockmarket;

import claseunab.stockmarket.DTO.AccionesBolsaDTO;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author luster
 */
public class StockMarket {

    public static void main(String[] args) throws IOException, InterruptedException {        
        
        List<AccionesBolsaDTO> listaStock = new RestClient().makeRequestGet("GetStock");
        //AccionesBolsaDTO listaStock2 = new RestClient().makeRequestPost("StockAmount");
        
        new Visual(listaStock).setVisible(true);
    }
}
