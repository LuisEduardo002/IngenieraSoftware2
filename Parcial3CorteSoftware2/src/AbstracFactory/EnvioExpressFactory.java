/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstracFactory;

/**
 *
 * @author lolor
 */
public class EnvioExpressFactory implements EnvioFactory {
    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioExpress();
    }
}
