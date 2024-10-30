/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltacohesionBajoAcoplamiento;

/**
 *
 * @author lolor
 */
public class ServicioNotificador {
    IServicioNotificaciones notificador;

    public ServicioNotificador(IServicioNotificaciones notificador) {
        this.notificador = notificador;
    }
    
    public void notificar(Notificacion notificacion){
        notificador.enviarNotificacion(notificacion);
    }
}
