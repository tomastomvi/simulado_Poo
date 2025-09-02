public class guerreiro extends personagem {
    
   private String arma;


    public guerreiro(String nome, int nivel, int vida, String arma) {
        super(nome, nivel, vida);
        this.arma = arma;
    }
public void defender(){
    System.out.println(getNome() + " está defendendo com sua " + arma + "!");
}

  @Override
 public void mostrarStatus() {
        System.out.println("----------- Status do Personagem -----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Arma: " + arma);
    }


    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }


}