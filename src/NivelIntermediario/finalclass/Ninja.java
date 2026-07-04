package NivelIntermediario.finalclass;


public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;


    public Ninja() {
    }

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE
    final public void tacaKunai(){
        System.out.println("EU SOU UM METODO DA CLASSE MAE");
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

    // Inteligencia de Combate - Metodo Padrao
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: " + nome + " Essa é minha Inteligencia de combate");
    }

    // Sobrecarga de metodo - Inteligencia de Combate
    public void inteligenciaDeCombate(int qi){
        if (qi>150){
            System.out.println("Seu QI é: "+qi+" e você e um Gênio");
        } else if (qi>=130) {
            System.out.println("Seu QI é: "+qi+" e você tem potencial");
        } else {
            System.out.println("Seu QI é: "+qi+" e você tem que se esforça");
        }

    }

    public void metodoProvisorio(){
        System.out.println("teste na classe Ninja");
    }


}
