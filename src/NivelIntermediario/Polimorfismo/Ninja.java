package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements Estrategia {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }


    // Metodo Geral todos os ninjas vao ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + " e esse e meu ataque especial");

    }
    // Metodo abstrato - obrigatorio em todos os classes

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa e a minha estrategia de batalha");
    };




}
