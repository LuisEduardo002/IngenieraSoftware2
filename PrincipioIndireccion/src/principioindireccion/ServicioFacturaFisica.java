/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioindireccion;

/**
 *
 * @author lolor
 */
public class ServicioFacturaFisica implements IServicioFactura{

    @Override
    public Factura crear(Cliente cliente) {
        //logica con respecto al cliente y la factura
return new FacturaFisica();
    }
    
}
