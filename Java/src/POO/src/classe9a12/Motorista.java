package classe9a12;

public class Motorista {
	 	String nome;
	    int idade;
	    String numeroCnh;
	    String categoriaCnh;

	    public Motorista(String nome, int idade, String numeroCnh, String categoriaCnh) {
	        this.nome = nome;
	        this.idade = idade;
	        this.numeroCnh = numeroCnh;
	        this.categoriaCnh = categoriaCnh;
	    }

	    public void dirigir() {
	        System.out.println(nome + " está dirigindo.");
	    }

	    public void estacionar() {
	        System.out.println(nome + " está estacionando.");
	    }
}
