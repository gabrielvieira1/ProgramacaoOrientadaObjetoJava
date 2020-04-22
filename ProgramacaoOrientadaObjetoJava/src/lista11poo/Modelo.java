/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista11poo;

abstract public class Modelo {
	private String nomeDaEmpresa;
	
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
		
		System.out.printf("Nome da empresa: %s", this);
	}
	
	
	public Modelo(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	
	abstract public String toString();
	
}