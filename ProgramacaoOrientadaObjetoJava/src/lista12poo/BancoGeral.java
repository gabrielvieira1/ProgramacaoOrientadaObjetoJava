package lista12poo;

public interface BancoGeral {
	
	public ContaAbstrata abrirConta(Cliente c, String numeroDaConta, double saldoInicial,
			String tipo);
	
	public ContaAbstrata deposito(ContaAbstrata c, double valor);
	
	public ContaAbstrata saque(ContaAbstrata c, double valor);

}
