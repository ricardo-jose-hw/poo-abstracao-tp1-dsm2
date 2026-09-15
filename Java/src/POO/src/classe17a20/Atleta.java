package POO.src.classe17a20;

import java.util.Random;

public class Atleta {
    int forca;
    int resistencia;
    int foco;
    int modalidade;

    Atleta (int forca, int resistencia, int foco, int modalidade) {
        this.forca = forca;
        this.resistencia = resistencia;
        this.foco = foco;
        this.modalidade = modalidade;
    }

    public void treinar () {
        this.forca += 10;
        this.resistencia += 10;
        this.foco += 10;
    }

    public void disputarCampeonatos () {
        System.out.println("Vencer ou Perder...");
    }
}
