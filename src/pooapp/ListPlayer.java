package pooapp;

import java.util.ArrayList;


public class ListPlayer {
    ArrayList<Player> listplayer = new ArrayList();

    public void addplayer(String nome, String nacionalidade, String patrocinador, int idade){
        listplayer.add(new Player(nome, nacionalidade, patrocinador, idade));
    }
    public void alterar(){
        
    }
    public void del(){
        
    }
    public void status(){
        
    }
    public void listar(){
        for(Player p: listplayer){
            System.out.println(p.toString());
        }
    }
    
}
