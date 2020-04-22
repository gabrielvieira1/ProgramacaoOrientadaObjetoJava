package lista01poo;
import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String nome;
		double salarionovo = 0;
		double salario, a = 0, b = 0;
		double qtddependente;
		double dependente = 15.00;
		System.out.println("Digite o nome do funcionario: ");
		nome = scan.next();
		System.out.println("Digite o salario: ");
		salario = scan.nextDouble();
		System.out.println("Digite o nº dependentes: ");
		qtddependente = scan.nextDouble();
		qtddependente *= dependente;
		System.out.println("=======================================");
		System.out.println("|     1 - ajuda de custo     - 150,00 |");
		System.out.println("|     2 - vale alimentação   -  75,00 |");
		System.out.println("|     3 - vale escola        - 290,00 |");
		System.out.println("|     4 - combustivel        - 305,00 |");
		System.out.println("|     2 - telefone           - 145,00 |");
		System.out.println("|     3 - Despesas de Viagem - 430,00 |");
		System.out.println("|     1 - Internet           - 200,00 |");
		System.out.println("|     2 - Livros             - 350,00 |");
		System.out.println("|     3 - Energia Elétrica   - 280,00 |");
		System.out.println("|     0 - Sair                        |");
		System.out.println("=======================================");
		System.out.println("Nome do Funcionario: " + nome  +"\n"+ "Salario: " + df.format((a = opcao(salarionovo + salario))) + "\n" +"Qtd dependentes: " + df.format(qtddependente) + "\n");
		b = a - qtddependente;
		System.out.println("O salario liquido: " + df.format(b));
		if (b >= 1000.00) {
			System.out.println("O funcionario terá de reter imposto de renda");
		} else if (b < 1000.00) {
			System.out.println("O funcionarios Não terá retenção de imposto de renda");
		}
	}
	public static double opcao(double salarionovo) {
		Scanner scan = new Scanner(System.in);
		int opcao = -1;
		int x = 0, y = 0, z = 0;
		boolean repetiu = false;
		double last = 0;
		while (opcao != 0) {
			System.out.println("Escolha seus beneficios: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				if (opcao == 1 && repetiu == true) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 1 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 150.00;
					last = salarionovo;
					x = 1;
				}
				break;
			case 2:
				if (opcao == 2 && x == 1) {
					salarionovo += 75.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 2 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 75.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 2 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 2 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 3:
				if (opcao == 3 && x == 1) {
					salarionovo += 290.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 3 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 290.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 3 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 3 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 4:
				if (opcao == 4 && x == 1) {
					salarionovo += 305.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 4 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 305.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 4 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 4 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 5:
				if (opcao == 5 && x == 1) {
					salarionovo += 145.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 5 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 145.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 5 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 5 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 6:
				if (opcao == 6 && x == 1) {
					salarionovo += 430.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 6 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 430.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 6 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 6 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 7:
				if (opcao == 7 && x == 1) {
					salarionovo += 200.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 7 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 200.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 7 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 7 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 8:
				if (opcao == 8 && x == 1) {
					salarionovo += 350.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 8 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 350.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 8 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 8 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			case 9:
				if (opcao == 9 && x == 1) {
					salarionovo += 280.00;
					last = salarionovo;
					z = 1;
				} else if (opcao == 9 && repetiu == false) { // primeira vez
					repetiu = true;
					salarionovo += 280.00;
					last = salarionovo;
					y = 1;
				} else if (opcao == 9 && z == 1) {
					System.out.println("Beneficio já cadastrado");
				} else if (opcao == 9 && y == 1) { // segunda, terceira ... vez
					System.out.println("Beneficio já cadastrado");
				}
				break;
			}
		}
		return salarionovo;
	}
}
