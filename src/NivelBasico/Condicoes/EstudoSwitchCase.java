package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

    /*
    * SwitchCase: Que serve para Gerar casos especificos
    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuki Uchida");
        System.out.println("3 - Sakuro Haruno");

        // Escolha do Usuario
        int escolhadoUsuario = scanner.nextInt();

        System.out.println(" Você digitou o numero: " + escolhadoUsuario);

        // Reaçao ao escolher um presonagem

        switch (escolhadoUsuario){
            case 1 :
                System.out.println(" Sua escolha foi o Naruto Uzumaki");
                break;
            case 2 :
                System.out.println(" Sua escolha foi o Sasuki Uchida");
                break;
            case 3 :
                System.out.println(" Sua escolha foi o Sakuro Haruno");
                break;
            default:
                System.out.println("Voce nao digitou uma aplicação valida");

        }




        scanner.close();



    }

}