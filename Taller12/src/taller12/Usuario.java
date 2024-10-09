/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author lolor
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private IServicioCorreo servicioCorreo;

    public Usuario(String nombre, String identificacion, IServicioCorreo servicioCorreo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicioCorreo = servicioCorreo;
    }

    public void generarCorreo() {
        Correo correo = servicioCorreo.enviar(this);
        // Aquí puedes hacer más cosas con el correo si es necesario
        System.out.println("Correo generado: " + correo.getMensaje());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
  
    
}
