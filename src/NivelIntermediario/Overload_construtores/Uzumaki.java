package NivelIntermediario.Overload_construtores;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, int idade, String aldeia) {
        super(nome, rank, numeroDeMissoesConcluidas, idade, aldeia);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de fogo. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes." );
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: " + nome + " Essa é minha Inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi>150){
            System.out.println("Seu QI é: "+qi+" e você e um Gênio");
        } else if (qi>=130) {
            System.out.println("Seu QI é: "+qi+" e você tem potencial");
        } else {
            System.out.println("Seu QI é: "+qi+" e você tem que se esforça");
        }

    }
}
