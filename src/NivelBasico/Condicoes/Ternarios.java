package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
         - MANEIRA DE REDUZIR CODIGO
         */

        short numeroDeMissao = 8;
        String niveldiNinja = (numeroDeMissao >= 10) ? "Esse ninja esta com mais de 10 missoes" : " Esse ninja tem menos de 10 missoes";
        System.out.println(niveldiNinja);

    }

}