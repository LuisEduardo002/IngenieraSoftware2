/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstracFactory;

/**
 *
 * @author lolor
 */
public class main {
        public static void main(String[] args) {

EnvioFactory envioExpressFactory = new EnvioExpressFactory();
        EnvioFactory envioRegularFactory = new EnvioRegularFactory();

      MetodoEnvio envioExpress = envioExpressFactory.crearEnvio();
        MetodoEnvio envioRegular = envioRegularFactory.crearEnvio();

        
           envioExpress.enviar("enviadokamf");
        envioRegular.enviar(" pauqehete 2");
    }
}







