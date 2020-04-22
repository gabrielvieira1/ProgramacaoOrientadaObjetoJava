package lista01poo;
import java.util.Scanner;

public class ex5 {

			private static Scanner scan;

			public static void main(String[] args) {
				// falta ajeitar maior e menor e implementar a letra h.

				scan = new Scanner(System.in);

				// alimentando o array;
				int array[] = new int[10];

				for (int i = 0; i < array.length; i++) {
					System.out.println("Insira o " + (i + 1) + "º número inteiro: ");
					array[i] = scan.nextInt();
				}

				// determinando maior e menor
				int menor = array[0], maior = array[0];

				for (int i = 1; i < array.length; i++) {
					if ((array[i] > maior) && (array[i] % 2 == 0)) {
						maior = array[i];
					} else if ((array[i] <= menor) && (array[i] % 2 != 0)) {
						menor = array[i];
					}
				}

				// somatório dos elementos
				int soma = 0;

				for (int i = 0; i < array.length; i++) {
					soma += array[i];
				}
				// média de todos os elementos

				int media = 0;
				media = soma / 10;

				// resultados

				System.out.println("-> O maior elemento par: " + maior);
				System.out.println("-> O menor elemento impar: " + menor);
				System.out.println("-> O somatório de todos os elementos: " + soma);
				System.out.println("-> A média de todos os elementos: " + media);
				System.out.println("-> A posição 3: " + array[3]);
				System.out.println("-> A posição 7: " + array[7]);
				System.out.println("-> Soma das posições 4 e 8: " + (array[8] + array[4]));
				if (array[5] % array[9] == 0) {
					System.out.println(array[5] + " é múltiplo de " + array[9]);
				} else { 
					System.out.println(array[5] + " não é multiplo de " + array[9]);
				}
				System.out.println("Array inverso: ");
				for (int i = array.length - 1; i >= 0; i--) {
					System.out.println(array[i]);
				}
	}

}
