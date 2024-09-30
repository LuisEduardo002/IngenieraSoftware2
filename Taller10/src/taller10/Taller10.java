package taller10;

import java.util.ArrayList;
import java.util.List;



public class Taller10 {
    public static void main(String[] args) {
        // Crear libros de ejemplo
        Libro libro1 = new Libro("el h9ombre", "dios", "1", 19.99);
        Libro libro2 = new Libro("elpepep", "josejose", "12", 25.50);



        Carrito carrito = new Carrito();


        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);


    
        double total = carrito.calcularPrecioTotal();
        System.out.println("El precio total de los libros en el carrito es " + total);

 
        carrito.eliminarLibro(libro2);
        total = carrito.calcularPrecioTotal();
        System.out.println("El precio total después de eliminar un libro es   " + total);
        
          // Ejemplo comptadoras
        Orden orden = new Orden();
        orden.agregarComputadora("intel i123", "gtx 1020", 16);
        orden.agregarComputadora("amd", "rx 510", 8);
        System.out.println("Computadoras cpmpradas");
        orden.mostrarComputadoras();
        System.out.println();

        // Ejemplo de uso entradas
        Usuario usuario = new Usuario();
        System.out.println("Entradas  :  ");
        usuario.comprar("Cine");       
        usuario.comprar("Teatro");    //nohayde esta
        usuario.comprar("Concierto");  
    }
}
