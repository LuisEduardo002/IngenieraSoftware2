/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariacionesProtegidas;

/**
 *
 * @author lolor
 */
public class ServicioCalculadoraImpuestos {
    ICalcularImpuesto impuestocalcular;

    public ServicioCalculadoraImpuestos(ICalcularImpuesto impuestocalculaar) {
        this.impuestocalcular = impuestocalculaar;
    }
    
    public void calcularImpuesto(){
        impuestocalcular.calcularImpuesto();
    }
}
