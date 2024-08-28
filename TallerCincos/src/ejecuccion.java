/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author lolor
 */
public class ejecuccion {

    public static void main(String[] args) {
        Producto productoFisico1 = new ProductoFisico(0, "nombre", 30, 40);
        CalculadoraCosto calcular = new CalculadoraCosto();
        System.out.println(calcular.calculoImpuesto(productoFisico1));
        ProductoFisico productoFisico2 = new ProductoFisico(10, "fombre", 0, 0);
        productoFisico2.enviarPorCorreo();
    }
}
