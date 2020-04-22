/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista04poo;

import javax.swing.JOptionPane;

public class Vendas {
	double valor;
	int escolha;
	static int desconto = 30;
	
	public static void main(String[] args) {
		Vendas venda = new Vendas();
		
		venda.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda:"));
		venda.escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para obter desconto:"));
		obterTaxaDeDesconto(venda.escolha, venda.valor);
		System.out.println("O valor com desconto é : " + obterTaxaDeDesconto(venda.escolha, venda.valor));
		
		
	}
	public static double obterTaxaDeDesconto (int desc, double descVenda) {
		double venda = descVenda;
		double vendaComDesconto = 0;
		if (desc == 1) {
			vendaComDesconto = (venda-((descVenda/100)*10));
		} else {
			vendaComDesconto = (venda-((descVenda/100)*desconto));
		}
		
		return vendaComDesconto;
	}
	
}