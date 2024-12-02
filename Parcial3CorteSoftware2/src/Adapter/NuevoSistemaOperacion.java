/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author lolor
 */
public class NuevoSistemaOperacion {
    public void CrearSesion(SistemaOperacion sistemaOperacion) {
        sistemaOperacion.CrearSesion();
    }

    public void validarCorreo(SistemaOperacion sistemaOperacion) {
        sistemaOperacion.validarCorreo();
    }

    public void validarAutorizacion(SistemaOperacion sistemaOperacion) {
        sistemaOperacion.validarAutorizacion();
    }

    public void realizarPago(SistemaOperacion sistemaOperacion) {
        sistemaOperacion.realizarPago();
    }
}

