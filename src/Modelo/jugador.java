/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class jugador {
    private String nombre;
    private int puntos;
    private int rebotes;
    private int asistencias;

    public jugador(String nombre, int puntos, int rebotes, int asistencias) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.rebotes = rebotes;
        this.asistencias = asistencias;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre='" + nombre + ", puntos=" + puntos + ", rebotes=" + rebotes +", asistencias=" + asistencias + '}';
}
}
