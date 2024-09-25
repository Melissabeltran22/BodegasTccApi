package com.example.BODEGASTCCAPI.helpers.mensajes;

public enum Mensaje {

    PESO_NEGATIVO("El peso no puede ser negativo"),
    VOLUMEN_NEGATIVO("eL volumen no puede ser negativo"),
    FECHA_INVALIDA("Revisa la fecha ingresada"),
    NOMBRE_INVALIDO("EL nombre no tiene un formato valido"),
    DIRECCION_INVALIDA("La dirrecion proporcionada no es valida"),
    CAPACIDAD_VOLUMEN("La capacidad del volumen no esta en el rango indicado"),
    CAPACIDAD_PESO("El peso sobrepasa lo estipulado"),
    CAPACIDAD_VOLUMEN_OCUPADO("EL volumen ocupado es superior al volumen permitido"),
    CAPACIDAD_PESO_OCUPADO("El peso ocupado es superior al peso permitido")

    ;

    private String mensaje;

    Mensaje() {
    }

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
