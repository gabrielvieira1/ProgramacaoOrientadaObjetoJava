package lista01poo;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int par = Integer.MAX_VALUE, impar = Integer.MAX_VALUE;
		double soma=0 ;
		double media = 0;
		int somaValores = 0;
		// exibir todos os numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = scan.nextInt();
			// maior numero par
			if (numeros[i]%2==0) {
				par = numeros[i];
			} else { //menor numero impar
				impar = numeros[i];
			}
		}for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			// somatorio
			soma += numeros[i];
			//media
			media = soma/10;
			//soma valores
			somaValores = numeros[4] + numeros[8];
		}
		//maior e menor numero par e impar
		System.out.println("o maior numero par �: " + par);
		System.out.println("o maior numeor impar � :" + impar);
		// somatorio
		System.out.println("A soma de todos os numeros �: " + soma);
		//media
		System.out.println("A media de todos os numeros �: " + media);
		//soma valores
		System.out.println("o valor do soma dos valores da posi��o 4 e 8 �: " + somaValores);
		//elemento posi��o 3 e 7
		System.out.println("O elemento da posi��o 3 �: " + numeros[3]);
		System.out.println("O elemento da posi��o 7 �: " + numeros[7]);
	}
}
