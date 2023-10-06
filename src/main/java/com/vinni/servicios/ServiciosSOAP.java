package com.vinni.servicios;

import java.util.List;


import com.vinni.dto.Usuario;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


public interface ServiciosSOAP{
    
    
    public List<Usuario> getUsuarios();
     
    
    public void addUsuario(@WebParam Usuario user);

    
}
