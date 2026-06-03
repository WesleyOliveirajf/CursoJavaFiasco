package NivelBasico.Desafio1;

public class desafio {
    public static void main(String[] args) {

       // NINJAS CONCLUIDOS
        String ninja1 = "Naruto";
        int idade1 = 16;
        String missao1 = "Missao Pescar";
        String dificuldademissao1 = "A";
        boolean missaoconcluida = false;

        String ninja2 = "charuton";
        int idade2 = 20;
        String missao2 = "Missao caçar";
        String dificuldademissao2 = "B";
        boolean missaoconcluida2 = false;

        String ninja3 = "Narutovisk";
        int idade3 = 16;
        String missao3 = "Missao voar";
        String dificuldademissao3 = "C";
        boolean missaoconcluida3 = false;

        System.out.println(ninja1);
        System.out.println(idade1);
        System.out.println(missao1);
        System.out.println(dificuldademissao1);
        System.out.println(missaoconcluida);

        if (idade1 > 15 && dificuldademissao1 == "A" ){
            System.out.println("o ninja:  " + ninja1 + ", Missão Concluida");
        } else{
            System.out.println("o ninja:" + ninja1 + ", Missão Não Concluida");
        }

        if (idade2 > 15 && dificuldademissao1 == "B" ){
            System.out.println("o ninja:  " + ninja2 + ", Missão Concluida");
        } else{
            System.out.println("o ninja:" + ninja2 + ", Missão Não Concluida");
        }

        if (idade3 > 15 && dificuldademissao1 == "C" ){
            System.out.println("o ninja:  " + ninja3 + ", Missão Concluida");
        } else{
            System.out.println("o ninja:" + ninja3 + ", Missão Não Concluida");
        }



    }

}