/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author lolor
 */
public class SuspenderCelular implements Command {
    private Celular celular;

    public SuspenderCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.suspender();
    }
}