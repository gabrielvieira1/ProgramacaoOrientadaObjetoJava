package lista01poo;


public class ex9 {
			public static double mdc(double dividendo, double divisor) {

				if ((dividendo % divisor == 0)) {
					return divisor;
				} else {
					return mdc(divisor, (dividendo % divisor));
				}
			}

			public static void main(String[] args) {

				double resposta = mdc(2, 4);
				String resultado = String.format("%.0f", resposta);
				System.out.println("MDC: " + resultado);

	}

}
