package lista01poo;


public class ex6 {

	public static void main(String[] args) {

				// Matriz 3x3 e multiplicar o resultado numa nova matriz.

				int mA[][] = { { 5, 1, 4 }, { 7, 3, 5 }, { 9, 3, 1 } };
				int mB[][] = { { 6, 3, 7 }, { 9, 7, 2 }, { 8, 2, 9 } };
				int mR[][] = new int[3][3];

				int control = 0;

				for (int i = 0; i < mA.length; i++) {
					for (int j = 0; j < mB.length; j++) {
						control = control + (mA[i][j] * mB[i][j]);
						mR[i][j] = control;
						control = 0;
					}
				}

				for (int i = 0; i < mR.length; i++) {
					for (int j = 0; j < mR.length; j++) {
						System.out.println(mR[i][j]);
					}
				}
	}
	
}
