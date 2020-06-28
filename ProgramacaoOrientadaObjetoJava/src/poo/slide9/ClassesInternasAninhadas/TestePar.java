package poo.slide9.ClassesInternasAninhadas;

public class TestePar {

	public static void main(String[] args) {
		Par.Chave chave = new Par.Chave("Nota");
		Par.Valor valor = new Par.Valor(10);
		Par par = new Par(chave, valor);
		System.out.println(chave.getNome() + " " + valor.getValor());
		System.out.println(par.getChave().getNome());
	}
}
