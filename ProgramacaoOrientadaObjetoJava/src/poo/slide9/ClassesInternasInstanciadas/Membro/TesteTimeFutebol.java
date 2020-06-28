package poo.slide9.ClassesInternasInstanciadas.Membro;


public class TesteTimeFutebol {

	public static void main(String[] args) {
		TimeFutebol selecao = new TimeFutebol();
		selecao.setTecnico("Tite");
		
		TimeFutebol.Jogador jogador;
		
		jogador = selecao.new Jogador("Neymar");
		selecao.addJogador(10, jogador);
		
		jogador = selecao.new Jogador("Willian");
		selecao.addJogador(9, jogador);
		
		jogador = selecao.new Jogador("Ciro");
		selecao.addJogador(1, jogador);
		
		jogador = selecao.new Jogador("Felipe");
		selecao.addJogador(2, jogador);
		
		jogador = selecao.new Jogador("Alice");
		selecao.addJogador(3, jogador);
		
		jogador = selecao.new Jogador("Tony");
		selecao.addJogador(4, jogador);
		
		jogador = selecao.new Jogador("Melyssa");
		selecao.addJogador(5, jogador);
		
		jogador = selecao.new Jogador("Gabriel");
		selecao.addJogador(0, jogador);
		
		jogador = selecao.new Jogador("Chico");
		selecao.addJogador(6, jogador);
		
		jogador = selecao.new Jogador("Guga");
		selecao.addJogador(7, jogador);
		
		jogador = selecao.new Jogador("Everton");
		selecao.addJogador(8, jogador);
		
		selecao.imprimir();
		System.out.println("Tecnico: " + selecao.getTecnico());
		// e por ai vai...
		System.out.println("");
	}
}
