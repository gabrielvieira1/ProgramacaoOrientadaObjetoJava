package lista05poo;

public class Novo extends Imovel {
	public double adicionalPreco;
	
	public Novo(double addPreco) {
		super(addPreco);
		//addPreco = 50;
		this.adicionalPreco = addPreco + 50;
	}
	public double getAdicionalPreco() {
		return adicionalPreco;
	}
	public void setAdicionalPreco(double adicionalPreco) {
		this.adicionalPreco = adicionalPreco + 50;
	}
}
