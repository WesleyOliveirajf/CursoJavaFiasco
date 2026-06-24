package NivelIntermediario.Overload_construtores;


public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    public Ninja() {
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamado os novos atributos

    //Sobrecarga de metodos voce nao precisa redeclar o construtor so os novos atributos.
    public Ninja(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, int idade, String aldeia) {
        this(nome, aldeia, idade);
        this.rank = rank;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;

    }

    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }

}
