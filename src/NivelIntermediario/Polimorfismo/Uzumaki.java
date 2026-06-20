package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja {

    // Sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse e meu ataque Uchiha, Ataque de FOGO");
    }
}