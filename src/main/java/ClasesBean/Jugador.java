/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBean;

/**
 *
 * @author tcoba
 */
public class Jugador extends Persona {            
    private String nickname;
    private String pais;
    private int ranking;
    private int victorias;

    public Jugador(String nombre, int edad, String cedula) {
        super( edad, nombre);
    }
    
    public Jugador( int edad,String nombre, String nickname, String pais, int ranking, int victorias) {
        super( edad, nombre);
        this.nickname = nickname;
        this.pais = pais;
        this.ranking = ranking;
        this.victorias=victorias;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPais() {
        return pais;
    }

    public int getRanking() {
        return ranking;
    }
    public int getVictorias(){
        return victorias;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public void setVictorias(int victorias){
        this.victorias=victorias;
    }
}