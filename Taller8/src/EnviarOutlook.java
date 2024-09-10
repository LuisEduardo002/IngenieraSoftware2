/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public abstract class EnviarOutlook extends Email implements ISendEmail{

    public EnviarOutlook(String destinatario, String sujeto, String cuerpo, String imagen) {
        super(destinatario, sujeto, cuerpo, imagen);
    }
    
}
