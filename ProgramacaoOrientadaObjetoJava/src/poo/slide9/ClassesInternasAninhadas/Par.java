package poo.slide9.ClassesInternasAninhadas;

public class Par {
	private Chave chave;
	private Valor valor;

	public Par(Chave chave, Valor valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public Chave getChave() {
		return chave;
	}

	public Valor getValor() {
		return valor;
	}

	static class Chave {
		private String nome;

		public String getNome() {
			return nome;
		}

		public Chave(String nome) {
			this.nome = nome;
		}
	}

	protected static class Valor {
		private int valor;

		public Valor(int valor) {
			this.valor = valor;
		}

		public int getValor() {
			return valor;
		}
	}
}
