/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstracFactory;

/**
 *
 * @author lolor
 */
public class EnvioRegular implements MetodoEnvio {
    @Override
    public void enviar(String paquete) {
        
        System.out.println("ENVIANDO PAQUUETE DE FORMA REGULAR: " + paquete);
    }
}