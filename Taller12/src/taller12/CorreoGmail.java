/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author lolor
 */
public class CorreoGmail implements IServicioCorreo{

    @Override
    public Correo enviar(Usuario usuario) {
        String mensaje = "Correo enviado por gmail a "+usuario.getNombre();
        return new Correo(mensaje);
    }
    
}
