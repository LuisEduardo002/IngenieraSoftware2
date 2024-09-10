/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public abstract class EnviarYahoo extends Email implements ISendEmail{
        private String file;

    public EnviarYahoo(String file, String destinatario, String sujeto, String cuerpo, String imagen) {
        super(destinatario, sujeto, cuerpo, imagen);
        this.file = file;
    }

}
