/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author lolor
 */
public class main {
   
    public static void main(String[] args) {
  
       Computador computador = new Computador();
        Celular celular = new Celular();

             
        Command encenderComputador = new EncenderComputador(computador);
        Command reiniciarComputador = new ReiniciarComputador(computador);
        Command suspenderComputador = new SuspenderComputador(computador);
       Command apagarComputador = new ApagarComputador(computador);

        Command encenderCelular = new EncenderCelular(celular);
        Command reiniciarCelular = new ReiniciarCelular(celular);
        Command suspenderCelular = new SuspenderCelular(celular);
        Command apagarCelular = new ApagarCelular(celular);

        ControlRemoto control = new ControlRemoto();
        control.setCommand(encenderComputador);
        control.presionarBoton();

        
                control.setCommand(apagarComputador);
        control.presionarBoton();
                control.setCommand(suspenderComputador);
        control.presionarBoton();

        
        control.setCommand(reiniciarComputador);
        control.presionarBoton();


       control.setCommand(encenderCelular);
        control.presionarBoton();

        control.setCommand(reiniciarCelular);
        control.presionarBoton();

        control.setCommand(suspenderCelular);
        control.presionarBoton();

        control.setCommand(apagarCelular);
        control.presionarBoton();
    } 
}
















