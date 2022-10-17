public class Mago extends Personagem {

    public Mago() {
        super();
        setAtaque(20);
        setDefesa(10);
        setVida(200);
    }

    @Override
    public String toString() {
        return String.format(
            "\nMago Criado\n Nome do Mago: %s \n Ataque: %f \n Defesa: %f \n Vida: %f \n Arma: %s\n",
            getNomePersonagem(), getAtaque(), getDefesa(), getVida(), getArmaPersonagem().getNomeArma());
    }
    
}
