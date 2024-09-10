/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public abstract class EnviarGmail  extends Email implements ISendEmail{
        private String image;

    public EnviarGmail(String image, String destinatario, String sujeto, String cuerpo, String imagen) {
        super(destinatario, sujeto, cuerpo, imagen);
        this.image = image;
    }

}