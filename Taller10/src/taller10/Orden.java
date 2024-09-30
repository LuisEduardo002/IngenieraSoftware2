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
class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private FabricaComputadoras fabrica = new FabricaComputadoras();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public void mostrarComputadoras() {
        for (Computadora comp : computadoras) {
            System.out.println("Procesador: " + comp.getProcesador() + ", Tarjeta Gráfica: " + comp.getTarjetaGrafica() + ", RAM: " + comp.getRam() + "GB");
        }
    }
}