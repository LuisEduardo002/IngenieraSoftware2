/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class SistemaEnvios {
    
     private IProcesarOrdenDHL procesarOrdenDHL;
     private IProcesarOrdenFedex procesarOrdenFedex;

    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex, IProcesarOrdenDHL procesarOrdenDHL) {
        this.procesarOrdenDHL = this.procesarOrdenDHL;
        this.procesarOrdenFedex = this.procesarOrdenFedex;
    }
    
    public void enviarOrdenFedex(Orden orden){
    procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
        public void enviarOrdenDHL(Orden orden){
    procesarOrdenDHL.enviarOrdenDHL(orden);
    }
}
