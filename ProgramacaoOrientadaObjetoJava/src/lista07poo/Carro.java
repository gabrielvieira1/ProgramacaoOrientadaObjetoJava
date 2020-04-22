package lista07poo;

public class Carro extends Veiculo{
    private double combustivel;
    
    public void trocarOleo(){
        System.out.println("O veículo " + getTipo() + ", com chassi " + getChassi() + " trocou o óleo. ");
    }
    
    public Carro(){
        
    }
    
    public Carro(String chassi, Double velocidadeMaxima, double combustivel){
        super(chassi, "carro", velocidadeMaxima);
        setCombustivel(combustivel);
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    
    
}
