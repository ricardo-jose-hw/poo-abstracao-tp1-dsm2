package classe5a8;

public class Bombeiro {
    int nivel_resistencia_fisica = 10;
    int primeiro_socorros;
    String dominio_nos;
    int coragem;

    public void apagarIncendio(){
    System.out.println("Eu vou ajudar voces!");
    for(int i = 10; i >=4 ;i--){
    nivel_resistencia_fisica--;    
    }
    resgatarVitima(){
    System.out.println("Incêndio apagado");
    System.out.println(nivel_resistencia_fisica);


    }
    public void resgatarVitima(){
            System.out.println("Vitima resgatada!");
    }

}

}