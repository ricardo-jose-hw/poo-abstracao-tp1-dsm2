package classe13a16;


public class Pintor {
	
	
	public boolean usarCavalete;
	
	public String EstiloArte;
	
	public String tipoTintaFavorita;
	
	public int quantiaPinceisDiferentes;
	
	public static void pintarQuadro(String objetoPintado) {
		System.out.println("Pintei " +objetoPintado);
	}
	
	public static String autografarQuadro(String rubrica) {
		return "Assinatura do artista: "+ rubrica;
		
	}
}