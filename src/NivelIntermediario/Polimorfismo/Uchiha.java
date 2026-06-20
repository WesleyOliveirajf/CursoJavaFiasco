package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    // Sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + " e esse e meu ataque especial");

    }















}