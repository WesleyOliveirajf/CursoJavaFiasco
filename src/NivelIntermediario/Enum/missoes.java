package NivelIntermediario.Enum;

public class missoes {
    private String nome;
    private RankDeMissoes rank;

    // Metodo para mostrar mais informacao
    public void exibirDetalhes(){
        System.out.println(
                "Missao: " + nome + "Rank: "
                           + rank + "\n - Descriçao: "
                           + rank.getDescricao()+ " - Dificuldade"
                           + rank.getDificuldade());
    }



    public missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
