/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseunab.stockmarket.DTO;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author luster
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccionesBolsaDTO {
        
    public String nombreAccion;

    public String descripcionAccion;

    public int cantidad;

    public float precioUnitario;

    public float precioTotal;

    public boolean estadoAccion;

    public String tipoMoneda;

}
