/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lolor
 */
public class main {
    public static void main(String[] args) {
                Producto producto1 = new Producto("Televisro", 1500.00, 1);
        Producto producto2 = new Producto("Celular", 800.00, 2);
        Producto producto3 = new Producto("Teclado", 50.00, 3);

        // Agregar los productos a una lista
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Crear un cliente
        Cliente cliente = new Cliente("elpepe", "kevin angel");

        // Crear una instancia de FabricaPedidos
        FabricaPedidos fabricaPedidos = new FabricaPedidos();

        // Crear un nuevo pedido
        Pedido pedido = fabricaPedidos.crearPedido(cliente, productos);

        // Mostrar los detalles del pedido
        pedido.mostrarDetalles();
    }
}
