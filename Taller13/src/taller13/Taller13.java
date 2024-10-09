/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller13;

/**
 *
 * @author lolor
 */
public class Taller13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Notificacion notificacion = new Notificacion ( "EL MUNDO ESTA PASANDO POR 3 HURACANES", "ELPEKFÑIWJGPOWEJNGIOERJG");
       CanalNotificacion canalSMS = new CanalSMS();
       Notificador notificadorSMS = new Notificador(canalSMS);
       
       notificadorSMS.notificar(notificacion);
       
        Notificacion notificacion2 = new Notificacion("elpepe", "etesech");
        CanalNotificacion canalWhatsapp = new CanalWhatsapp();
        Notificador notificadorWhatsapp = new Notificador(canalWhatsapp);
        notificadorWhatsapp.notificar(notificacion2);
    }
    
}
