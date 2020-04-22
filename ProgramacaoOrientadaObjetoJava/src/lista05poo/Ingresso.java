package lista05poo;

public class Ingresso {
	public static double valor;
	public static String localArq;

	public Ingresso(double valor, String loc) {
		this.valor = valor;
		this.localArq = loc;
	}
	public static double getValor() {
		return valor;
	}
	public static void setValor(double valor) {
		IngressoVip preco = new IngressoVip(valor, "");
		preco.setValorAdd(valor + 50);
		valor = valor;
	}
	public static String getLocalArq() {
		return localArq;
	}
	public static void setLocalArq(String localArq) {
		localArq = localArq;
	}
	
}
