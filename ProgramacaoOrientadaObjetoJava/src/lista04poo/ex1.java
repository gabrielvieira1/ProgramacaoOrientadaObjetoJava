package lista04poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex1 {
	String nome, setor;
	int idade; 
	static int matricula = 90466316;
	double salario;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ex1 funcionario[] = new ex1[2];
		//String matricula = "1";
		int matriculaInt = 0;
		for (int i = 0; i < funcionario.length; i++) {
			funcionario[i] = new ex1();
			funcionario[i].nome = JOptionPane.showInputDialog("Digite o nome do funcionario:");
			funcionario[i].setor = JOptionPane.showInputDialog("Digite o setor:");
			funcionario[i].idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			funcionario[i].salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));
			
		}	
		//int matricula = 90466316;
		for (int i = 0; i < funcionario.length; i++) {
			
			
		//	funcionario[i].matricula = matriculaFunc(Integer.toString(matricular));
			System.out.println("Nome: " + funcionario[i].nome + " Setor: " + funcionario[i].setor + " Idade: " + funcionario[i].idade + 
					" Salario: " + funcionario[i].salario + " Matricula " + matricula);
			matricula++;
			
		//	System.out.println("O preço é: " + calAluguel(user[i].valor, user[i].dias));
			//System.out.println("A multa é: " + ((calAluguel(user[i].valor, user[i].dias)-user[i].valor)));
		}

	}
	/*public static String matriculaFunc (String mat) {
		String matricula = "90466316";
		String digito = "1";
		String prefixoString = matricula.substring(0, 6);
		String sufixoString = matricula.substring(matricula.length() - 1);
		
		if (sufixoString.equals("9")) {
			sufixoString = "X";		
			} else if (sufixoString.equals("x")) {
				sufixoString = "0";
				prefixoString += 1;
			} else {
				int sufixoInt = Integer.parseInt(sufixoString);
				sufixoString = String.valueOf(sufixoInt + 1);
			}
		String novaMatricula = prefixoString + digito + sufixoString;
		return novaMatricula;
	}*/

}
