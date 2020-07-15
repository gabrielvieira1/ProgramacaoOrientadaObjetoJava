package lista16poo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Principal<T> {
	static Scanner scan = new Scanner(System.in);
	static RegistroPessoas regPessoas = new RegistroPessoas();
	static Arquivo<RegistroPessoas> arquivo = new Arquivo<RegistroPessoas>(new RegistroPessoas());
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int opcao = 0;
		try {
			do {
				menu();
				System.out.println("Total de assinaturas: " + regPessoas.getTotal().size());
				System.out.println("1 para continuar a assinatura:");
				System.out.println("2 para parar a assinatura:");
				
				opcao = scan.nextInt();
			} while (opcao == 1);
			
		} catch (NullPointerException e) {
			System.out.println("Nao tem nada");
		}
			
	}
	public static void menu() throws IOException, ClassNotFoundException {
		int escolha;
		System.out.println("1 Assinar livro: ");
		System.out.println("2 Listar Assinaturas");
		System.out.println("3 Salvar arquivo:");
		System.out.println("4 Obter Assinaturas:");
		escolha = scan.nextInt();
		if (escolha == 1) {
			adicionarAssinatura();
		} else if (escolha == 2 ) {
			listarAssinaturas();
		} else if (escolha == 3) {
			arquivo.gravarLista(regPessoas.listaMap);
		} else if (escolha == 4){
			System.out.println(arquivo.retornaLista());
		}
	}
	public static void adicionarAssinatura() {
		System.out.println("Digite o seu nome Completo: ");
		String nome = scan.next();
		regPessoas.assinar(nome);
	}
	public static void listarAssinaturas() {
		regPessoas.assinaturas();
	}

}
