/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImp();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImp();
        
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex, procesarOrdenDHL);
        Orden orden = new Orden("mani", "pere", 3);
        sistemaEnvios.enviarOrdenFedex(orden);
           sistemaEnvios.enviarOrdenDHL(orden);
              
    }
    
}
