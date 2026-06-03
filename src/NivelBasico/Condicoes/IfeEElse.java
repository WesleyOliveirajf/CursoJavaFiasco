package NivelBasico.Condicoes;

public class IfeEElse {
    public static void main(String[] args) {

        /*
         if (condição) {resultado}
         else if (condição) {resultado}
         else {resultado}
         */
        String nome = "Naruto Uzumaki";
        int idade = 10;
        boolean hokage = false;
        short numeroMissao = 9;
        String rank ;

        // Se (Condição) { Faça Isso }

        if (numeroMissao == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroMissao >=20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennimn");
        }




    }

}