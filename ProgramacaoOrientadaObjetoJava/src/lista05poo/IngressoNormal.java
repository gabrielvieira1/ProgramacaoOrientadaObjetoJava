package lista05poo;

public class IngressoNormal extends Ingresso {

	public static double ingNormal;
	public static String localArqNormal;
	
	public IngressoNormal(double ingressoNormal, String loc) {
		super(ingressoNormal, loc);
		this.ingNormal = ingressoNormal;
		this.localArqNormal = loc;
	}
	
	public static double getIngNormal() {
		return ingNormal;
	}
	public static void setIngNormal(double ingNormal) {
		ingNormal = ingNormal;
	}
	public static String getLocalArqNormal() {
		return localArqNormal;
	}
	public static void setLocalArqNormal(String localArqNormal) {
		localArqNormal = localArqNormal;
	}
	
}
