package com.example.BODEGASTCCAPI.servicios;

import com.example.BODEGASTCCAPI.helpers.mensajes.Mensaje;
import com.example.BODEGASTCCAPI.helpers.validaciones.RemitenteValidacion;
import com.example.BODEGASTCCAPI.modelos.Remitente;
import com.example.BODEGASTCCAPI.repositorios.IRemitenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemitenteServicio {

    @Autowired
    IRemitenteRepositorio remitenteRepositorio;

    @Autowired
    RemitenteValidacion validacion;

    public Remitente guardarRemitente(Remitente datosRemitente) throws Exception{
        try{

            //aplicar validaciones a los datos recibidos
            //si sale bien la validacion llamo al repo para guardar los datos
            if(!this.validacion.validarNombre(datosRemitente.getNombres())){
                throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
            }

            if(!this.validacion.validarDepartamento(datosRemitente.getDepartamento())){
                throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());

            }

            if(!this.validacion.validarMunicipio(datosRemitente.getMunicipio())){
                throw new Exception(Mensaje.NOMBRE_INVALIDO.getMensaje());
            }
            if(!this.validacion.validarDireccion(datosRemitente.getDireccion())){
                throw new Exception(Mensaje.DIRECCION_INVALIDA.getMensaje());
            }

            return this.remitenteRepositorio.save(datosRemitente);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscar todos
    public List<Remitente> buscarTodosRemitentes(){
        return null;
    }

    //buscar por id
    public Remitente buscarRemitentePorId(Integer idRemitente){
        return null;
    }

    //buscar nombre
    public Remitente buscarRemitentePorNombre(String nombreRemitente){
        return null;
    }

    //modificar
    public Remitente modificarRemitente(Integer idRemitente, Remitente datosRemitente){
        return null;
    }

    //eliminar
    public boolean eliminarRemitente(Integer idRemitente){
        return true;
    }
}
