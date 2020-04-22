package lista04poo;

import java.text.ParseException;

public class CpfTeste {

	public static void main(String[] args) throws ParseException {
		CPF cpf = new CPF();
		System.out.println(cpf.formatarCpf("12352636589"));
	}

}
