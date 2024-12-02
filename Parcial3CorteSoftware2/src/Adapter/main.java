/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author lolor
 */
public class main {

    public static void main(String[] args) {
        // Crear un objeto de NuevoSistemaPago
        NuevoSistemaPago nuevoPago = new NuevoSistemaPago("Juan Perez", "12345678", "juanperez@gmail.com");

        // Adaptamos el sistema de pago
        SistemaOperacion sistemaOperacion = new NuevoSistemaPagoAdapter(nuevoPago);

        // Crear un objeto de NuevoSistemaOperacion
        NuevoSistemaOperacion sistemaOperacionCliente = new NuevoSistemaOperacion();

        // Usamos el sistema adaptado
        sistemaOperacionCliente.CrearSesion(sistemaOperacion);
        sistemaOperacionCliente.validarCorreo(sistemaOperacion);
        sistemaOperacionCliente.validarAutorizacion(sistemaOperacion);
        sistemaOperacionCliente.realizarPago(sistemaOperacion);
    
}

}
