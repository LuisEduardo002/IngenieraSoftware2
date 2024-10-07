
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Producto producto1 = new Producto(1, "Laptop", 1500.00);
        Producto producto2 = new Producto(2, "Smartphone", 800.00);
        Producto producto3 = new Producto(3, "Teclado", 50.00);

        // Agregar los productos a una lista
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Crear un cliente
        Cliente cliente = new Cliente(1, "Juan Pérez", "Calle Falsa 123");

        // Crear una instancia de la base de datos
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        // Crear una instancia de FacturaService
        FacturaService facturaService = new FacturaService(baseDeDatos);

        // Procesar la factura
        facturaService.procesarFactura(cliente, productos);

        // Mostrar información de la factura
        Factura factura = new Factura(cliente, productos);
        double totalSinDescuento = factura.calcularTotal();
        double totalConDescuento = factura.calcularPrecioConDescuento(4000); // Descuento de 100
        String numeroFactura = factura.generarNumeroFactura();

        System.out.println( numeroFactura);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        
        
        
         Garaje garaje = new Garaje();
        Carro coche = new Carro();
        Avion avion = new Avion();
        Blicicleta bicicleta = new Blicicleta();
        garaje.estacionar(coche);
        garaje.estacionar(avion);
        garaje.estacionar(bicicleta);
    }
    
}
