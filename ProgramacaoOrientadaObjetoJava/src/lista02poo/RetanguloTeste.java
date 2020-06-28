package lista02poo;

import java.util.Scanner;

public class RetanguloTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Retangulo x = new Retangulo();
			
			double a, b;
			System.out.println("Digite o valor da altura:");
			a = scan.nextDouble();
			System.out.println("Digite o valor da largura:");
			b = scan.nextDouble();
			x.pass(a, b);
			System.out.println(x.getArea());
			System.out.println(x.getPerimetro());
			
	}

}
