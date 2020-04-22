package lista01poo;
import java.util.Scanner;
public class ex8 {
			private static Scanner scan;

			public static void main(String[] args) {
				scan = new Scanner(System.in);

				int num, fat = 1;
				int cont = 1;

				do {
					System.out.println("Insira um nº: ");
					num = scan.nextInt();

					for (int i = 1; i <= num; i++) {
						fat = fat * i;
					}

					System.out.println("O fatorial de " + num + " é igual a: " + fat);
					cont++;

				} while (cont < 2);
			}

		}
