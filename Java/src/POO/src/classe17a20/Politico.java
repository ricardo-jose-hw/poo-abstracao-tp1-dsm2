package classe17a20;

public class Politico {

    public String partido;
    public String cargoPolitico;
    public String faculdade;
    public String nivelComunicacao;

    Politico (String partido, String cargoPolitico, String faculdade, String nivelComunicacao) {
        this.partido = partido;
        this.cargoPolitico = cargoPolitico;
        this.faculdade = faculdade;
        this.nivelComunicacao = nivelComunicacao;
    }

    public void criarLeis () {
        System.out.println("Crio Leis, eu tenho poder.");
    }

    public void eleicao () {
        System.out.println("Estou me elegendo para presidente!");
    }
}
