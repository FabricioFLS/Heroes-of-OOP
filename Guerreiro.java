public class Guerreiro extends Personagem {

    public Guerreiro() {
        super();
        setAtaque(30);
        setDefesa(20);
        setVida(180);
    }

    @Override
    public String toString() {
        return String.format(
            "\nGuerreiro Criado\n Nome do Guerreiro: %s \n Ataque: %f \n Defesa: %f \n Vida: %f \n Arma: %s\n",
            getNomePersonagem(), getAtaque(), getDefesa(), getVida(), getArmaPersonagem().getNomeArma());
    }
    
    
    
}
