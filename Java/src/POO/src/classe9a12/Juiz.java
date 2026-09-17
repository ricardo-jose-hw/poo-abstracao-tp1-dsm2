package classe9a12;

public class Juiz {

    String nome;
    int idade;
    String numeroMatricula;
    String varaAtuacao;

    public Juiz(String nome, int idade, String numeroMatricula, String varaAtuacao) {
        this.nome = nome;
        this.idade = idade;
        this.numeroMatricula = numeroMatricula;
        this.varaAtuacao = varaAtuacao;
    }

    public void julgarProcesso() {
        System.out.println(nome + " está julgando um processo.");
    }

    public void emitirSentenca() {
        System.out.println(nome + " está emitindo uma sentença.");
    }
}