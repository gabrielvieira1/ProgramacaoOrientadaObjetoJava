package lista01poo;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String nome[] = new String[10];
		int codProduto[] = new int[10];
		int desconto[] = new int[10];
		double preco[] = new double[10];
		String e = null, f = null;
		int a = 0, b = 0, c = 0, d = 0;
		double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, media= 0, soma =0;
		for (int i = 0; i < preco.length; i++) { // alimenta
			System.out.println("Digite o nome do produto:");
			nome[i] = scan.next();
			System.out.println("Digite o codigo do produto:");
			codProduto[i] = scan.nextInt();
			System.out.println("Digite o preço do produto:");
			preco[i] = scan.nextDouble();
			System.out.println("Digite o desconto do produto:");
			desconto[i] = scan.nextInt();
			if (preco[i] < menor) {
				menor = preco[i];
				b = i;
			} if (preco[i] > maior) {
				maior = preco[i];
				a = i;
			}
			e = nome[(int)a];
			f = nome[(int)b];
			c = desconto[(int)a];
			d = desconto[(int)b];
			soma += preco[i];
			media = soma/2;
		} 
		System.out.println("======================================================================");
		System.out.println("|     Nome      |     Codigo     |      Preço    |    Descont        |");
		System.out.println("| "+nome[0]+" | "+codProduto[0]+" | " +df.format(preco[0])+" | " +desconto[0]+" |");
		System.out.println("| "+nome[1]+" | "+codProduto[1]+" | " +df.format(preco[1])+" | " +desconto[1]+" |");
		System.out.println("| "+nome[2]+" | "+codProduto[2]+" | " +df.format(preco[2])+" | " +desconto[2]+" |");
		System.out.println("| "+nome[3]+" | "+codProduto[3]+" | " +df.format(preco[3])+" | " +desconto[3]+" |");
		System.out.println("| "+nome[4]+" | "+codProduto[4]+" | " +df.format(preco[4])+" | " +desconto[4]+" |");
		System.out.println("| "+nome[5]+" | "+codProduto[5]+" | " +df.format(preco[5])+" | " +desconto[5]+" |");
		System.out.println("| "+nome[6]+" | "+codProduto[6]+" | " +df.format(preco[6])+" | " +desconto[6]+" |");
		System.out.println("| "+nome[7]+" | "+codProduto[7]+" | " +df.format(preco[7])+" | " +desconto[7]+" |");
		System.out.println("| "+nome[8]+" | "+codProduto[8]+" | " +df.format(preco[8])+" | " +desconto[8]+" |");
		System.out.println("| "+nome[9]+" | "+codProduto[9]+" | " +df.format(preco[9])+" | " +desconto[9]+" |");
		System.out.println("======================================================================");
		System.out.println("Produto: "+ f +" Menor Preço: " + df.format(menor) + " Desconto " + d);
		System.out.println("Produto "+ e + " Maior Preço: " + df.format(maior) + " Desconto " + c);
		System.out.println("A media é: " + df.format(media));
	}

}
