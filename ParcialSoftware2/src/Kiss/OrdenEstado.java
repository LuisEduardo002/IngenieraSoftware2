/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kiss;

/**
 *
 * @author lolor
 */

    public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        if (ordenId < 0) {
            return "Orden Invalida";
        } else if (ordenId == 0) {
            return "Pendiente";
        } else if (ordenId >= 100) {
            return "Completada";
        } else if (ordenId > 50) {
            return "En Progreso";
        } else {
            return "Pendiente";
        }
    }
}

