package lista11poo;

public abstract class TransporteAereo extends Transporte {
	private int altitudeAtual;
	
	abstract public void subir (int metros);
	
	abstract public void descer (int metros);
	

}
