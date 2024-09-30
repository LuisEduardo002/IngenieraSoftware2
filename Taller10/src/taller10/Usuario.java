/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10;

/**
 *
 * @author lolor
 */
class Usuario {
    private ControladorVenta controlador = new ControladorVenta();

    public void comprar(String tipoEntrada) {
        controlador.comprarEntrada(tipoEntrada);
    }
}