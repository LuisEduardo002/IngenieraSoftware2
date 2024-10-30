/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltacohesionBajoAcoplamiento;

/**
 *
 * @author lolor
 */
public class DAOTareas implements IServicioDAOTareas{

    @Override
    public void insertarTarea(Tarea tarea) {
        System.out.println("insertando una tarea");
    }

    @Override
    public void leerTarea() {
        System.out.println("obteniendo una tarea");
    }
    
}
