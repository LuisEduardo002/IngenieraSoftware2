/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lolor
 */
public class Libreria {


    private List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }


    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; 
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosAutor.add(libro);
            }
        }
        return librosAutor;
    }


    public List<Libro> obtenerLibrosEntrePrecios(double precioMin, double precioMax) {
        List<Libro> librosEntrePrecios = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getPrecio() >= precioMin && libro.getPrecio() <= precioMax) {
                librosEntrePrecios.add(libro);
            }
        }
        return librosEntrePrecios;
    }

    public List<Libro> obtenerLibrosPorAnio(int anio) {
        List<Libro> librosPorAnio = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnio() == anio) {
                librosPorAnio.add(libro);
            }
        }
        return librosPorAnio;
    }
}    

