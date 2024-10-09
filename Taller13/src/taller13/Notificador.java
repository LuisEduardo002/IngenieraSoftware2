/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13;

/**
 *
 * @author lolor
 */
public class Notificador {
    public CanalNotificacion notificador;

    public Notificador(CanalNotificacion notificador) {
        this.notificador = notificador;
    }
    
    public void notificar(Notificacion notificacion){
        notificador.enviarNotificacion(notificacion);
    }
}
