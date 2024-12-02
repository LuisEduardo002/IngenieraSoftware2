/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronPrototype;

/**
 *
 * @author lolor
 */
public class main {
    public static void main(String[] args) {
        // Crear un producto original
        Producto productoOriginal = new Producto("Laptop", 3500.50, "Electrónica");

        // Clonar el producto
        Producto productoClonado = (Producto) productoOriginal.clone();

        // Mostrar los productos
        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clonado: " + productoClonado);

        // Verificar que son diferentes objetos
        System.out.println("¿Son el mismo objeto? " + (productoOriginal == productoClonado));
    }
}
