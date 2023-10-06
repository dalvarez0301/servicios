package com.vinni.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vinni.dto.Usuario;
import com.vinni.dto.VehiculoDto;

public class Datos {
    public List<Usuario> usuariosList;

    public Datos() {
        // usuariosList = new ArrayList<>(Arrays.asList(
        // new Usuario("Lavis", "Pa"),
        // new Usuario("Elsa", "Patero"),
        // new Usuario("Elcan", "Dado")));

        vehiculosList = new ArrayList<>(Arrays.asList(
                new VehiculoDto("M123", "Mazda", 2010, 1234567890),
                new VehiculoDto("M124", "Mazda", 2010, 1234567890),
                new VehiculoDto("M125", "Mazda", 2010, 1234567890)));
    }

    public void adicionarUsuario(String nombre, String apellido) {
        this.adicionarUsuario(new Usuario(nombre, apellido));
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuariosList.add(usuario);
    }

    public List<VehiculoDto> vehiculosList;

    public Datos(List<VehiculoDto> vehiculosList) {
        this.vehiculosList = vehiculosList;
    }

    public void adicionarVeiculo(VehiculoDto vehiculo) {
        this.vehiculosList.add(vehiculo);
    }

    public List<VehiculoDto> getVehiculosList() {
        return vehiculosList;
    }
}
