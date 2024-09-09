/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class ProcesarOrdenDHLImp implements IProcesarOrdenDHL{

    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println(orden+ "desde"+orden.getLugarOrigen()+"hacia"+orden.getLugarDestino()+"Con DHL");
    }
    
    
    
}
