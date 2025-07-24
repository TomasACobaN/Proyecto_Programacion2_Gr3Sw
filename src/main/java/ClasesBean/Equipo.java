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
    private List<Participante> jugadores = crearJugadores();

    public Equipo() {
        nombre = "SinNombre";
        
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

    public List<Participante> crearJugadores() {
        return new ArrayList<>();
    }

    public Jugador buscarJugadorPorID(String id) {
        for (Participante j : jugadores) {
            if (j.getID().equals(id)) {
                return j;
            }
        }
        return null;
    }

    public boolean agregarJugador(Participante jugador) {
        if (buscarJugadorPorID(jugador.getID()) == null) {
            jugadores.add(jugador);
            return true;
        }
        return false; // ya existe
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
}
