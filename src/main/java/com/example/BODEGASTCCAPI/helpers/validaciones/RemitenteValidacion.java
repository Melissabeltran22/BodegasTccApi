package com.example.BODEGASTCCAPI.helpers.validaciones;

import org.springframework.stereotype.Component;

@Component
public class RemitenteValidacion {

    public boolean validarTexto(String texto, int maxLength) {
        if(texto.length() > maxLength) {
            return false;
        }
        return texto.matches("^[a-zA-Z\\s]+$");
    }

    public boolean validarNombre(String nombre){
        return validarTexto(nombre, 15);
    }
    public boolean validarDepartamento(String departamento){
        return validarTexto(departamento, 50);
    }
    public boolean validarMunicipio(String municipio){
        return validarTexto(municipio, 50);
    }

    public boolean validarDireccion(String direccion) {
        if (direccion.length() > 100) {
            return false;
        }
        return direccion.matches("^[a-zA-Z0-9\\s,\\.]+$");
    }

}
