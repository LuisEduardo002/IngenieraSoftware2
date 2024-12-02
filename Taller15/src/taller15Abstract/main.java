/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15Abstract;

/**
 *
 * @author lolor
 */
public class main {
        public static void main(String[] args) {
        // Crear muebles modernos
        FabricaDeMuebles fabricaModernos = new FabricaMueblesModernos();
        Silla sillaModerna = fabricaModernos.crearSilla();
        Mesa mesaModerna = fabricaModernos.crearMesa();

        sillaModerna.crear();  // Salida: Creando silla moderna.
        mesaModerna.crear();   // Salida: Creando mesa moderna.

        // Crear muebles clásicos
        FabricaDeMuebles fabricaClasicos = new FabricaMueblesClasicos();
        Silla sillaClasica = fabricaClasicos.crearSilla();
        Mesa mesaClasica = fabricaClasicos.crearMesa();

        sillaClasica.crear();  // Salida: Creando silla clásica.
        mesaClasica.crear();   // Salida: Creando mesa clásica.
    }
}
