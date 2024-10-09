/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioindireccion;

/**
 *
 * @author lolor
 */
public class ServicioFacturaElectronica implements IServicioFactura{

    @Override
    public Factura crear(Cliente cliente) {
        return new       FacturaElectronica();
              }
    
}
