package lista01poo;
import javax.swing.JOptionPane;
public class ex7 {

			public static void main(String[] args) {
				int arrayA[] = new int[20];
				int arrayB[] = new int[20];
				int arrayC[] = new int[20];
				int cont = 0;
				for (int i = 0; i < arrayA.length; i++) {

					arrayA[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Insira o valor da " + (i + 1) + "º posição do array A:"));
					arrayB[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Insira o valor da " + (i + 1) + "º posição do array B:"));
				}
				for (int i = 0; i < arrayA.length; i++) {
					for (int j = 0; j < arrayA.length; j++) {
						if (arrayA[i] == arrayB[i]) {
							arrayC[cont] = arrayA[i];
							cont++;
						}

					}
				}
				for (int i = 0; i < cont; i++) {
					System.out.println(arrayC[i] + " ");
				}

	}

}
