import java.util.Scanner;

public class Personagem {
    Scanner sc = new Scanner(System.in);                
    
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
        System.out.println("Digite o nome do seu personagem");
        nomePersonagem = sc.toString();
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
<<<<<<< HEAD
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
=======
    public double dano;
    public double receberAtaque(int ataque){
        return vida -= (ataque - defesa);
    }


>>>>>>> f05308dd1ad5f2b0bdfd72e5bb3ac009f5bb017f

}