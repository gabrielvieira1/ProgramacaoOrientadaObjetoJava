package poo.slide9.ClassesInternasAninhadas;

public class ClasseExterna {
	// Definindo uma vari�vel da classe Extera
	int valorClasseExterna = 10;

	// Criando uma inst�ncia da Classe Externa
	public ClasseExterna() {
	}

	// Criando um membro (Classe Interna)
	class ClasseInterna {
		int valorClasseInterna = 50;

		void imprimirInterna() {
			System.out.println("valor da classe externa: " + valorClasseExterna);
			System.out.println("valor da classe interna: " + valorClasseInterna);
		}
	}

}
