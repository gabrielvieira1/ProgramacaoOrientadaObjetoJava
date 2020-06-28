package lista11poo;

public class LinguagemDeProgramacao extends Modelo{
	
	private String nomeDaLinguagem;
	
	public String getNomeDaLinguagem() {
		return nomeDaLinguagem;
	}

	public void setNomeDaLinguagem(String nomeDaLinguagem) {
		this.nomeDaLinguagem = nomeDaLinguagem;
	}
	
	public LinguagemDeProgramacao(String nomeLinguagem, String nomeDaEmpresa) {
		super(nomeLinguagem);
		this.nomeDaLinguagem = nomeLinguagem;
	}
	
	public String toString() {
		return(" ");
	}
	
	public void imprime(String nomeEmpresa) {
		System.out.println("Nome da empresa : " + nomeEmpresa);
	}

	
	
}
