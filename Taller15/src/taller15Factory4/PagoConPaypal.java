/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15Factory4;

/**
 *
 * @author lolor
 */
public class PagoConPaypal implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago con PayPal por: $" + cantidad);
    }
}