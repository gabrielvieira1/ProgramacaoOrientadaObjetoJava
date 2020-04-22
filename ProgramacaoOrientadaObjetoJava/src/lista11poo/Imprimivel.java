package lista11poo;

public interface Imprimivel {
	final boolean IMPRIME_NOME_DA_EMPRESA = true;
	final boolean NAO_IMPRIME_NOME_DA_EMPRESA = false;
	
	abstract public boolean imprime(boolean valor);

}
