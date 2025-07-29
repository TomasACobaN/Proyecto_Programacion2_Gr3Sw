/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBean;

/**
 *
 * @author Matias
 */

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String tipo;
    private List<Jugador> jugadores;

    public Equipo() {
        
        
    }

    public Equipo(String nombre, String tipo, List<Jugador> jugadores) {
        this.nombre = nombre;
        
    }
    

    public Equipo(String nombre) {
        this.nombre = nombre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 



    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
}
