import java.util.ArrayList;
import java.util.List;






public class main {

    // Método para invertir una cadena
    public static String invertirCadena(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    // Método para encontrar el número mayor en un arreglo de enteros
    public static int encontrarMayor(int[] numeros) {
        int mayor = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    // Método para validar un correo electrónico
    public static void emailValido(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido");
        } else {
            System.out.println("Email válido");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de ejecución para invertirCadena
       String cadena = "El que quiero que me quiera";
        System.out.println("Cadena original: " + cadena);
       
     System.out.println("Cadena invertida: " + invertirCadena(cadena));

        // Ejemplo de ejecución para encontrarMayor
        int[] numeros = {1, 8, 35, 123, 0, 31};
        System.out.println("El mayor número es: " + encontrarMayor(numeros));

        // Ejemplo de ejecución para emailValido
        String email = "elelpepe.com";
        System.out.println("Validación de email: " + email);
        emailValido(email);

        // Ejemplo de uso de la clase Biblioteca y Libro
        Libro libro1 = new Libro("Guerra de ppopo", "elmaspro", 1949);
        Libro libro2 = new Libro("Harrtpotrer", "elepep", 1967);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        System.out.println("Libros en la biblioteca:");
        biblioteca.mostrarLibros();
    }
}
