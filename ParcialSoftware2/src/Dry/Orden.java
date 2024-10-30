/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dry;

/**
 *
 * @author lolor
 */
public class Orden {

    
    
    public double calcularTotalConImpuesto(double precio){
        double impuesto = precio * 0.1;
        System.out.println("precio con impuestp : "+(impuesto+precio) );
        return precio + impuesto;
    }
    public double calcularDescuentoTotal(double precio, double descuento){
        double descuentoPrecio = precio - descuento;
        double impuesto = calcularTotalConImpuesto(precio);
        System.out.println("precio con descuento : " +(descuentoPrecio+impuesto));
        return descuentoPrecio + impuesto;
    }
}
