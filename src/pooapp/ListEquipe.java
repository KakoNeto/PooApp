package pooapp;

import java.util.ArrayList;

public class ListEquipe {
    ArrayList<Equipe> listEquipe = new ArrayList<>();
    
    public void addEquipe(int quantidadeDeIntegrantes, String simbolo, int cnpj, String nome, String nacionalidade,String patrocinador,int idade){
        listEquipe.add(new Equipe(quantidadeDeIntegrantes, simbolo, cnpj, nome,nacionalidade,patrocinador,idade));
    }
    public void alterar(){
        
    }
    public void del(){
        
    }
    public void status(){
        
    }
    public void listar(){
        for(Equipe e: listEquipe){
            System.out.println(e.toString());
        }
    }
    
}
