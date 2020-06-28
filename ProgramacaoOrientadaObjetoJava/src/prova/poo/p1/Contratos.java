package prova.poo.p1;

public class Contratos { //externa
	String contrato;
	int numero;
	Contratos(String contrato, int numero){
		this.contrato = contrato;
		this.numero = numero;
		System.out.println(contrato);
	}
	
	class PessoaFisica{ //interna aninhada
		String nome;
		public PessoaFisica(String nome) {
			this.nome = nome;
		}
		void imprimir() {
			System.out.println(contrato + ": PF, n�:" + numero + " em nome de: " + nome);
		}
	}
	class PessoaJuridica{ //interna aninhada
		String razaoSocial;
		public PessoaJuridica(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}
		void imprimir() {
			System.out.println(contrato + ": PJ, n�:" + numero + " em nome de: " + razaoSocial);
		}
	}

}
