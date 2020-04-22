package lista05poo;

public class Imovel {
	public String endereco;
	public double preco;
	public Imovel(String endereco) {
		this.endereco = endereco;
	}
	public Imovel(double preco) {
		this.preco = preco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
