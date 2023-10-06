package com.vinni.servicios;

import java.util.List;

import com.vinni.dto.VehiculoDto;
import com.vinni.mock.Datos;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "usuarios")
public class SOAPImplementacion {
    private Datos datos = new Datos();

    // agregar vehiculo
    @WebMethod(operationName = "agregarVehiculo")
    private String addVehiculo(@WebParam VehiculoDto vehiculo) {
        datos.adicionarVeiculo(vehiculo);
        return "vehiculo agregado exitosamente";
    }

    // obtener vehiculos
    @WebMethod(operationName = "ObtenerVehiculos")
    public List<VehiculoDto> getVehiculos() {
        return datos.vehiculosList;
    }

    // obtener vehiculos por placa
    @WebMethod(operationName = "ObtenerVehiculoPorPlaca")
    public VehiculoDto getVehiculoPorPlaca(@WebParam String placa) throws VehicleNotFoundException {
        for (VehiculoDto vehiculo : datos.vehiculosList) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        throw new VehicleNotFoundException(
                "El vehiculo con placa " + placa + " no se encuentra registrado en el sistema.");
    }

    // obtener valor seguro soat por placa
    @WebMethod(operationName = "ObtenerSeguroSoatPorPlaca")
    public String getValorSeguroSoatPorPlaca(@WebParam String placa) throws VehicleNotFoundException {
        for (VehiculoDto vehiculo : datos.vehiculosList) {
            if (vehiculo.getPlaca().equals(placa)) {
                String message = "El vehiculo con placa " + placa + " pago " + "$" +
                        vehiculo.getValorSeguroSoat() + " por el seguro soat para el " + 2020
                        + " el estado de su seguro es" + " Activo";
                return message;
            }
        }
        throw new VehicleNotFoundException(
                "El vehiculo con placa " + placa + " no se encuentra registrado en el sistema.");
    }

    // obtener seguro todo riesgo por placa
    @WebMethod(operationName = "ObtenerSeguroTodoRiesgoPorPlaca")
    public String getSeguroTodoRiesgoPorPlaca(@WebParam String placa) throws VehicleNotFoundException {
        for (VehiculoDto vehiculo : datos.vehiculosList) {
            if (vehiculo.getPlaca().equals(placa)) {
                String message = "El vehiculo con placa " + placa + " pago " + "$" +
                        vehiculo.getSeguroTodoRiesgo() + " por el seguro todo riesgo para el " + 2020
                        + " el estado de su seguro es" + " Activo";
                return message;
            }
        }
        throw new VehicleNotFoundException(
                "El vehiculo con placa " + placa + " no se encuentra registrado en el sistema.");
    }

    public class VehicleNotFoundException extends Exception {
        public VehicleNotFoundException(String message) {
            super(message);
        }
    }

    // Obtener el valor del seguro todo riesgo para el año siguiente.
    @WebMethod(operationName = "SeguroTodoRiesgoProximoAnio")
    public String getSeguroTodoRiesgoPorPlaca2(@WebParam String placa) throws VehicleNotFoundException {
        for (VehiculoDto vehiculo : datos.vehiculosList) {
            if (vehiculo.getPlaca().equals(placa)) {
                double valorSeguroTodoRiesgo = vehiculo.getSeguroTodoRiesgo();
                double valorSeguroImpuesto = valorSeguroTodoRiesgo * 0.13 + valorSeguroTodoRiesgo;
                double descuento = valorSeguroImpuesto * 0.09;
                double valorSeguroTodoRiesgo2 = valorSeguroImpuesto - descuento;

                String message = "El valor del seguro todo riesgo para el vehiculo con placa " + placa + " para el año "
                        + 2021 + " es de " + "$" + valorSeguroTodoRiesgo2;
                return message;
            }
        }
        throw new VehicleNotFoundException(
                "El vehiculo con placa " + placa + " no se encuentra registrado en el sistema.");
    }

    // Obtener el valor del seguro soat para el año siguiente.
    @WebMethod(operationName = "SeguroSoatProximoAnio")
    public String getValorSeguroSoatPorPlaca2(@WebParam String placa) throws VehicleNotFoundException {
        for (VehiculoDto vehiculo : datos.vehiculosList) {
            if (vehiculo.getPlaca().equals(placa)) {
                double valorSeguroSoat = vehiculo.getValorSeguroSoat();
                double valorSeguroImpuesto = valorSeguroSoat * 0.13 + valorSeguroSoat;
                double descuento = valorSeguroImpuesto * 0.09;
                double valorSeguroSoat2 = valorSeguroImpuesto - descuento;

                String message = "El valor del seguro soat para el vehiculo con placa " + placa + " para el año "
                        + 2021 + " es de " + "$" + valorSeguroSoat2;
                return message;
            }
        }
        throw new VehicleNotFoundException(
                "El vehiculo con placa " + placa + " no se encuentra registrado en el sistema.");
    }
}
