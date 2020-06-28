package lista06poo;

public class IngressoVip extends Ingresso {
	
	public static double valorAdd;
	public static String locVip;

	public IngressoVip(double valor, String localVip) {
		super(valor, localVip);
		this.valorAdd = valor;
		this.locVip = localVip;
	}
	public static double getValorAdd() {
		return valorAdd;
	}
	public static void setValorAdd(double valorAdd) {
		IngressoVip.valorAdd = valorAdd;
	}
	public static String getLocVip() {
		return locVip;
	}
	public static void setLocVip(String locVip) {
		IngressoVip.locVip = locVip;
	}
	
}
