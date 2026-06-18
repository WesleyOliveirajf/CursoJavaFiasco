package NivelIntermediario.Construtores;

public class main {
    public static void main(String[] args) {



        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages();
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages();
        System.out.println(Minato.idade);

    }

}