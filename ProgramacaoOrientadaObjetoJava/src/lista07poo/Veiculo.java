package lista07poo;

public class Veiculo {
    private String chassi;
    private String tipo;
    private double velocidadeMaxima;
    private static int cont;
    
    public void limpar(){
        System.out.println("O veículo " + getTipo() + ", com chassi " + getChassi() + " está sendo limpo.");
    }
    
    public void ajustar(){
        System.out.println("O veículo " + getTipo() + ", com chassi " + getChassi() + " está sendo ajustado.");
    }
    
    public void incrementarVeloc(int aumento){
        System.out.println("O veículo " + getTipo() + ", com " + getTipo() + " agora tem " + (getVelocidadeMaxima() + aumento) + "km/h de velocidade");
    }
    
    public Veiculo(){
        
    }
    
    public Veiculo(String chassi, String tipo, Double velocidadeMaxima){
        setChassi(chassi);
        setTipo(tipo);
        setVelocidadeMaxima(velocidadeMaxima);
        cont++;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static int getCont() {
        return cont;
    }

        
}
