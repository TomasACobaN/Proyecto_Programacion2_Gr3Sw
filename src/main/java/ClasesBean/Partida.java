/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBean;

/**
 *
 * @author tcoba
 */
public class Partida {
    private String codigoPartida;
    private Equipo participanteUno;
    private Equipo participanteDos;
    private Jugador participanteJUno;
    private Jugador participanteJDos;
    private Equipo ganadorEquipo;
    private Jugador ganadorJugador;
    

    public Partida(String codigo, Equipo participanteUno, Equipo participanteDos) {
        this.participanteUno = participanteUno;
        this.participanteDos = participanteDos;
        this.codigoPartida=codigo;
    }
    
    public Partida(String codigo,Jugador participanteJUno, Jugador participanteJDos){
        this.participanteJUno=participanteJUno;
        this.participanteJDos=participanteJDos;
        this.codigoPartida=codigo;
    }

    public Equipo getParticipanteUno() {
        return participanteUno;
    }

    public void setParticipanteUno(Equipo participanteUno) {
        this.participanteUno = participanteUno;
    }

    public Equipo getParticipanteDos() {
        return participanteDos;
    }

    public void setParticipanteDos(Equipo participanteDos) {
        this.participanteDos = participanteDos;
    }

    public Jugador getParticipanteJUno() {
        return participanteJUno;
    }

    public void setParticipanteJUno(Jugador participanteJUno) {
        this.participanteJUno = participanteJUno;
    }

    public Jugador getParticipanteJDos() {
        return participanteJDos;
    }

    public void setParticipanteJDos(Jugador participanteJDos) {
        this.participanteJDos = participanteJDos;
    }

    @Override
    public String toString() {
        return "Partida{" + "codigoPartida=" + codigoPartida + ", participanteUno=" + participanteUno + ", participanteDos=" + participanteDos + ", participanteJUno=" + participanteJUno + ", participanteJDos=" + participanteJDos + '}';
    }

    
}
