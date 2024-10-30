/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltacohesionBajoAcoplamiento;

/**
 *
 * @author lolor
 */
public class NotificadorSMS implements IServicioNotificaciones{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("enviando notificacion por SMS" + notificacion.getTesto());
        }
    
}
