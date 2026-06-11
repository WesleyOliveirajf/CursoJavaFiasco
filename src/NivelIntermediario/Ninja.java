package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Criar um metodo publico personalizado

    public void SharinganAtivado (){
        System.out.println("O Sarigan Ativou");

    }

    // Criar METOSDO STRING vai ter que retornar uma String

    public String euSouUmNinja(){
        return "Oi eu sou um ninja";
    }

    // Metodo INT vai ter que retornar um INT

    public int anosParaRetornarHokage (int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }



}