package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    Boolean vivoOuNao;

    public Hokages(String nome){
        this.nome = nome;

    }

    public Hokages(int idade){
        this.idade = idade;
    }

    // All args constructor = construtor com todos argumentos
    public Hokages(int idade, String nome, Boolean vivoOuNao) {
        this.idade = idade;
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
    }
}