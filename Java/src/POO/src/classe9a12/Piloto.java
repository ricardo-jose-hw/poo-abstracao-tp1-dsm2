package classe9a12;

public class Piloto {

    String nome;
    int idade;
    String numeroLicenca;
    int horasVoo;

    public Piloto(String nome, int idade, String numeroLicenca, int horasVoo) {
        this.nome = nome;
        this.idade = idade;
        this.numeroLicenca = numeroLicenca;
        this.horasVoo = horasVoo;
    }

    public void pilotar() {
        System.out.println(nome + " está pilotando o avião.");
    }

    public void pousar() {
        System.out.println(nome + " está pousando o avião.");
    }
    
}