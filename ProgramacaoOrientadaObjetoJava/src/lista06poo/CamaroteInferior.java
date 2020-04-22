package lista06poo;

public class CamaroteInferior extends IngressoVip{
	
	public static String localInferior;
	
	public CamaroteInferior(String localInf) {
		super(valorAdd, localInf);
		this.localInferior = localInf;
		
	}
	public static String getLocalInferior() {
		return localInferior;
	}
	public static void setLocalInferior(String localInferior) {
		CamaroteInferior.localInferior = localInferior;
	}

}
