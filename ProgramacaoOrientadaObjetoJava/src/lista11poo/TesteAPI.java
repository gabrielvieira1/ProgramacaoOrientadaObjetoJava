package lista11poo;

public class TesteAPI {
	public static void main(String[] args) {
		
		LinguagemDeProgramacao obj = new LinguagemDeProgramacao("Java", "Oracle");
		obj.imprime(obj.getNomeDaEmpresa());
		obj.imprime(obj.getNomeDaLinguagem());
	}
}
