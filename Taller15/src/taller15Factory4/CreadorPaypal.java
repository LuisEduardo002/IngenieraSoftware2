/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15Factory4;

/**
 *
 * @author lolor
 */
public class CreadorPaypal extends Creador {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoConPaypal();
    }
}