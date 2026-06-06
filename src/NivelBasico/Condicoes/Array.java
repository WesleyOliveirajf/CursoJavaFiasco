package NivelBasico.Condicoes;

public class Array {
    public static void main(String[] args) {

      // Array sao tipo referencia

        String[] ninja = new String[7];
        ninja[0] = "Hashimiri Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Hakume";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        ninja[5] = "Tsunade";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[3]);

        // For para fazer um loop

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja [i]);

        }


        // Redeclar os ninjas
        ninja = new String[6];
        System.out.println(ninja[5]);

        String nomeDoNinja1 = "Gaara de fesertt";
        String nomeDoNinja2 = "Rocky Lee";







    }
}