/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author lolor
 */
public class CorreoOutlook implements IServicioCorreo{

    @Override
    public Correo enviar(Usuario usuario) {
        String mensaje = "Correo enviado por outlook a "+usuario.getNombre();
        return new Correo(mensaje);
    }
    
}
