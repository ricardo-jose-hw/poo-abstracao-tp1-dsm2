package classe17a20;

public class Jornalista {

    public String Emissora;
    public String Faculdade;
    public String Idioma;
    public String NivelComunicação;

    Jornalista (String Emissora, String Faculdade, String Idioma, String NivelComunicação) {
        this.Emissora = Emissora;
        this.Faculdade = Faculdade;
        this.Idioma = Idioma;
        this.NivelComunicação = NivelComunicação;
    }

    public void entrevistar () {
        System.out.println("Olá, você gostaria de me dar uma entrevista?");
    }

    public void comunicarNoticia () {
        System.out.println("Ola, bandidos roubaram motos na grande são paulo!");
    }
}
