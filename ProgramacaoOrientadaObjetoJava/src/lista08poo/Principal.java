package lista08poo;

public class Principal {
	
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Pessoa [] nomePrincipal = new Pessoa[3];
		Pessoa novoNome = new Pessoa("Gabriel", "rua",null);
		nomePrincipal[0] = novoNome;
		nomePrincipal[1] = new Pessoa("Pedro", null, null);
		nomePrincipal[2] = new Pessoa("João", null, null);
		Fornecedor valor = new Fornecedor(1000, 3000);
		valor.setValorCredito(1000);
		valor.setValorDivida(3000);
		
		for (Pessoa e : nomePrincipal) {
			System.out.println(e.getNome() + e.getEndereco());
			
		}
		System.out.println(valor.getValorCredito());
		
	}
	
}
