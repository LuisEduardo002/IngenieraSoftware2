/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author lolor
 */
public class EncenderCelular implements Command {
    private Celular celular;

    public EncenderCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.encender();
    }
}
