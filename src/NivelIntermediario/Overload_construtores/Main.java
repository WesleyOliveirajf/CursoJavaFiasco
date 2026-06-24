package NivelIntermediario.Overload_construtores;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia das Folhas";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi Uchiha";
        itachi.aldeia = "Aldeia das Flores";
        itachi.idade = 27;
        itachi.habilidadeEspecial();

        // Obj Uchiha 3

        Uchiha madara = new Uchiha ("Madara Uhiha", "Aldeia das Flores", 45, 900,NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();





    }
}
