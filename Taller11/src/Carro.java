/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class Carro implements Transporte{

    @Override
    public void acelerar() {
        System.out.println("soy un carro y acelero");
    }

    @Override
    public void frenar() {
        System.out.println("soy un carro y freno");   
    }

    @Override
    public String mostrarInformacion() {
        return "Carro";
    }
    
}
