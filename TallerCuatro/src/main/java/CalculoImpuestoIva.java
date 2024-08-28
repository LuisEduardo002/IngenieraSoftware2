/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class CalculoImpuestoIva extends Calculo{
    double iva;

    public CalculoImpuestoIva(double iva, String Producto, int Cantidad, int Precio) {
        super(Producto, Cantidad, Precio);
        this.iva = iva;
    }

    @Override
    public double calcularImpuesto() {
        return this.getPrecio()*iva*this.getCantidad();
    }
    
    
}
