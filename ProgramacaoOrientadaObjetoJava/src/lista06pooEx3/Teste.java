package lista06pooEx3;

public class Teste {
    public static void main(String[] args){
        Carro fusca = new Carro(true, 250, 999999);
        System.out.println("Ta vivo? " + fusca.isLigado());
        System.out.println("Ta correndo muito? " + fusca.getVelocidade());
        System.out.println("Já correu quanto? " + fusca.getQuilometragem());
    }
}
