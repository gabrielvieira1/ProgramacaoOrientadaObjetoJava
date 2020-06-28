package lista05poo;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class VendaImovel {
	public static void impresao(int opcaoEscolha, Usado obj, Novo obj2, Imovel obj3) {
		Scanner scan = new Scanner(System.in);
		int escolha = opcaoEscolha;
		String opcao;
		if (escolha == 1 ) {
			System.out.println("O Preço do novo imovel é: " + obj2.getAdicionalPreco() + " Endereço: " + obj3.getEndereco());
		} else {
			System.out.println("O Preço do imovel usado é: " + obj.getDescontoPreco() + " Endereço: " + obj3.getEndereco());
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int escolha;
		String opcao, enderecoDigitado;
		double precoDigitado;
		System.out.println("Digite 1 para novo e 2 para usado:");
		escolha = scan.nextInt();
		if (escolha == 1 ) {
			System.out.println("Digite o preço do novo Imovel:");
			precoDigitado= scan.nextDouble();
			System.out.println("Digite o Endereço do novo Imovel:");
			enderecoDigitado = scan.next();
			Imovel preco = new Imovel(precoDigitado);
			Imovel endereco = new Imovel(enderecoDigitado);
			Novo precoAtua = new Novo(precoDigitado);
			Usado precoUsado = new Usado(precoDigitado);
			endereco.setEndereco(enderecoDigitado);
			preco.setPreco(precoDigitado);
			precoUsado.setDescontoPreco(precoDigitado);
			precoAtua.setAdicionalPreco(precoDigitado);
			impresao(escolha, precoUsado, precoAtua, endereco);
		} else {
			System.out.println("Digite o preço do Imovel usado:");
			precoDigitado= scan.nextDouble();
			System.out.println("Digite o Endereço do Imovel usado:");
			enderecoDigitado = scan.next();
			Imovel preco = new Imovel(precoDigitado);
			Imovel endereco = new Imovel(enderecoDigitado);
			Novo precoAtua = new Novo(precoDigitado);
			Usado precoUsado = new Usado(precoDigitado);
			endereco.setEndereco(enderecoDigitado);
			preco.setPreco(precoDigitado);
			precoUsado.setDescontoPreco(precoDigitado);
			precoAtua.setAdicionalPreco(precoDigitado);
			impresao(escolha, precoUsado, precoAtua, endereco);
		}
	}
}