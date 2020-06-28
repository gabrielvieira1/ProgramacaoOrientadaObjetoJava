package lista07poo;

public class VeiculoTeste {
    public static void main (String[]args){
        Bicicleta um = new Bicicleta("de burracha", 250.0, 5);
        Bicicleta dois = new Bicicleta("de cera", 200.0, 4);
        Bicicleta tres = new Bicicleta("de fazdeconta", 150.0, 3);
        Carro quatro = new Carro("de madeira", 30.0, 80);
        Carro cinco = new Carro("de plastico", 60.0, 10);
        
        um.ajustar();
        dois.ajustar();
        tres.ajustar();
        quatro.ajustar();
        cinco.ajustar();
        
        um.limpar();
        dois.limpar();
        tres.limpar();
        quatro.limpar();
        cinco.limpar();
        
        um.aumentarMarcha(2);
        dois.aumentarMarcha(3);
        tres.aumentarMarcha(4);
        
        quatro.incrementarVeloc(10);
        cinco.incrementarVeloc(20);
        
        quatro.trocarOleo();
        cinco.trocarOleo();
        
        System.out.println("Quantidade de veículos: " + cinco.getCont());
    }
}
