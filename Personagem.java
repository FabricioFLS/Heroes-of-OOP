import java.util.Scanner;

public class Personagem {
    Scanner sc = new Scanner(System.in);                
    
    private double ataque;
    private double defesa;
    private double vida;
    private String nomePersonagem;
    private Arma armaPersonagem;
    private boolean posicaoRodada;
    
    public boolean isPosicaoRodada() {
        return posicaoRodada;
    }
    public void setPosicaoRodada(boolean posicaoRodada) {
        this.posicaoRodada = posicaoRodada;
    }
    public double getAtaque() {
        return ataque;
    }
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    public double getDefesa() {
        return defesa;
    }
    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }
    public double getVida() {
        return vida;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }
    public String getNomePersonagem() {
        return nomePersonagem;
    }
    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;        
    }
    
    public Arma getArmaPersonagem() {
        return armaPersonagem;
    }
    public void setArmaPersonagem(Arma armaPersonagem) {
        this.armaPersonagem = armaPersonagem;
        ataque += armaPersonagem.getAtaque();
        defesa += armaPersonagem.getDefesa();
    } 
    
    public void atacar(Personagem atacante, Personagem atacado) {
        double ataque = atacante.getAtaque() - atacado.getDefesa();
        double vida = atacado.getVida() - ataque;
        atacado.setVida(vida);
        System.out.printf("\nO %s Causou %f de danos no %s\nVida do %s = %f\n",
        atacante.getNomePersonagem(),ataque,atacado.getNomePersonagem(),atacado.getNomePersonagem(),atacado.getVida());

    }
   
       
}