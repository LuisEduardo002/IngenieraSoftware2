/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class ImpDAO implements DAO{

    @Override
    public void guardarProducto(Producto producto) {
        System.out.println("producto guardado");
    }

    @Override
    public void guardarCliente(Cliente cliente) {
      System.out.println("cliebte guardado");
    }

    @Override
    public void guardarFactura(Factura factura) {
      System.out.println("factura guardado");
    }
    
}
