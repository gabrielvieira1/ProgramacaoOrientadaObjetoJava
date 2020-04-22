package lista11poo;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {
	private int numeroMotores;
	
	
	public boolean estaParado() {
		return true;
	}
	
    public void subir (int metros) {
		System.out.println("subir: " + metros + " metros");
	}
	public void descer (int metros) {
		System.out.println("Descer: " + metros + " metros");
	}
	public void curvar (float angulo) {
		System.out.println("Curva: " + angulo + " grau");
	}
	public void abastecer (int qtdLitros) {
		System.out.println("Abastecer: " + qtdLitros + " litros");
	}
	public void abastecer() {
		System.out.println("Não abasteceu");
	}
	
	public boolean ligarMotor() {
		return(true);
	}
}
