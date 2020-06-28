package lista05poo;

public class Usado extends Imovel {
	public double descontoPreco;
	
	public Usado(double descpreco) {
		super(descpreco);
		this.descontoPreco = descpreco - 50;
	}
	public double getDescontoPreco() {
		return descontoPreco;
	}
	public void setDescontoPreco(double descontoPreco) {
		this.descontoPreco = descontoPreco - 50;
	}
}
