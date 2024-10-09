/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13;

/**
 *
 * @author lolor
 */
public class CanalSMS implements CanalNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviadno por el canal SMS la notificacion con titulo :"+ notificacion.getTitulo());
        
    }
    
}
