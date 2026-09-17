package classe13a16;

public class Arquiteto {
public boolean nocaoResistenciaMateriais;

public boolean designExterior;

public String especialidadeEstrutural;

public int anosExperiencia;

static void chamarProfissional(int contato, String nomeContato) {
	System.out.println("Chamar: "+nomeContato + "Ligar para: " + contato);
}

static void planejarPredioTorto(String planta) {
	System.out.println("Planejando o prédio com o blueprint: " + planta);
}
}
