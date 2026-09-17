package classe1a4;

public class Professor {
    public String licenciatura;
    public boolean didatica;
    public String nome;
    public int idade;
}

public void ensinar(){
    System.out.println("Eu dou aula de " + this.licenciatura+ " para os alunos.");
}

public void aplicarProva(){
    System.out.println("Vou aplicar prova em breve, estudem!");
}