package NivelIntermediario.Abstrato;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama Senju";
        hashirama.habilidadeEspecial();

    }

}