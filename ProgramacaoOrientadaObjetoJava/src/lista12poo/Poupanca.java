package lista12poo;

public class Poupanca extends ContaAbstrata{
	
	public double deposito(double valor) {
		return valor;
	}
	public double saque(double valor) {
		return valor;
	}
	
	public void renderJuros(double juros) {
		double aumento;
		aumento = juros + (1/getSaldo());
		setSaldo(aumento);
	}

}
