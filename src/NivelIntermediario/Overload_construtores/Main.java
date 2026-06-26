package NivelIntermediario.Overload_construtores;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", NivelNinja.GENIN, 15, 20, "Aldeia das Flores" );
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();


        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia das Flores", 16, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi Uchiha";
        itachi.aldeia = "Aldeia das Flores";
        itachi.idade = 27;
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        // Obj Uchiha 3

        Uchiha madara = new Uchiha ("Madara Uhiha", "Aldeia das Flores", 45, 900,NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate(180);





    }
}
