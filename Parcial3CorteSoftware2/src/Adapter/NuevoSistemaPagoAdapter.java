/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author lolor
 */
public class NuevoSistemaPagoAdapter implements SistemaOperacion {
    private NuevoSistemaPago nuevoSistemaPago;

    public NuevoSistemaPagoAdapter(NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void CrearSesion() {
        System.out.println("CREANDO LA SESION A " + nuevoSistemaPago.getNombre());
    }

    @Override
    public void validarCorreo() {
        System.out.println("Validando el correo: " + nuevoSistemaPago.getCorreo());
    }

    @Override
    public void validarAutorizacion() {
        System.out.println("Validando autorización.");
    }

    @Override
    public void realizarPago() {
        System.out.println("REALIZANDO EL PAGO");
    }
}
