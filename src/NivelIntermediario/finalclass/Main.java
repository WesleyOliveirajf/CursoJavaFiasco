package NivelIntermediario.finalclass;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", NivelNinja.GENIN, 15, 20, "Aldeia das Flores" );
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        System.out.println("-------------");
        naruto.tacaKunai();
        System.out.println("-------------");
        System.out.println(naruto.altura);

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Novo NInja";


        // Obj uchiha
        System.out.println("-------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia das Flores", 16, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2
        System.out.println("-------------");
        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi Uchiha";
        itachi.aldeia = "Aldeia das Flores";
        itachi.idade = 27;
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        // Obj Uchiha 3

        Uchiha madara = new Uchiha("Madara Uhiha", "Aldeia das Flores", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate(180);






    }
}
