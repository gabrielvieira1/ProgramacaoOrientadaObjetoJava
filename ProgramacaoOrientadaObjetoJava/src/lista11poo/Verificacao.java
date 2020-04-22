package lista11poo;

public class Verificacao {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		Balao balao = new Balao();
		Bicicleta bike = new Bicicleta();
		Carro carro = new Carro();
		
		aviao.abastecer(10);
		aviao.curvar(5);
		aviao.descer(15);
		aviao.estaParado();
		aviao.ligarMotor();
		aviao.subir(20);
	}

}
