package lista05poo;

public class CamaroteSuperior extends IngressoVip{
	
	public static String localSuperior;
	
	public CamaroteSuperior(String locSup) {
		super(valorAdd, locSup);
		this.localSuperior = locSup;
	}
	public static String getLocalSuperior() {
		return localSuperior;
	}
	public static void setLocalSuperior(String localSuperior) {
		CamaroteSuperior.localSuperior = localSuperior;
	}

}
