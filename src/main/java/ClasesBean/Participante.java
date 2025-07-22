/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBean;

/**
 *
 * @author tcoba
 */
public class Participante extends Jugador {
    private String nickname;
    private String pais;
    private int ranking;

    public Participante(String nombre, int edad, String nickname, String pais, int ranking) {
        super(nombre, edad);
        this.nickname = nickname;
        this.pais = pais;
        this.ranking = ranking;
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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}