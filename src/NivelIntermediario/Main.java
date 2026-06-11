package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
         // Criar Ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeias das Folha";
        Naruto.idade = 14;

        // CRIAR NINJA SASUKE UCHIHA - SASUKE E UM OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia das Folhas";
        Sasuke.idade= 18;
        Sasuke.SharinganAtivado(); // Ativando Metodos

        String chamandoMetodo= Sasuke.euSouUmNinja(); // Metodo String = como mostrar no terminal
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaRetornarHokage(70); // metodo INT
        System.out.println("Você tem a idade de: "+ Sasuke.idade + " anos, e falta: " + quantoTempoFalta + " anos");



        // CRIAR NINJA SAKURA HARUNO
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Harume";
        Sakura.aldeia = " Aldeia da Folha";
        Sakura.idade = 20;













    }
}