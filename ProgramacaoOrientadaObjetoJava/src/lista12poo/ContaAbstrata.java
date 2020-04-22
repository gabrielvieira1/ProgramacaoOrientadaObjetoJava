package lista12poo;

public abstract class ContaAbstrata {
	private String numeroConta;
	private double saldo;
	private String cliente;
	
	abstract public double deposito(double valor);
	abstract public double saque(double valor);
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
