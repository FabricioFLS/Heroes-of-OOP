public class Personagem {
    private int ataque;
    private int defesa;
    private int vida;
    private String nomePersonagem;
    private Arma armaPersonagem;
    
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNomePersonagem() {
        return nomePersonagem;
    }
    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }
    public void name() {
        
    }
    public Arma getArmaPersonagem() {
        return armaPersonagem;
    }
    public void setArmaPersonagem(Arma armaPersonagem) {
        this.armaPersonagem = armaPersonagem;
    }

}