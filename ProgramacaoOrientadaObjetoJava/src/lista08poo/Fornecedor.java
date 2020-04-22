package lista08poo;

public class Fornecedor extends Pessoa {
	
	private double valorCredito, valorDivida;
	private String sobrenome;

	public Fornecedor(double valorCred, double valorDiv) {
		super(valorCred, valorDiv);
		this.valorCredito = valorCred;
		this.valorDivida = valorDiv;
	}
	public double obterSaldo(double saldoCred, double saldoDivida) {
		double saldoDiv = (getValorCredito()-getValorDivida());
		return saldoDiv;
	}
	public String getNome() {
		String novoNome = super.getNome();
		return (novoNome);
	}
	public double getValorCredito() { 
		return valorCredito ;
	}
	public void setValorCredito(double valorCredito) {
		double obter = obterSaldo(getValorCredito(), getValorDivida());
		this.valorCredito = obter;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
