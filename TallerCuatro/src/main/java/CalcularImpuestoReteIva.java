/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class CalcularImpuestoReteIva extends Calculo{
    
    int iva;

    public CalcularImpuestoReteIva(int iva, String Producto, int Cantidad, int Precio) {
        super(Producto, Cantidad, Precio);
        this.iva = iva;
    }

    @Override
    public double calcularImpuesto() {
  return this.getPrecio()*iva*this.getCantidad();
    }
    
    
}
