package lista03poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PessoaTeste {

	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		ex1pessoa pessoa  = new ex1pessoa();
		pessoa.info("Gabriel", 23 );
		//pessoa.grandeString("Gabriel", 23);
		pessoa.getIdade();
		pessoa.getNome();
		
	/*	for (int i = 0; i < pessoa.length; i++) {
			pessoa[i] = new ex1pessoa();
			pessoa[i].nome = JOptionPane.showInputDialog("Digite o nome:");
			pessoa[i].idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			
			}*/
		
	}
}
