package lista12poo;

public class ContaCorrente extends ContaAbstrata {

	public double deposito(double valor) {
		return 0;
	}

	public double saque(double valor) {
		Poupanca novoJuros = new Poupanca();
		valor = 100;
		double juros = ((1/valor)*valor);
		novoJuros.renderJuros(juros);
		return valor;
	}

}
