package NivelIntermediario.List;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array
        // Sao estaticos nunca altera de tamanho

        String [] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sakute";
        ninjasArray[2] = "Sakura";

        System.out.println("Printando o Array= " + ninjasArray[0]);

        //Listas
        // Listas podem aumentar de tamanho
        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tocurro Urama");
        ninjasList.add("Kakashi Hatake");

        System.out.println("NinjaList = " + ninjasList);

        // Remover da Lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("NinjaList = " + ninjasList);

        // Trocar Elementos
        ninjasList.set(3, "Hasirama Senju");
        System.out.println("NinjaList = " + ninjasList);

        // ver Tamanho da Lis
        System.out.println("Tamanho da Lista= " + ninjasList.size());










    }

}
