import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Random rd = new Random();
        Personagem mago = new Mago();
        Personagem guerreiro = new Guerreiro();
        Personagem arqueiro = new Arqueiro();
        Personagem dragao = new Dragao();
        ArrayList<Personagem> personagens = new ArrayList<Personagem>();        
        int criarPersonagem= 1;
        int menuCriarPesonagem = 1;
        int tipoPersonagem = 1;
        int menuTurnos = 1;
        

        if (Tela.menuInicial()==1) {// inicia o jogo
            
            while (menuCriarPesonagem == 1) {

                criarPersonagem = Tela.menuCriarPersonagem();
                
                if (criarPersonagem == 1) {

                    tipoPersonagem = Tela.menuTipoPersonagem();
    
                    if (tipoPersonagem == 1) {
                        
                        System.out.println("Digite o nome do Guerreiro");
                        guerreiro.setNomePersonagem(sc.next());// Adicionar nome Guerreiro
                        Arma espada = new Espada();// instanciar Espada
                        Arma machado = new Machado();// instanciar Machado
    
                        if (Tela.menuArma(espada, machado) == 1) {
                            guerreiro.setArmaPersonagem(espada);// arma selecioanda Espada
                        } else {
                            guerreiro.setArmaPersonagem(machado);// Arma selecionada Machado
                        }              
                        
                        personagens.add(guerreiro);//adiciona guerreiro no arraylist 
                        
                        System.out.println(personagens.get(personagens.size()-1).toString());
    
    
                    } else if (tipoPersonagem == 2) {
    
                        System.out.println("Digite o nome do Mago");
                        mago.setNomePersonagem(sc.next());// Adicionar nome Mago
                        Arma varinha = new Varinha();// instanciar Varinha
                        Arma cajado = new Cajado();// instanciar Cajado
    
                        if (Tela.menuArma(varinha, cajado) == 1) {
                            mago.setArmaPersonagem(varinha);// arma selecioanda Varinha
                        } else {
                            mago.setArmaPersonagem(cajado);// Arma selecionada Cajado
                        }              
                        
                        personagens.add(mago);//adiciona mago no arraylist 
                        
                        System.out.println(personagens.get(personagens.size()-1).toString());
    
    
                    } else if (tipoPersonagem == 3) {
    
                        System.out.println("Digite o nome do Arqueiro");
                        arqueiro.setNomePersonagem(sc.next());// Adicionar nome Arqueiro
                        Arma arcoLongo = new ArcoLongo();// instanciar Arco longo
                        Arma balestra = new Balestra();// instanciar Balestra
    
                        if (Tela.menuArma(arcoLongo, balestra) == 1) {
                            arqueiro.setArmaPersonagem(arcoLongo);// Arma selecioanda Arco longo
                        } else {
                            arqueiro.setArmaPersonagem(balestra);// Arma selecionada Balestra
                        }              
                        
                        personagens.add(arqueiro);//adiciona arqueiro no arraylist 
                        
                        System.out.println(personagens.get(personagens.size()-1).toString());
    
    
                    }
                }
                if (criarPersonagem == 2 || personagens.size() == 3) {//inicia menu de turnos caso seja selecionado opçao 2
                    if (personagens.size() == 0) {// Verifica se algum personagem foi selecionado
                        System.out.println("\nVocê não selecionou nenhum personagem ainda!\n");
                        
                    } else {
                        System.out.println("\nPersonagens selecionados. \nPartida já pode ser iniciada\n");
                        menuCriarPesonagem = 2;
                        
                        while (menuTurnos == 1 && dragao.getVida() > 0 && personagens.size()> 0){
                            menuTurnos = Tela.menuTurnos();
                            if (menuTurnos == 1) {
                                for (int i = 0; i < personagens.size(); i++) {
                                    personagens.get(i).setPosicaoRodada(false);
                                    System.out.printf("\nPersonagem: %s\n",
                                    personagens.get(i).getNomePersonagem());
                                    Tela.menuPosicaoRodada(personagens.get(i), dragao); 
                                    if (personagens.get(i).getVida() <=0 ) {
                                        personagens.remove(i);
                                        menuTurnos = 2;                                       
                                    }                                 
                                }
                                if (personagens.size() != 0) {
                                    int i = rd.nextInt(personagens.size()); // gera número aleatório i
                                    //System.out.println(dragao.toString());
                                    dragao.atacar(dragao, personagens.get(i));// Dragão ataca alvo aleatório i
                                }
                                if (dragao.getVida() <= 0) {
                                    System.out.println("\nParabéns, você derrotou o " + dragao.getNomePersonagem());
                                } else if (personagens.size() == 0){
                                    System.out.println("\nDerrota. Todos seus personagens foram mortos.");
                                }
                                /*for (Personagem personagem : personagens) {
                                    personagem.setPosicaoRodada(false);
                                    System.out.printf("Personagem: %s\n",
                                    personagem.getNomePersonagem());
                                    Tela.menuPosicaoRodada(personagem, dragao); 
                                    if (personagem.getVida() <=0 ) {
                                        personagens.remove(personagens);                                       
                                    }
                                                                
                                }  */                 
                            } else if (menuTurnos == 2){// sair do menuTurnos
                                System.out.println("\nVocê saiu do jogo");
                            }                              
                        }        
                    }    
                } else if (criarPersonagem == 3){//sair do jogo menuPersonagem
                    System.out.println("\nVocê saiu do jogo");
                    menuCriarPesonagem = 3;    
                }             
            }          
        } else {
            System.out.println("\nVocê saiu do jogo");//Sair do jogo menuInicial
        }     
            
    }   
}      
    

