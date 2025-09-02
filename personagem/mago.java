public class mago extends personagem {
    
    private int mana;

    public mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida);
        this.mana = mana;
    }

    public void consumirmana(){
        if (mana >= 10 && mana <= 100) {
            mana -= 100;
            System.out.println(getNome() + " está consumindo mana! Mana restante: " + mana);
        } else {
            System.out.println(getNome() + " não tem mana suficiente para consumir!");
        }
    }

    public void regenerarmana(){
        if (mana >= 0 && mana < 100) {
            mana += 50;
            System.out.println(getNome() + " está regenerando mana! Mana atual: " + mana);
        } else {
            System.out.println(getNome() + " já está com a mana cheia!");
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    @Override
    public void mostrarStatus() {
        System.out.println("----------- Status do Personagem -----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Mana: " + mana);
    }
}

   