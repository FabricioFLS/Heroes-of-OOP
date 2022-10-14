import java.util.Scanner;

public class Tela {
    public static int menuInicial() {

        Scanner sc = new Scanner(System.in);                
        System.out.println("Deseja iniciar uma nova partida? Digite 1 para sim ou 2 para Sair");
        int selecaoMenuInicial = sc.nextInt();
                

        if (selecaoMenuInicial != 1 & selecaoMenuInicial != 2) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente");
                System.out.println("Deseja iniciar uma nova partida? Digite 1 para sim ou 2 para Sair");
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

    public static int menuTipoPersonagem() {
        Scanner sc = new Scanner(System.in);                
        System.out.println("Digite 1 para Guerreiro. 2 Para Mago. 3 Arqueiro");
        int selecaoMenuTipoPersonagem = sc.nextInt(); 
        
        if (selecaoMenuTipoPersonagem < 1 & selecaoMenuTipoPersonagem > 3) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente");
                System.out.println("Deseja iniciar uma nova partida? Digite 1 para sim ou 2 para Sair");
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

    public static int menuArma() {
        Scanner sc = new Scanner(System.in);                
        System.out.println("Digite 1 para . 2 Para iniciar.");
        int selecaoMenuArma = sc.nextInt();

        if (selecaoMenuArma != 1 & selecaoMenuArma != 2) {
            boolean validador = false;
            while (!validador) {
                System.out.println("Opção não existe, digite novamente");
                System.out.println("Digite 1 para . 2 Para iniciar.");
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

    public static void menuRodada() {
        
    }
}
