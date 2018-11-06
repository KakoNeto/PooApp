package pooapp;

public abstract class Identificacao {
    private String nome, nacionalidade, patrocinador;
    private int idade;
    private int vitoria, derrota;
    
    //metodos da classe
    
    public void punido(){
        
    }
    public void treinar(){
        
    }
    public void mostrarHistorico(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Derrotas: "+this.getDerrota());
        System.out.println("Vitórias: "+this.getVitoria());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Patrocinador: "+this.getPatrocinador());
        
    }
    public void vencer(){
        vitoria++;
    }
    public void perder(){
        derrota++;
       
    }
    
    
    //metodo constructor

    public Identificacao(String nome, String nacionalidade, String patrocinador, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.patrocinador = patrocinador;
        this.idade = idade;
    }
    
    public int getVitoria() {    
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    //Getter e setters
    public void setDerrota(int derrota) {    
        this.derrota = derrota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
