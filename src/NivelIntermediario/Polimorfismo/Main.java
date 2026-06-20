package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia das Folhas";
        naruto.idade = 16;

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia das folhas";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();

        Uchiha itachi = new Uchiha("Itachi Uchiha",16, "Aldeia das Folhas");
        itachi.habilidadeEspecial();

    }

}