/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplorestaurante;

/**
 *
 * @author lolor
 */
public class Fabricante {
    
    public Mesa crearMesa(){
        //aca se puede hacer una logica porque esta logica bno deberia iur en camaemero ni en cociner on ien mesa
        return new Mesa();
    }
    
    public Cocinero crearCocinero(){
        return new Cocinero();
    }
            
     public Camarero crearCamarero(){
         return new Camarero();
     }
}
