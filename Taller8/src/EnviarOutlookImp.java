/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class EnviarOutlookImp extends EnviarOutlook implements ISendEmail{

    public EnviarOutlookImp(String destinatario, String sujeto, String cuerpo, String imagen) {
        super(destinatario, sujeto, cuerpo, imagen);
    }

    @Override
    public void SendEmail() {
        System.out.println("enviando por outlook");
    }

    
  
}
