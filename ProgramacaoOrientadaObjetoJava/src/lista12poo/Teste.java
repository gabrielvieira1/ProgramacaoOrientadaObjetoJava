package lista12poo;

import java.util.Scanner;

public class Teste {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		BancoGeral obj = new BancoGeral() {
			
			
			private ContaAbstrata abrirConta;

			@Override
			public ContaAbstrata saque(ContaAbstrata c, double valor) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ContaAbstrata deposito(ContaAbstrata c, double valor) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ContaAbstrata abrirConta(Cliente c, String numeroDaConta, double saldoInicial, String tipo) {
				c.setNome("Pedro");
				c.setCpf("123456");
				abrirConta(c, "12345", 10, "poup");
				return null;
			}
		};
	}

}
