package pooapp;
public class Equipe extends Identificacao {
    //atributos
    private int quantidadeDeIntegrantes;
    private String simbolo;
    private int cnpj;

    public Equipe(int quantidadeDeIntegrantes, String simbolo, int cnpj, String nome, String nacionalidade, String patrocinador, int idade) {
        super(nome, nacionalidade, patrocinador, idade);
        this.quantidadeDeIntegrantes = quantidadeDeIntegrantes;
        this.simbolo = simbolo;
        this.cnpj = cnpj;
    }
    
    

    //métodos
    public void desafiarEquipe(){
        System.out.println("Você irá desafiar a equipe "+this.getNome()+" boa sorte.");
    }
    
    public void desclassificado(){
        System.out.println("A equipe "+ this.getNome()+" foi desclassificada por perder a partida.");
    }
    
    //métodos de polimorfismo
    @Override
    public void treinar(){
        System.out.println("A equipe "+ this.getNome() + "está treinando com os seus jogadores");
    }
    @Override
    public void punido(){
        System.out.println("A equipe "+ this.getNome() + "foi punida!");
    }
 

    //constructor
    public Equipe(String nome, String nacionalidade, String patrocinador, int idade) {
        super(nome, nacionalidade, patrocinador, idade);
    }
  
    //métodos especiais
    public int getQuantidadeDeIntegrantes() {
        return quantidadeDeIntegrantes;
    }

    public void setQuantidadeDeIntegrantes(int quantidadeDeIntegrantes) {
        this.quantidadeDeIntegrantes = quantidadeDeIntegrantes;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return "Equipe{ Nome:"+ this.getNome() +", Nacionalidade: "+ getNacionalidade()+ " Simbolo:" + getSimbolo() + ", Quantidade de Integrantes:" + getQuantidadeDeIntegrantes() + ", cnpj:" + getCnpj() + ", Idade:"+ getIdade() + ", Patrocinador:"+ getPatrocinador()+ '}';
    }
       
}
