/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12;

/**
 *
 * @author lolor
 */
public class Taller12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioCorreo gmailServicio = new CorreoGmail();
        IServicioCorreo outlookServicio = new CorreoOutlook();
        
        Usuario usuarioEnviarOutlook = new Usuario("elepepe", "123", gmailServicio);
        Usuario usuarioEnviargmail = new Usuario("tomas", "11", outlookServicio);
        
        usuarioEnviarOutlook.generarCorreo();
        usuarioEnviargmail.generarCorreo();
    }
    
}
