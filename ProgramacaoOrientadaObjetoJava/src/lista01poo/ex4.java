package lista01poo;

public class ex4 {

			public static void main(String[] args) {

				metodoWhile();
				metodoDoWhile();
				metodoFor();
			}

			private static void metodoFor() {
				System.out.println("Método For: ");

				for (int i = 1; i <= 10; i++) {
					for (int j = 1; j <= 10; j++) {
						System.out.println(i + "x" + j + "=" + (i * j));
					}
				}
			}

			private static void metodoDoWhile() {
				System.out.println("Médoto Do-While: ");
				int cont = 1;
				int x = 1;
				int z = 1;

				do {
					System.out.println(x + "x" + z + "=" + (x * z));
					if (z == 10) {
						x++;
						z = 1;
					} else {
						z++;
					}

				} while ((cont <= 10) && ((x <= 10) && (z <= 10)));

			}

			public static void metodoWhile() {
				System.out.println("Método While: ");

				int cont = 1;
				int x = 1;
				int z = 1;
				while (cont <= 10) {
					while ((x <= 10) && (z <= 10)) {
						System.out.println(x + "x" + z + "=" + (x * z));
						if (z == 10) {
							x++;
							z = 1;
						} else {
							z++;
						}
						cont++;
					}

				}
			}

	}
