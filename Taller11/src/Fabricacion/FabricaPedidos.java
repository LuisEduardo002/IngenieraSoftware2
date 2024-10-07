/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricacion;

import java.util.List;

/**
 *
 * @author lolor
 */
public class FabricaPedidos {
        private int contadorPedidos = 1;

    public Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        Pedido nuevoPedido = new Pedido(contadorPedidos,cliente,productos);
        return nuevoPedido;
    }
}
