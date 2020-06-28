package lista01poo;
import java.util.Scanner;
public class ex14 {
			private static Scanner scan;

			public static void main(String[] args) {

				// Verificação de vogal.

				scan = new Scanner(System.in);

				char vogal;

				System.out.println("Insira uma letra do alfabeto: ");
				vogal = scan.next().charAt(0);

				switch (vogal) {
				case 'A':
					System.out.println("A vogal escolhida foi a letra ''A''!");
					break;
				case 'B':
					System.out.println("A vogal escolhida foi a letra ''B''!");
					break;
				case 'C':
					System.out.println("A vogal escolhida foi a letra ''C''!");
					break;
				case 'D':
					System.out.println("A vogal escolhida foi a letra ''D''!");
					break;
				case 'E':
					System.out.println("A vogal escolhida foi a letra ''E''!");
					break;
				case 'a':
					System.out.println("A vogal escolhida foi a letra ''A''!");
					break;
				case 'b':
					System.out.println("A vogal escolhida foi a letra ''B''!");
					break;
				case 'c':
					System.out.println("A vogal escolhida foi a letra ''C''!");
					break;
				case 'd':
					System.out.println("A vogal escolhida foi a letra ''D''!");
					break;
				case 'e':
					System.out.println("A vogal escolhida foi a letra ''E''!");
					break;
				default:
					System.out.println("Não é uma vogal!");
					break;
				}
	}

}
