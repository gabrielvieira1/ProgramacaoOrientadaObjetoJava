package lista08poo;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(int codigo, double salBase, double imposto) {
		super(salBase, imposto);
		this.codigoSetor = codigo;
		this.salarioBase = salBase;
		this.imposto = imposto;
	}
	public String getNome() {
		String novoNome = super.getNome();
		return novoNome;
	}
	
	public double calcularSalario(Double calSalario) {
		return calSalario;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		double calImposto;
		calImposto = (getSalarioBase() * imposto) /100;
		this.imposto = calImposto;
	}

}
