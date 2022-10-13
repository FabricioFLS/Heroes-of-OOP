import java.util.Scanner;

public class Main {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                
                System.out.println("i para iniciar uma nova partida s para sair");
                char rf1 = sc.next().charAt(0);
                sc.nextLine();
                if (rf1 == 'i'){
                        Personagem[] personagems = new Personagem[3];
                        personagems[0] = new Arqueiro();
                        personagems[1] = new Guerreiro();
                        personagems[2] = new Mago();

                        System.out.println("Digite c para criar um novo personagem, i para começar a partida ou s para sair do jogo");
                        char rf2 = sc.next().charAt(0);
                        sc.nextLine();
                        if(rf2 == 'c'){
                                System.out.println("Digite a para criar um Arqueiro, g para Guerreiro ou m para Mago");
                                char rf21 = sc.next().charAt(0);
                                sc.nextLine();
                                System.out.println("Escolha um nome para seu personagem");
                                String nomePersonagem = sc.nextLine();

                                if (rf21 == 'a'){

                                        personagems[0].setNomePersonagem(nomePersonagem);
                                        System.out.println("Escolha sua arma, 1 Balestra ou 2 ArcoLongo ");
                                        int armaPersonagem = sc.nextInt();

                                if(armaPersonagem == 1){
                                        personagems[0].setArmaPersonagem(new Balestra());
                                }{
                                        personagems[0].setArmaPersonagem(new ArcoLongo());
                                }
                                        System.out.println(personagems[0].getNomePersonagem());
                                        System.out.println(personagems[0].getArmaPersonagem());
                                        System.out.println(personagems[0].getAtaque());
                                        System.out.println(personagems[0].getDefesa());
                                }
                                if (rf21 == 'g'){

                                        personagems[1].setNomePersonagem(nomePersonagem);
                                        System.out.println("Escolha sua arma, 1 Espada ou 2 Machado ");
                                        int armaPersonagem = sc.nextInt();
                                                if(armaPersonagem == 1){
                                                        personagems[1].setArmaPersonagem(new Espada());
                                                }{
                                                        personagems[1].setArmaPersonagem(new Machado());
                                                }
                                                System.out.println(personagems[1].getNomePersonagem());
                                                System.out.println(personagems[1].getArmaPersonagem());
                                                System.out.println(personagems[1].getAtaque());
                                                System.out.println(personagems[1].getDefesa());
                                }
                                if (rf21 == 'm'){
                                        personagems[2].setNomePersonagem(nomePersonagem);
                                        System.out.println("Escolha sua arma, 1 Varinha ou 2 Cajado ");
                                        int armaPersonagem = sc.nextInt();
                                        if(armaPersonagem == 1){
                                                personagems[2].setArmaPersonagem(new Varinha());
                                        }{
                                                personagems[2].setArmaPersonagem(new Cajado());
                                        }
                                        System.out.println(personagems[2].getNomePersonagem());
                                        System.out.println(personagems[2].getArmaPersonagem());
                                        System.out.println(personagems[2].getAtaque());
                                        System.out.println(personagems[2].getDefesa());

                                }
                        }
                }




        sc.close();
        }
}
