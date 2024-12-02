/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16Builder;

import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author lolor
 */

import java.util.HashSet;
import java.util.Set;

// Clase Usuario
public class Usuario {
    private final String nombre;
    private final int edad;
    private final String correo;
    private final Set<String> intereses;

    // Constructor privado
    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.intereses = builder.intereses;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", intereses=" + intereses +
                '}';
    }

    // Clase Builder
    public static class Builder {
        private String nombre;
        private int edad;
        private String correo;
        private Set<String> intereses = new HashSet<>();

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public Builder addInteres(String interes) {
            this.intereses.add(interes);
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }
}
