/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author lolor
 */
public class main {
        public static void main(String[] args) {

    Hamburguesa hamburguesa1 = new Hamburguesa.Builder()
      .setTipoTomate("Chonto")
          .setTipoCarne("Tasajeada")
          .setTipoQueso("Polpo")
          .setTipoPan("OCho")
           .build();

        Hamburguesa hamburguesaa2 = new Hamburguesa.Builder()
                .setTipoCarne("Carne")
                .setTipoPan("nose")
                .setTipoQueso("elepepe")
                .build();

        // Mostrar los detalles de las hamburguesas
        hamburguesa1.imprimirIngredientes();
        hamburguesaa2.imprimirIngredientes();
    }
}

