/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Indireccion;

/**
 *
 * @author lolor
 */
public interface IFactura {
    String getCodigo();
    double getTotal();
    Cliente getCliente();
    void setCodigo(String codigo);
    void setTotal(double total);
    void setCliente(Cliente cliente);
}
