/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista05poo;
import java.util.Scanner;
public class CompraIngresso {
	public static void impressao(int opcaoIng, String normal, Ingresso obj, IngressoVip obj1, CamaroteSuperior obj2, IngressoNormal obj4, CamaroteInferior obj3) {
		int escolha = opcaoIng;
		String ingNormal = normal;
		if (ingNormal.equalsIgnoreCase("Arquibancada")) {
			System.out.println("O valor do ing normal é: " + obj4.getIngNormal() + "O local é: " + obj4.getLocalArqNormal());
		} else if (escolha == 1) {
			System.out.println("O valor do ing Vip é: " + obj1.getValorAdd() + "O local é: " + obj2.getLocalSuperior());
		} else {
			System.out.println("O valor do ing Vip é: " + obj1.getValorAdd() + "O local é: " + obj3.getLocalInferior());
		}
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String localNormal = null, localvip = null;
	int ingNormalVip;
	int escolhaSupInf = 0;
	System.out.println("Digite 1 para ingresso normal ou 2 para Vip");
	ingNormalVip = scan.nextInt();
	switch (ingNormalVip) {
	case 1:
		localNormal = "Arquibancada";
		IngressoNormal preco = new IngressoNormal(100, "");
		IngressoNormal locNormal = new IngressoNormal(100, localNormal);
		preco.setIngNormal(100);
		locNormal.setLocalArqNormal(localNormal);
		impressao(0, localNormal,  preco, null, null, null, null);
		break;
	case 2:
		System.out.println("Digite 1 para camarote Superior ou 2 para Inferior");
		escolhaSupInf = scan.nextInt();
		if (escolhaSupInf == 1) {
			localvip = "Camarote Superior";
			CamaroteSuperior camSup = new CamaroteSuperior(localvip);
			Ingresso precoSup = new Ingresso(100, "");
			IngressoVip locVip  = new IngressoVip(100, localvip);
			camSup.setLocalSuperior(localvip);
			precoSup.setValor(100);
			locVip.setLocVip(localvip);
			impressao(escolhaSupInf, localvip, precoSup, locVip, camSup, null, null);
		} else {
			localvip = "Camarote Inferior";
			CamaroteInferior camInf = new CamaroteInferior(localvip);
			Ingresso precoInf = new Ingresso(100, "");
			IngressoVip locVip  = new IngressoVip(100, localvip);
			camInf.setLocalInferior(localvip);
			precoInf.setValor(100);
			locVip.setLocVip(localvip);
			impressao(escolhaSupInf, localvip, precoInf, locVip, null, null, camInf);
		}
	default:
		break;
	}
	}
}