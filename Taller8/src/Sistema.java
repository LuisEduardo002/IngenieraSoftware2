/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class Sistema {
    private ISendEmail servicioEmail;
    
   public Sistema(ISendEmail servicioEmail){
       this.servicioEmail = servicioEmail;
   }
   public void enviarEmail(){
    servicioEmail.SendEmail();
}
}
