/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indireccion;

/**
 *
 * @author lolor
 */
public class main {
        public static void main(String[] args) {
        IFactura facturaFisica = new FacturaFisica();
        IFactura facturaElectronica = new FacturaElectronica();

        // SE HACE CON LA MISMA INTERFAZ DE FACTURA
        facturaFisica.setCodigo("F123");
        facturaElectronica.setCodigo("E456");
    }
}
