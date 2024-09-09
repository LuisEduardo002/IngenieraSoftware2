/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolor
 */
public class Orden {
    private String lugarOrigen;
    private String lugarDestino;
    private int fecha;

    public Orden(String lugarOrigen, String lugarDestino, int fecha) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fecha = fecha;
    }

    /**
     * @return the lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * @param lugarOrigen the lugarOrigen to set
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * @return the lugarDestino
     */
    public String getLugarDestino() {
        return lugarDestino;
    }

    /**
     * @param lugarDestino the lugarDestino to set
     */
    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
}
