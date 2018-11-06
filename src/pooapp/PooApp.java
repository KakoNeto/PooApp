
package pooapp;

import java.util.Scanner;


public class PooApp {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         ListPlayer listp = new ListPlayer(); 
         ListEquipe listeq = new ListEquipe();
        //instanciando uma lista de playser
        int mp, me, mj,i; //menu principal, menu equipe, menu jogador
        do{
            // Menu Principal
            System.out.println("-=-=-=-=-=-=-=-Menu-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1 - Equipe");
            System.out.println("2 - Player");
            System.out.println("0 - sair");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            mp = input.nextInt();
            
            //              Menus Secundarios
            
            switch(mp){
                case 0:
                    //opcao para voltar ao menu principal
                    break;
                    
                case 1:
                    //menu de equipe quando escolhido a opcao 1
                    do{
                        System.out.println("-=-=-=-=-=-=Menu Equipe=-=-=-=-=-=-=");
                        System.out.println("1 - Adicionar uma Equipe");
                        System.out.println("2 - Alterar uma Equipe");
                        System.out.println("3 - Listar Equipes");
                        System.out.println("4 - Status de uma Equipes");
                        System.out.println("5 - Excluir uma Equipe");
                        System.out.println("0 - Voltar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--");
                        me = input.nextInt();
                        //chamada das operacoes segundo opcoes da equipe
                        switch(me){
                            case 0:
                                break;
                            case 1:
                                System.out.println("Digite o nome da Equipe:");
                                String nome = input.next();
                                System.out.println("Digite a nacionalidade da Equipe:");
                                String nacionalidade = input.next();
                                System.out.println("Nome do Patrocinador:");
                                String patrocinador = input.next();
                                System.out.println("Idade da Equipe:");
                                int idade = input.nextInt();
                                System.out.println("Quantidade de Integrantes: ");
                                int quantidadeDeIntegrantes = input.nextInt();
                                System.out.println("Representação do simbolo: ");
                                String simbolo = input.next();
                                System.out.println("CNPJ da Equipe: ");
                                int cnpj = input.nextInt();
                                
                                listeq.addEquipe(quantidadeDeIntegrantes, simbolo, cnpj, nome, nacionalidade, patrocinador, idade);
                                break;
                            case 2:
                                break;
                            case 3:
                                listeq.listar();
                                break;
                            case 4:
                                
                                break;
                            case 5:
                                
                                break;
                            default:
                                break;
                        }
                        
                    }while(me!=0);
                    break;
                    //fim case 1
                case 2:
                    //menu de equipe quando escolhido a opcao 2
                    do{
                        System.out.println("-=-=-=-=-=-=Menu Jogador=-=-=-=-=-=-=");
                        System.out.println("1 - Adicionar uma Jogador");
                        System.out.println("2 - Alterar um Jogador");
                        System.out.println("3 - Listar Jogadores");
                        System.out.println("4 - Status de um Jogador");
                        System.out.println("5 - Excluir uma Jogador");
                        System.out.println("0 - Voltar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--");
                        
                        mj = input.nextInt();
                        
                        switch(mj){
                            case 0:
                                break;
                            case 1:
                                System.out.println("Digite o nome do jogardor:");
                                String nome = input.next();
                                System.out.println("Digite a nacionalidade do Jogador:");
                                String nacionalidade = input.next();
                                System.out.println("Nome do Patrocinador:");
                                String patrocinador = input.next();
                                System.out.println("Idade do jogador:");
                                int idade = input.nextInt();
                                
                                listp.addplayer( nome, nacionalidade, patrocinador, idade);
                                break;
                            case 2:
                              
                                break;
                            case 3:
                                listp.listar();  //para listar o array
                                break;
                            case 4:
                                break;
                            case 5:
                                
                                break;
                            default:
                                break;
                        }
                        
                    }while(mj!=0);
                    break;
                    //fim case 2
                default:
                    break;
            }
            
            
        }while(mp!=0); // fim do do while do menu principal
    }
    
}
