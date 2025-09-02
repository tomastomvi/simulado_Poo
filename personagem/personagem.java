public class personagem {
   private String nome;
    private int nivel;
    private int vida;
    
    public personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
        }
        public void setNome(String nome) {
        this.nome = nome;
        }

    public int getNivel() {
        return nivel;
        }
        public void setNivel(int nivel) {
        this.nivel = nivel;
        }

    public int getVida() {
        return vida;
        }

        public void setVida(int vida) {
        this.vida = vida;   
        }

        public void atacar(){
        System.out.println(nome + " está atacando!");
        }
        
     public void mostrarStatus() {
        System.out.println("----------- Status do Personagem -----------");
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }

}