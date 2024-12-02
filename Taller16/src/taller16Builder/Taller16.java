/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16Builder;

/**
 *
 * @author lolor
 */
public class Taller16 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario.Builder()
                .setNombre("Juan Pérez")
                .setEdad(25)
                .setCorreo("juan.perez@example.com")
                .addInteres("Deportes")
                .addInteres("Tecnología")
                .build();

        Usuario usuario2 = new Usuario.Builder()
                .setNombre("María López")
                .setEdad(30)
                .setCorreo("maria.lopez@example.com")
                .addInteres("Arte")
                .addInteres("Viajes")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
    }
    
}
