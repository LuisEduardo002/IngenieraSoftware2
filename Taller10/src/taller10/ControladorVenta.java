/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lolor
 */
class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();

    public ControladorVenta() {
        // Agregamos algunas entradas de ejemplo
        entradas.add(new Entrada("Concierto", 50.0, true));
        entradas.add(new Entrada("Teatro", 30.0, false));
        entradas.add(new Entrada("Cine", 10.0, true));
    }

    public void comprarEntrada(String tipoEntrada) {
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if (entrada != null && entrada.isDisponible()) {
            entrada.setDisponible(false);
            System.out.println("Entrada comprada: " + tipoEntrada);
        } else {
            System.out.println("Entrada no disponible.");
        }
    }

    private Entrada encontrarEntrada(String tipoEntrada) {
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equalsIgnoreCase(tipoEntrada)) {
                return entrada;
            }
        }
        return null;
    }
}