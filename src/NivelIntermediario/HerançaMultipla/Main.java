package NivelIntermediario.HerançaMultipla;

public class Main {
    public static void main(String[] args) {
        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia das Flores";
        sasuke.idade = 18;
        sasuke.sharinganAtivo();


        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia das Flores";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivo();
        kakashi.ninjaDeElite();
    }

}