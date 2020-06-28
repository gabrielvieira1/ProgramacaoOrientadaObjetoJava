/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista13poo;

public class Q1Principal {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		System.out.println(v.v);
		Veiculo.Transporte t = v.new Transporte();
		System.out.println(t.v);
		t.methodTransporte();
	}
}