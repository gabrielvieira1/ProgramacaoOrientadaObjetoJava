package poo.slide9.ClassesInternasInstanciadas.Membro;

public class TimeFutebol {
	private Tecnico tecnico;
	private Jogador[] time = new Jogador[11];

	class Pessoa {
		String nome;

		Pessoa(String nome) {
			this.nome = nome;
		}
		
		public String toString() {
			return nome;
		}
		
	}

	private class Tecnico extends Pessoa {
		Tecnico(String nome) {
			super(nome);
		}
	}

	public class Jogador extends Pessoa {
		public Jogador(String nome) {
			super(nome);
		}
		
		public String toString() {
			return nome;
		}
	}

	public void setTecnico(String nome) {
		this.tecnico = new Tecnico(nome);
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}



	public void addJogador(int cont, Jogador j) {
		time[cont] = j;
	}
	
	public void imprimir() {
		for (int i = 0; i < time.length; i++) {
			System.out.println("Jogador " + i + ": " + time[i]);
		}
	}

}
