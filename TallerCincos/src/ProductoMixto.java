/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lolor
 */
public class ProductoMixto extends Producto implements Enviar{
    int peso;
    int tamañoArchivo;

    public ProductoMixto(int peso, int tamañoArchivo, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
       return this.getPrecio() * this.getCantidad() + 0.2 * peso + 0.2 * tamañoArchivo;
    }
    
    @Override
        public void enviarPorCorreo(){
        System.out.println("Enviado Por Correo");
    }
    
}
