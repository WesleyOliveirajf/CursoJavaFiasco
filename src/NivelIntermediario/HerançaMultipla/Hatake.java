package NivelIntermediario.HerançaMultipla;

public class Hatake extends Ninja implements SharinganInterface, Anbuinterface{

    public void boasVindas(){
        System.out.println( nome + ": Eu sou um hatake");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Ninja de Elite");
    }

    public void sharinganAtivo(){
        System.out.println( nome + ": Sharingan ativado");
    }




}