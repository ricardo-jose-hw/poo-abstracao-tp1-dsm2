package classe9a12;

public class Advogado {

    public String nome;
    public int idade;
    public String oab;
    public String areaAtuacao;

    public Advogado(String nome, int idade, String oab, String areaAtuacao) {
        this.nome = nome;
        this.idade = idade;
        this.oab = oab;
        this.areaAtuacao = areaAtuacao;
    }

    public void defenderCliente() {
        System.out.println(nome + " está defendendo um cliente.");
    }

    public void elaborarProcesso() {
        System.out.println(nome + " está elaborando um processo.");
    }
}