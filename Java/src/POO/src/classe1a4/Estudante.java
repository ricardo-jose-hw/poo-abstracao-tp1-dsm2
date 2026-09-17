package classe1a4;

public class Estudante {
    public String nome;
    public int ciclo;
    public String curso;
    public boolean presenca;
    
    public void estudar(){
        System.out.println("Olá, meu nome é "+ this.nome +" e curso "+this.curso);
    }
    
    public void Organizarestudos(){
        System.out.println("Sou aluno do "+ this.ciclo +", e minhas tarefas estão em dia.");
    }
}
