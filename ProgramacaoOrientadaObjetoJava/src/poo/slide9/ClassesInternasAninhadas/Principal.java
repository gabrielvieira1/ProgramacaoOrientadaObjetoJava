package poo.slide9.ClassesInternasAninhadas;

public class Principal {

	public static void main(String[] args) {
		// Criando uma inst�ncia de um objeto que cont�m uma classe interna.
		ClasseExterna ce = new ClasseExterna();
		// criando uma inst�ncia de um objeto de uma classe interna.
		ClasseExterna.ClasseInterna ci = ce.new ClasseInterna();
		// Imprimindo valores da classe externa e interna.
		System.out.println("Acessando valor da classe Externa = " + ce.valorClasseExterna);
		System.out.println("Acessando valor da classe Interna = " + ci.valorClasseInterna);
		// Invocando um m�todo de uma classe interna
		ci.imprimirInterna();
	}

}
