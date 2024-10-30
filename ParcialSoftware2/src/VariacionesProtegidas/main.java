/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariacionesProtegidas;

/**
 *
 * @author lolor
 */
public class main {
    public static void main(String[] args) {
        CalcularImpuestoEEUU impuestoEUUU = new CalcularImpuestoEEUU();
        CalcularImpuestoColombia impuestoColombia = new CalcularImpuestoColombia();
           ServicioCalculadoraImpuestos calcular = new ServicioCalculadoraImpuestos(impuestoEUUU);
           calcular.calcularImpuesto();
          ServicioCalculadoraImpuestos calcular1 = new ServicioCalculadoraImpuestos(impuestoColombia);
          calcular1.calcularImpuesto();
    }
}
