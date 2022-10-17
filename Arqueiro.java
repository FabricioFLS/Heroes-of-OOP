public class Arqueiro extends Personagem {

    public Arqueiro() {
        super();
        setAtaque(20);
        setDefesa(30);
        setVida(160);
    }

    @Override
    public String toString() {
        return String.format(
            "\nArqueiro Criado\n Nome do Arqueiro: %s \n Ataque: %f \n Defesa: %f \n Vida: %f \n Arma: %s\n",
            getNomePersonagem(), getAtaque(), getDefesa(), getVida(), getArmaPersonagem().getNomeArma());
    }



}
