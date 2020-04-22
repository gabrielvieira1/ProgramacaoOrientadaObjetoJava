package lista03poo;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class ex1pessoa {
	
	public String nome;
	public int idade;

/*	public void info(String x, int y) {
		Scanner scan = new Scanner(System.in);
		PessoaTeste pessoa[] = new PessoaTeste[2];
		
	/*	for (int i = 0; i < pessoa.length; i++) {
			pessoa[i] = new PessoaTeste();
			pessoa[i].nome = JOptionPane.showInputDialog("Digite o nome:");
			pessoa[i].idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			
			}
	}*/
	public void info(String x, int y) {
		
		System.out.println(nome(x));
		System.out.println(idade(y));
		System.out.println(grandeString(x, y));
		
		
	}
	StringBuffer grandeString (String x, int y){
		//String a = toString();
		StringBuffer grandeString = new StringBuffer(x);
	//	grandeString.append(" ");
		grandeString.append(" " + Integer.toString(y));
		return grandeString;
	}
	
	String nome (String nome) {
		return nome;
	}
	int idade (int idade) {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
