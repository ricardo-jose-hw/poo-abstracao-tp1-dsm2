package classe13a16;


public class Fotografo {
	
	
	public int quantiaIluminacao;
	
	public boolean photoshop;
	
	public String pose;
	
	public int notaFoto;
	
	public static void tirarFoto(String pose, int iluminacao) {
		System.out.println("FOTO TIRADA. POSE: " + pose);
	}
	public static String mudarPose(String pose) {
		return "Próxima pose: " + pose;
	}
}