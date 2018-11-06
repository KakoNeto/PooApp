package pooapp;
public class Player extends Identificacao {
    
    //Atributos do player
    private String nick, nivel;
    private long cpf;
    private int destaque;


    
    //metodos de players
    
    public void mvp(){
        System.out.println("O jogador "+ this.getNome() + "de nick: " + this.getNick() + " foi considerado o melhor player da partida.");
        destaque +=1;
    }
    
    public void jogar(){
        System.out.println("O jogador "+ this.getNome() + "de nick: " + this.getNick() + "esta ativo em uma partida agora.");
    }
    
    @Override
    public void treinar(){
        System.out.println("O jogador "+ this.getNome() + "de nick: " + this.getNick() + "esta treinando sozinho.");
    }
    
    @Override
    public void punido(){
        System.out.println("O jogador "+ this.getNome() + "de nick: " + this.getNick() + "foi punido!");
    }
    
    
    
    
    
    
    
    // constructor do player chamando extendendo identificacao
    public Player(String nome, String nacionalidade, String patrocinador, int idade) {
        super(nome, nacionalidade, patrocinador, idade);
        
    }
    
    //Setters e getters player

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
    
    
        @Override
    public String toString() {
        return "Player{ Nome:"+ this.getNome() + " nick=" + nick + ", nivel=" + nivel + ", cpf=" + cpf + ", destaque=" + destaque + '}';
    }
    
}

