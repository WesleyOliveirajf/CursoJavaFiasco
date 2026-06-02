package Cindicoes;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class ScannerDoUsuario {
    private static String system;

    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva o nome do Ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja e: " + nomeDoNinja);

        // Receber o idade do ninja
        System.out.println(" Escreva idade do seu ninja");
        int idadeDoNInja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNInja);

        if(idadeDoNInja > 18){
            System.out.println("Esse ninja e Maior de Idade");
        }else {
            System.out.println("Ninja muito novo");
        }




        caixaDeTexto.close();
    }


}