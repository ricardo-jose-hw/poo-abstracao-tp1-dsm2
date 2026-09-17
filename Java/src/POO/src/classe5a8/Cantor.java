package classe5a8;

public class Cantor {
    public int nivel_extensao_vocal;
    public int nivel_afinacao_vocal;
    public String controle_respiratorio;
    public String presenca_palco;

    public void aquecerVoz(){
        System.out.println("Do, re, mi, fa, sol, la, si, do...");
        nivel_afinacao_vocal++;
        nivel_extensao_vocal++;

    }
    public void CantarAoVivo(){
            System.out.println("Estao prontos para o show..?");

}
}
