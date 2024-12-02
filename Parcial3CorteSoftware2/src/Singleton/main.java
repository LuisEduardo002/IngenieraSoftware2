/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author lolor
 */
public class main {

  public static void main(String[] args) {

     Configuracion configuracion = Configuracion.getInstancia();

 
      System.out.println("rurl: " + configuracion.getUrl());
      System.out.println("usuario: " + configuracion.getUsuario());
      System.out.println("comtraseña: " + configuracion.getPassword());


            configuracion.setUrl("nuevaBaseDaros");
            configuracion.setUsuario("nuevoAdmin");
                    configuracion.setPassword("contrañse nueva");

       Configuracion nuevaConfiguracion = Configuracion.getInstancia();
        System.out.println("\n nueva instancia:");
        System.out.println("URL: " + nuevaConfiguracion.getUrl());
        System.out.println("usuario: " + nuevaConfiguracion.getUsuario());
        
        System.out.println("contrañea: " + nuevaConfiguracion.getPassword());


}

}
