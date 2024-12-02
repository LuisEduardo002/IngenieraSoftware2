/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author lolor
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

   
private Hamburguesa(Builder builder) {
      this.tipoTomate = builder.tipoTomate;
    this.tipoCarne = builder.tipoCarne;
this.tipoQueso = builder.tipoQueso;
this.tipoPan = builder.tipoPan;

    }


    public void  imprimirIngredientes(){
        System.out.println("hamburgesa :" +this.tipoCarne + this.tipoPan+ this.tipoQueso + this.tipoTomate);
    }
public static class Builder {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
   private String tipoPan;

        
        public Builder setTipoTomate(String tipoTomate) {
            this.tipoTomate = tipoTomate;
            return this;
        }

            public Builder setTipoCarne(String tipoCarne) {
                this.tipoCarne = tipoCarne;
                return this;
            }

        public Builder setTipoQueso(String tipoQueso) {
            this.tipoQueso = tipoQueso;
            return this;}

      public Builder setTipoPan(String tipoPan) {
            this.tipoPan = tipoPan;
            return this;
      }

        public Hamburguesa build() {
            return new Hamburguesa(this);
}
    }
}