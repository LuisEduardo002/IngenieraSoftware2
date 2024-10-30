/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author lolor
 */
public class main {
    public static void main(String[] args) {
            Libreria libreria = new Libreria();
    Libro libro1 = new Libro("elepep", "etesecg", 123, 1235);
        Libro libro2= new Libro("nose  ", "loco", 11323, 112235);
            Libro libro3 = new Libro("elegeepep", "foe", 23, 1);
         libreria.agregarLibro(libro3);
         libreria.agregarLibro(libro1);
         libreria.agregarLibro(libro2);
         System.out.println(libreria.buscarLibroPorTitulo("elepep"));
         System.out.println(libreria.buscarLibrosPorAutor("etesecg"));
         System.out.println(libreria.obtenerLibrosEntrePrecios(1, 120));
    }
}
