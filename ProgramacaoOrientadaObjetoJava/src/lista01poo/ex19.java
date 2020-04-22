package lista01poo;
import java.util.Scanner;
public class ex19 {
			private static Scanner scan;

			public static void main(String[] args) {
				scan = new Scanner(System.in);

				double n, p;

				System.out.println("Insira o valor de n: ");
				n = scan.nextDouble();

				System.out.println("Insira o valor de p: ");
				p = scan.nextDouble();

				double fatorialn = fatorial(n);
				double fatorialp = fatorial(p);
				double fatorialnp = fatorial(n - p);
				double resultado = fatorialn / (fatorialp * fatorialnp);
				System.out.println("O resultado da combinação é: " + resultado);

			}

			private static double fatorial(double n) {
				double fat = 1;
				while (n > 0) {
					fat *= n;
					n--;
				}
				return fat;

	}

}
