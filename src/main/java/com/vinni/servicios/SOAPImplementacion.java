package com.vinni.servicios;

import java.util.List;

import com.vinni.dto.Banco;
import com.vinni.dto.DatosEntrada;
import com.vinni.dto.DatosSalida;
import com.vinni.dto.Universidad;
import com.vinni.dto.Usuario;
import com.vinni.dto.VehiculoDto;
import com.vinni.mock.Datos;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "usuarios")
public class SOAPImplementacion {
    private Datos datos = new Datos();

    // @WebMethod(operationName = "obtener")
    // public List<Usuario> getUsuarios() {

    // return datos.usuariosList;
    // }

    // @WebMethod(operationName = "adicionar")
    // public void addUsuario(@WebParam Usuario usuario) {
    // datos.adicionarUsuario(usuario);
    // }

    // @WebMethod(operationName = "consultaUniversidad")
    // public Universidad consulta(@WebParam String nit) {
    // return new Universidad("nit", "nit");
    // }

    // @WebMethod(operationName = "dataIn")
    // public DatosEntrada DataIn(@WebParam String cedula) {
    // return new DatosEntrada(123, "28/9/23");
    // }

    // @WebMethod(operationName = "consultaSaldo")
    // public DatosSalida DataOut(@WebParam DatosEntrada datos) {
    // // System.out.println(datos.getCedula());
    // return new DatosSalida(23, 123, new Banco(123, "Miguel"));
    // }

    @WebMethod(operationName = "agregarVehiculo")
    public void addVehiculo(@WebParam VehiculoDto vehiculo) {
        datos.adicionarVeiculo(vehiculo);
    }

    // obtener vehiculos
    @WebMethod(operationName = "obtenerVehiculos")
    public List<VehiculoDto> getVehiculos() {
        return datos.vehiculosList;
    }

    // @WebMethod(operationName = "adicionar")
    // public void addUsuario(@WebParam Usuario usuario) {
    // datos.adicionarUsuario(usuario);
    // }
}
