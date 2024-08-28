/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lolor
 */
public class ProductoDigital extends Producto{
    int tamañoArchivo;

    public ProductoDigital(int tamañoArchivo, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return this.getPrecio() * this.getCantidad() + 0.2 * tamañoArchivo;
    }
    
    
}
