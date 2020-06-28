package lista08poo;
import java.util.Scanner;
public class EmpregadoTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Empregado codigo = new Empregado(2, 1000, 0);
		System.out.println("Digite o Nome do funcionario:");
		codigo.setNome(scan.next());
		System.out.println("Digite o codigo do Setor:");
		codigo.setCodigoSetor(scan.nextInt());
		System.out.println("Digite o salario base:");
		codigo.setSalarioBase(scan.nextDouble());
		System.out.println("Digite o percentual do salario retido:");
		codigo.setImposto(scan.nextDouble());
		System.out.println(codigo.getNome());
		System.out.println(codigo.getCodigoSetor());
		System.out.println(codigo.getSalarioBase());
		System.out.println(codigo.getImposto());
	
	}

}
