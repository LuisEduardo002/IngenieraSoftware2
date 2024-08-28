/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lolor
 */
public class ProductoFisico extends Producto implements Enviar{
    int peso;

    public ProductoFisico(int peso, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }
    
    @Override
    public double calcularCostoTotal() {
        return this.getPrecio() * this.getCantidad() + 0.2 * peso;

    }
    
    @Override
    public void enviarPorCorreo(){
        System.out.println("Enviado Por Correo");
    }
}
