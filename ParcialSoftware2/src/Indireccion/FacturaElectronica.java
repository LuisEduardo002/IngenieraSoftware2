/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indireccion;

/**
 *
 * @author lolor
 */
public class FacturaElectronica implements IFactura{
    private String codigo;
    private double total;
    private Cliente cliente;
    private String numeroElectronico;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the numeroElectronico
     */
    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    /**
     * @param numeroElectronico the numeroElectronico to set
     */
    public void setNumeroElectronico(String numeroElectronico) {
        this.numeroElectronico = numeroElectronico;
    }

}