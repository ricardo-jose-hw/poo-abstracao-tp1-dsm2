package classe13a16;

public class Cientista {
	
	public boolean Estequiometria;
	
	public int elementosTabelaPeriodicaConhecidos;
	
	public String unidadeMedidaDensidade;
	
	public boolean equipamentosProtecao;
	
	static String fazerHipotese(String objetoEstudo) {
		
		System.out.println("Será que " + objetoEstudo + " Pode virar uma teória?");
		return "Hipótese: " + objetoEstudo;
	}
		
	static boolean transformarHipoteseEmTeoria(String objetoEstudo, boolean testeFinal) {
		System.out.println("acho que pode ser sim..");
		if(testeFinal) {
			return true;
		}
		else {
			return false;
		}
	}	
	}
}