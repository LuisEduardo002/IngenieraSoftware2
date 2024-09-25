
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class Biblioteca {
   
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getAutor()+"Autor"+libro.getTitulo()+"Titulo" +"año"+libro.getAñoPublicacion() );
        }
    }
}
