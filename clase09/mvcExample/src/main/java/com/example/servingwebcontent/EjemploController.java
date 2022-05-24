/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.servingwebcontent;

import DTO.ResponseDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Ejemplo")
public class EjemploController {

    @RequestMapping(method = RequestMethod.GET)
    public String elMetodoGet(Model model) {
        model.addAttribute("message", "desde el metodo Get!");

        return "holaEjemplo";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String elMetodoPost(Model model) {
        model.addAttribute("message", "desde el metodo Post!");
        return "holaEjemplo";
    }

    @GetMapping("/algoespecifico")
    public String algoespecifico(Model model) {
        model.addAttribute("message", "desde un metodo especifico!");
        return "holaEjemplo";
    }

    @GetMapping("/obteneralgo")
    @ResponseBody
    public String obteneralgo(Model model) {

        return "algo";
    }

    @GetMapping("/obtenerjson")
    @ResponseBody
    public String obtenerjson(Model model) {

        ResponseDTO data = new ResponseDTO("Hola");

        String mensajeJson = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            mensajeJson = mapper.writeValueAsString(data);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(EjemploController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mensajeJson;
    }
}
