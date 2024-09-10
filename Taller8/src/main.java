/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ISendEmail servicioEmail = new EnviarGmailImpl("f", "s", "fg", "gth", "fef");
    Sistema sistema = new Sistema(servicioEmail);
    sistema.enviarEmail();
        
    }
    
}
