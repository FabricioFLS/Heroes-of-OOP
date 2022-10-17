

public class Dragao extends Personagem{ 

    public Dragao() {
        super();
        setNomePersonagem("Lazyprog");
        setAtaque(30);
        setDefesa(30);
        setVida(300);
    }
        
    @Override
    public String toString() {
        return String.format(
            "Dragão: %s \n Ataque: %f \n Defesa: %f \n Vida: %f",
            getNomePersonagem(), getAtaque(), getDefesa(), getVida());
    } 
    @Override
    public void atacar(Personagem atacante, Personagem atacado) {
        double dano = 0;
        if (!atacado.isPosicaoRodada()) {            
            double ataque = atacante.getAtaque() - atacado.getDefesa();
            System.out.printf("\nAtaque do %s = %f\nDefesa do %s = %f",
            atacante.getNomePersonagem(),atacante.getAtaque(),atacado.getNomePersonagem(),atacado.getDefesa());
            if (ataque > 0) {
                double vida = atacado.getVida() - ataque;
                atacado.setVida(vida);
                dano = ataque;
            } else{
                System.out.println("\nSua defesa foi suficiente para segurar o ataque");
            }
            
        } else {
            double ataque = atacante.getAtaque() - (atacado.getDefesa()*1.1);
            System.out.printf("\nAtaque do %s = %f\nDefesa do %s = %f",
            atacante.getNomePersonagem(),atacante.getAtaque(),atacado.getNomePersonagem(),atacado.getDefesa()*1.1);
            if (ataque > 0) {
                double vida = atacado.getVida() - ataque;
                atacado.setVida(vida);
                dano = ataque;
            } else {
                System.out.println("\nSua defesa foi suficiente para segurar o ataque");

            }
            
        }

        System.out.printf("\nO personagem atacado foi: %s \nO dano foi de: %f\nA vida atual é de: %f \n",
          atacado.getNomePersonagem(), dano, atacado.getVida());
        
    }

    
    


}
