package classe1a4;

public class Engenheiro {
    public String nome;
    public String crea;
    public String nivel;
    public boolean trabalhando;

    public void Calcular(){
        System.out.println("Estou fazendo cálculos para o meu projeto.");
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+ this.nome +"\nCrea: "+ this.crea +"\nNível: "+this.nivel);
    }
}