package lista01poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String conta = null;
		int y= 0, z = 0, x =0, somaInversa=0, a =0 ;
		int multPosicao;
		// recebe os digitos da conta
			System.out.println("Digite o numero da conta sem o digito:");
			conta = scan.nextLine();
			// transforma para inteiro
			y = Integer.parseInt(conta);
	//		y = Integer.parseUnsignedInt(conta);
			a = y;
			
			// transforma de string para inteiro e preenche o array com os numeros digitados. 
		/*	for(int i = 1; i <= arrayConta.length; i++) {
				x = Character.getNumericValue(arrayConta[i-1]);
				multPosicao = x * arrayConta[i-1];
				System.out.println(x);
				System.out.println(arrayConta[i-1]);
				System.out.println(multPosicao);
			}*/
			// coloca na ordem inversa
			while (y > 0) {
				 z *= 10;
				 z += (y % 10);
				 y /= 10;
				 }
			somaInversa = a + z;
			
		char[] arrayConta = conta.toCharArray();
		//int[] arrayContaBanco = new int[arrayConta.length+1];
		int[] multiplicacao = new int[arrayConta.length+1];
		int[] soma = new int[arrayConta.length+1];
		convert(arrayConta, multiplicacao);
		mult1(multiplicacao);
	//	System.out.println(num(soma));
		System.out.println(somaInversa);
		System.out.println(z);
	}
	public static void convert(char[] arrayConta, int[] multiplicacao) {
		int x = 0, v = 0;
		for(int i = 1; i <= arrayConta.length; i++) {
			x = Character.getNumericValue(arrayConta[i-1]);
	//		arrayContaBanco[i] = Integer.parseInt(arrayConta[i-1].);
		//	System.out.println(x);
			multiplicacao[i]=x;
		}
	/*	for (int i = 0; i < multiplicacao.length; i++) {
			char c=(char) multiplicacao[i];
			int num=(int)c;
			//int g=multiplicacao[i-1];
			
			multiplicacao[i] = num * i;
			System.out.println(multiplicacao[i]);
		//	System.out.println(num);
			
		}*/
	}private static void mult1(int[] multiplicacao) {
		int x = 0, v = 0;
		for (int i = 0; i < multiplicacao.length; i++) {
			char c=(char) multiplicacao[i];
			int num=(int)c;
			//int g=multiplicacao[i-1];
			
			multiplicacao[i] = num * i;
			System.out.println(multiplicacao[i]);
		//	System.out.println(num);
			
		}
		
	}
	private static int num(int[] multiplicacao, int x) {
		int result = 0, x1=0; 
		for(int i = 1; i < multiplicacao.length; i++) {
			result += multiplicacao[i];
			x1 = result;
			
		}
		//System.out.println(x);
		return x1;
	}
	
	
}
/*	private static void mult1(int[] multiplicacao) {
		int g = 0;
		for (int i = 1; i < multiplicacao.length; i++) {
			g = multiplicacao[i] * i;
			System.out.println(g);
			
		}
		
	}
/*	private static int mult11(int[] soma, int[] multiplicacao) {
		int a = 0;
		for (int i = 1; i < multiplicacao.length; i++) {
			multiplicacao[i] = multiplicacao[i] * i;
			System.out.println(multiplicacao[i]);
		}
		return a;
	}*/
/*	private static int num(int[] multiplicacao) {
		int result = 0; 
		for(int i = 1; i < multiplicacao.length; i++) {
			result += multiplicacao[i];
			System.out.println(multiplicacao[i]);
		}
		return result;
	}	
	
}/*
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String conta = null;
	int y= 0, z = 0, x =0, somaInversa=0, a =0 ;
	int multPosicao;
	// recebe os digitos da conta
		System.out.println("Digite o numero da conta sem o digito:");
		conta = scan.nextLine();
		// transforma para inteiro
		y = Integer.parseInt(conta);
		y = Integer.parseUnsignedInt(conta);
		a = y;
		char[] arrayConta = conta.toCharArray();
		// transforma de string para inteiro e preenche o array com os numeros digitados. 
		for(int i = 1; i <= arrayConta.length; i++) {
			x = Character.getNumericValue(arrayConta[i-1]);
			multPosicao = x * arrayConta[i-1];
			System.out.println(x);
			System.out.println(arrayConta[i-1]);
			System.out.println(multPosicao);
		}
		// coloca na ordem inversa
		while (y > 0) {
			 z *= 10;
			 z += (y % 10);
			 y /= 10;
			 }
		somaInversa = a + z;
		System.out.println(somaInversa);
		System.out.println(z);
//	int[] arrayContaBanco = new int[arrayConta.length+1];
	int[] multiplicacao = new int[arrayConta.length+1];
	int[] soma = new int[arrayConta.length+1];
//	convert(arrayConta, arrayContaBanco);
//	mult(arrayContaBanco, multiplicacao);
	System.out.println(num(soma));
}public static void invert(){
}
private static int num(int[] multiplicacao) {
	int result = 0; 
	for(int i = 1; i < multiplicacao.length; i++) {
		result += multiplicacao[i];
		System.out.println(multiplicacao[i]);
	}
	return result;
}	
public static void mult(int[] soma, int[] multiplicacao) {
	for (int i = 1; i < multiplicacao.length; i++) {
		multiplicacao[i] = multiplicacao[i] * i;
		System.out.println(multiplicacao[i]);
	}
}
public static void convert(char[] arrayConta, int[] arrayContaBanco) {
	int x = 0;
	for(int i = 1; i <= arrayConta.length; i++) {
		x = Character.getNumericValue(arrayConta[i-1]);
//		arrayContaBanco[i] = Integer.parseInt(arrayConta[i-1].);
		System.out.println(x);
		arrayContaBanco[i]=x;
		mult(arrayContaBanco[i]);
	}
	
}*/
/*Soma de todos os algarismos
public static void main(String[] args) {
    System.out.println("Informe um número: ");
    int num = new Scanner(System.in).nextInt();
    int soma = 0;
    //123 -> dividirmos por 10, o resultado será 12, e sobra = 3
    //(123 / 10) = 12 -> (123 % 10) = 3
    //(12  / 10) = 1  -> (12  % 10) = 2
    //(1   / 10) = 0  -> (1   % 10) = 1

    while(num>0) {
        // 1) obter o módulo do número digitado
      //int modulo = num % 10;
        // 2) incrementar o módulo a nossa variavel soma
        soma += (num % 10);
        // 3) dividir o número por 10 e atribuirmos a nossa varial 'num'
        num /= 10;//num = num / 10;
       // System.out.println("O valor de soma é: " + soma);
    }
    System.out.println();
    System.out.println("A soma dos algarismos é: " + soma);

}*/
	
