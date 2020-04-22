/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista04poo;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class GeradorDeCPF {
	// atributos
	public static String digitos = "##/##/####"; // campo para cpf
	public static String ftmCpf; // cpf formatado
	// converter para formato cpf

	public static void aplicaMascara(String cpf) throws ParseException {

		try {

			MaskFormatter mask = new MaskFormatter("##/##/####");
			mask.setValueContainsLiteralCharacters(false);
			System.out.println("DATA : " + mask.valueToString(cpf));

		} catch (ParseException e) {

			System.out.println("Erro");

		}

	}

	// entrada dos digitos do cpf
	public static void main(String[] args) throws ParseException {
		GeradorDeCPF cpf = new GeradorDeCPF();
		String cpf1;
		cpf.digitos = JOptionPane.showInputDialog("Digite a data:");
		aplicaMascara(cpf.digitos);
	}
}