package lista01poo;
import java.util.Scanner;
public class ex10 {
			public static void main(String[] args) {
				Scanner scan= new Scanner (System.in);
				int[][] matriz = new int [10][10];
				
				for (int i=0; i< matriz.length; i++) {
					for (int j=0; j<matriz.length; j++) {
				System.out.println("Insira os valores da matriz: ");
		        matriz [i][j] = scan.nextInt();
					}
				} for (int i=0; i< matriz.length; i++) {
					for (int j=0; j<matriz.length; j++) {
						if (i != j) {
							System.out.println(matriz [i][j]);
						}
					}
					}


	}

}
