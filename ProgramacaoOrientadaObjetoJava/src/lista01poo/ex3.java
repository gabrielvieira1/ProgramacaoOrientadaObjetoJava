package lista01poo;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		guarda();
	}
	public static void guarda() {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero a ser invertido: ");
		numero = scan.nextInt();
		num(numero);
	}
	public static int num( int numeroInverso) {
		int a= 0;
		while (numeroInverso > 0) {
			 a *= 10;
			 a += (numeroInverso % 10);
			 numeroInverso /= 10;
			 } 
			 System.out.printf("O número invertido é: %d.\n", a);
			 return a;
	}
}
