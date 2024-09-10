/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class EnviarGmailImpl extends EnviarGmail implements ISendEmail{

    public EnviarGmailImpl(String image, String destinatario, String sujeto, String cuerpo, String imagen) {
        super(image, destinatario, sujeto, cuerpo, imagen);
    }



    @Override
    public void SendEmail() {       
        System.out.println("Enviando por Gmail");
    }

  
    
    
}
