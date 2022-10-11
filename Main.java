import java.util.Scanner;

public class Main {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);


                System.out.println("i para iniciar uma nova partida s para sair");
                char rf1 = sc.next().charAt(0);
                sc.nextLine();

                Personagem[] personagem = new Personagem[3];
                personagem[0] = new Guerreiro();
                personagem[1] = new Arqueiro();
                personagem[2] = new Mago();


                if (rf1 == 'i'){
                        System.out.println("Digite c para criar um novo personagem, i para começar a partida ou s para sair do jogo");
                        char rf2 = sc.next().charAt(0);
                        sc.nextLine();

                        if(rf2 == 'c'){

                                System.out.println("Digite a para criar um Arqueiro, g para Guerreiro ou m para Mago");

                                char rf21 = sc.next().charAt(0);
                                sc.nextLine();
                                if (rf21 == 'a'){
                                        System.out.println("Escolha um nome para seu personagem");
                                        String nomePersonagem = sc.nextLine();
                                        personagem[1].setNomePersonagem(nomePersonagem);
                                        System.out.println("Escolha sua arma, Balestra ou ArcoLongo ");
                                        String armaPersonagem = sc.nextLine();
                                        personagem[1].setNomeArma(armaPersonagem);


                                }
                        }
                        System.out.println(personagem[1].getNomePersonagem() + personagem[1].getNomeArma());
                }





        sc.close();
        }
}
