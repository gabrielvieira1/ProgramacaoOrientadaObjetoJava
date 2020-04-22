package lista01poo;
import java.util.Scanner;
public class ex13 {
			private Scanner entrada = new Scanner(System.in);
			
			public void pegaNumero(){
				
				System.out.print("Digite a seguir o número a ser invertido: ");
				int numero = entrada.nextInt();
				
				inverte(numero);
				
			}
			
			
			private void inverte(int numero){
				
			int i = 0;

				 while (numero > 0) {
				 i *= 10;
				 i += (numero % 10);
				 numero /= 10;
				 } 
				 
				 System.out.printf("O número invertido é: %d.\n", i);

	}

}
