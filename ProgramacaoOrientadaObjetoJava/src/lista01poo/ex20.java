package lista01poo;
import java.util.Scanner;
public class ex20 {
			private static Scanner scan;

			public static void main(String[] args) {
				scan = new Scanner(System.in);

				double n, p;

				System.out.println("Insira o valor de N: ");
				n = scan.nextDouble();

				System.out.println("Insira o valor de P: ");
				p = scan.nextDouble();

				double fatorialn = fatorial(n);
				double fatorialp = fatorial(n - p);
				double resultado = fatorialn / fatorialp;

				System.out.println("O resultado do arranjo é: " + resultado);
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
