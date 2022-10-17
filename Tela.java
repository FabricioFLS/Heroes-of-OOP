import java.util.Scanner;

public class Tela {
    public static int menuInicial() {

        Scanner sc = new Scanner(System.in);                
        System.out.println("Deseja iniciar uma nova partida? \nDigite 1 para sim ou 2 para Sair");
        int selecaoMenuInicial = sc.nextInt();
                

        if (selecaoMenuInicial != 1 & selecaoMenuInicial != 2) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente\n");
                System.out.println("Deseja iniciar uma nova partida? \nDigite 1 para sim ou 2 para Sair");
                selecaoMenuInicial = sc.nextInt();
                if (selecaoMenuInicial == 1 || selecaoMenuInicial == 2) {
                    validador = true;
                }//fim if validador menuInicial
            }// fim validador menuInicial            
        }else{
            return selecaoMenuInicial;
        }//fim if menuInicial    

        return selecaoMenuInicial;
    
    } //fim menuInicial

    public static int menuCriarPersonagem() {
        Scanner sc = new Scanner(System.in);                
        System.out.println("Digite 1 para criar personagem. \nDigite 2 Para iniciar a partida. \nDigite 3 Para sair\n");
        int selecaoMenuCriarPersonagem = sc.nextInt(); 
                
        if (selecaoMenuCriarPersonagem != 1 & selecaoMenuCriarPersonagem != 2 & selecaoMenuCriarPersonagem != 3) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente\n");
                System.out.println("Digite 1 para criar personagem. \nDigite 2 Para iniciar a partida. \nDigite 3 Para sair\n");
                selecaoMenuCriarPersonagem = sc.nextInt();
                if (selecaoMenuCriarPersonagem >= 1 || selecaoMenuCriarPersonagem <= 3) {
                    validador = true;
                }//fim if validador selecaoMenuTipoPersonagem
            }// fim validador selecaoMenuTipoPersonagem 
        }else{
            return selecaoMenuCriarPersonagem;
        }
        return selecaoMenuCriarPersonagem;
    }   
    
    public static int menuTipoPersonagem() {
        Scanner sc = new Scanner(System.in);                
        System.out.println("Digite 1 para Guerreiro. \nDigite 2 Para Mago. \nDigite 3 Arqueiro");
        int selecaoMenuTipoPersonagem = sc.nextInt(); 
        
        if (selecaoMenuTipoPersonagem < 1 & selecaoMenuTipoPersonagem > 3) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente");
                System.out.println("Digite 1 para Guerreiro. 2 Para Mago. 3 Arqueiro");
                selecaoMenuTipoPersonagem = sc.nextInt();
                if (selecaoMenuTipoPersonagem >= 1 || selecaoMenuTipoPersonagem <= 3) {
                    validador = true;
                }//fim if validador selecaoMenuTipoPersonagem
            }// fim validador selecaoMenuTipoPersonagem 
        }else{
            return selecaoMenuTipoPersonagem;
        }
        return selecaoMenuTipoPersonagem;
    }   

    public static int menuArma(Arma armaPersonagem1, Arma armaPersonagem2) {
        String arma1 = armaPersonagem1.getNomeArma();
        String arma2 = armaPersonagem2.getNomeArma();
        Scanner sc = new Scanner(System.in);                
        System.out.println("Digite 1 para selecionar a arma: " + arma1 + "\nDigite 2 para selecionar a arma: "+ arma2);
        int selecaoMenuArma = sc.nextInt();

        if (selecaoMenuArma != 1 & selecaoMenuArma != 2) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente");
                System.out.println("Digite 1 para selecionar a arma: " + arma1 + "\nDigite 2 para selecionar a arma: "+ arma2);
                selecaoMenuArma = sc.nextInt();
                if (selecaoMenuArma == 1 || selecaoMenuArma == 2) {
                    validador = true;
                }//fim if validador selecaoMenuArma
            }// fim validador selecaoMenuArma 
        }else{
            return selecaoMenuArma;
        }
        return selecaoMenuArma;
    }

    public static int menuTurnos() {
        Scanner sc = new Scanner(System.in);                
        System.out.println("\nDeseja iniciar um novo turno? \nDigite 1 para Sim \nDigite 2 para Sair");
        int selecaoMenuTurnos = sc.nextInt();
                

        if (selecaoMenuTurnos != 1 & selecaoMenuTurnos != 2) {
            boolean validador = false;
            while (!validador) {
                System.out.println("\nOpção não existe, digite novamente");
                System.out.println("\nDeseja iniciar um novo turno? \nDigite 1 para Sim \nDigite 2 para Sair");
                selecaoMenuTurnos = sc.nextInt();
                if (selecaoMenuTurnos == 1 || selecaoMenuTurnos == 2) {
                    validador = true;
                }//fim if validador menuInicial
            }// fim validador menuInicial            
        }else{
            return selecaoMenuTurnos;
        }//fim if menuInicial    

        return selecaoMenuTurnos;
    
    } //fim menuInicial

    public static void menuPosicaoRodada(Personagem pesonagemRodadaAtacante,Personagem personagemRodadaAtacado) {
        Scanner sc = new Scanner(System.in);                
        System.out.println("Digite 1 para Atacar \nDigite 2 para Defender");
        int selecaoMenuPosicaoRodada = sc.nextInt();                

        if (selecaoMenuPosicaoRodada != 1 & selecaoMenuPosicaoRodada != 2) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente");
                System.out.println("Digite 1 para Atacar \nDigite 2 para Defender");
                selecaoMenuPosicaoRodada = sc.nextInt();
                if (selecaoMenuPosicaoRodada == 1 || selecaoMenuPosicaoRodada == 2) {
                    validador = true;
                }//fim if validador menuInicial
            }// fim validador menuInicial            
        }

        if (selecaoMenuPosicaoRodada == 1) {
            pesonagemRodadaAtacante.atacar(pesonagemRodadaAtacante, personagemRodadaAtacado);
        } else {
            pesonagemRodadaAtacante.setPosicaoRodada(true);
        }
            
    }  

    /*public static void ataqueDragao(Personagem pesonagemRodadaAtacante,Personagem personagemRodadaAtacado) {               
        if (personagemRodadaAtacado.isPosicaoRodada()) {
            personagemRodadaAtacado.atacar(pesonagemRodadaAtacante, personagemRodadaAtacado);
        } else {
            Double defesa = personagemRodadaAtacado.getDefesa() * 1.1;
            
        }
            
    }*/

        
    

    
    
}
