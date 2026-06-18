package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    Boolean vivoOuNao;
    int missao;
    double saldoBancario;
    double altura;

    public Hokages() {
    }

    public Hokages(String nome){
        this.nome = nome;

    }

    // All args constructor = construtor com todos argumentos


    public Hokages(String nome, int idade, Boolean vivoOuNao, int missao, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.missao = missao;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}