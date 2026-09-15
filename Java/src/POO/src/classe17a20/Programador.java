package POO.src.classe17a20;

public class Programador {

    String linguagemProgramacao;
    String especializacao;
    int anosExperiencia;
    int nivelLogico;

    Programador (String linguagemProgramacao, String especializacao, int anosExperiencia, int nivelLogico) {
        this.linguagemProgramacao = linguagemProgramacao;
        this.especializacao = especializacao;
        this.anosExperiencia = anosExperiencia;
        this.nivelLogico = nivelLogico;
    }

    public void programarSistemas () {
        System.out.println("Ola, estou programando sistemas.");
    }

    public void tomarCafé () {
        System.out.println("Tomar Café me faz pensar melhor!");
    }
}
