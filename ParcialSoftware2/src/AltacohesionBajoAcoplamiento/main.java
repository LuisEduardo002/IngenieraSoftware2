/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltacohesionBajoAcoplamiento;

/**
 *
 * @author lolor
 */
public class main {
    public static void main(String[] args) {
        NotificadorWhatsapp notificadorwhataspp = new NotificadorWhatsapp();
     Notificacion notificacion1 = new Notificacion("hola");
    ServicioNotificador notificador = new ServicioNotificador(notificadorwhataspp);
    notificador.notificar(notificacion1);
     Tarea tarea1 = new Tarea("lavarloza");
     DAOTareas sistemasTareas= new DAOTareas();
     sistemasTareas.insertarTarea(tarea1);
    }
}
