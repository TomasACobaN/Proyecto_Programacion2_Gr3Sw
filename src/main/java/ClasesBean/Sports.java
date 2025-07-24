/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBean;

import javax.swing.DefaultListModel;

/**
 *
 * @author tcoba
 */
public class Sports {
    //Atributos
    //Usamos el DefaulListModel por la facilidad que da en las interfaces con jList
    private DefaultListModel<String> squadsRegistrados = new DefaultListModel<>();
    private DefaultListModel<Jugador> jugadoresRegistrados= new DefaultListModel<>();
    private DefaultListModel<String> duosRegistrados= new DefaultListModel<>();
    //Constructores

    public Sports() {
    }
    
    
    //Metodos
    public void agregarJugador (Jugador j){
        jugadoresRegistrados.addElement(j);              
    }
    public void agregarDuo (Duo d){
        duosRegistrados.addElement(d);              
    }
    public void agregarSquad (Squad s){
        squadsRegistrados.addElement(s);
    }
    
    public DefaultListModel<Jugador> retornarJugadoresRegistrados(){
        return jugadoresRegistrados;
    }
    public DefaultListModel<Duo> retornarDuoRegistrados(){
        return duosRegistrados;
    }
    public DefaultListModel<Squad> retornarSquadRegistrados(){
        return squadsRegistrados;
    }
    
    public void imprimirJRegistrados (){
    for (int i = 0; i < jugadoresRegistrados.size(); i++) {
    System.out.println(jugadoresRegistrados.get(i));    
    }}    
    public void imprimirDRegistrados (){
    for (int i = 0; i < duosRegistrados.size(); i++) {
    System.out.println(duosRegistrados.get(i));    
    }}
        public void imprimirSRegistrados (){
    for (int i = 0; i < squadsRegistrados.size(); i++) {
    System.out.println(squadsRegistrados.get(i));    
    }}
    
    
}

