/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller15Factory4;

/**
 *
 * @author lolor
 */
public class Taller15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un servicio de pago con tarjeta
        Creador creadorTarjeta = new CreadorTarjeta();
        MetodoPago pagoTarjeta = creadorTarjeta.crearMetodoPago();
        pagoTarjeta.procesarPago(100.50);

        // Crear un servicio de pago con PayPal
        Creador creadorPaypal = new CreadorPaypal();
        MetodoPago pagoPaypal = creadorPaypal.crearMetodoPago();
        pagoPaypal.procesarPago(250.75);
    }
    
}
