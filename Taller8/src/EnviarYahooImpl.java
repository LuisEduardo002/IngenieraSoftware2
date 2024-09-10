/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class EnviarYahooImpl extends EnviarYahoo implements ISendEmail{

    public EnviarYahooImpl(String file, String destinatario, String sujeto, String cuerpo, String imagen) {
        super(file, destinatario, sujeto, cuerpo, imagen);
    }



    @Override
    public void SendEmail() {
    
        System.out.println("Enviando por Yahoo");
    }

    
}
