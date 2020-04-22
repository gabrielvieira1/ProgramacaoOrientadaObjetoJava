package lista12poo;

public abstract class Banco implements BancoGeral{



	public ContaAbstrata abrirConta(Cliente c, String numeroDaConta,
			double saldoInicial, String tipo) {
		String conta = numeroDaConta;
		double saldo = saldoInicial;
		Cliente cliente = c;
		
		return null;
	}

	public ContaAbstrata deposito(ContaAbstrata c, double valor) {
		c.setSaldo(valor);
		return null;
	}

	public ContaAbstrata saque(ContaAbstrata c, double valor) {
		double novoSaque = c.getSaldo()-valor;
		return null;
	}

}
