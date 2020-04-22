package lista07poo;

public class Bicicleta extends Veiculo{
    private int nrMarchas;
    
    public void aumentarMarcha(int aumento){
        int total = (int) (this.nrMarchas/getVelocidadeMaxima()*100);
        setNrMarchas(this.nrMarchas + aumento);
        incrementarVeloc(total);
    }
    
    public Bicicleta(){
        
    }
    
    public Bicicleta(String chassi, Double velocidadeMaxima, int nrMarchas){
        super(chassi, "bicicleta", velocidadeMaxima);
        setNrMarchas(nrMarchas);
    }

    public int getNrMarchas() {
        return nrMarchas;
    }

    public void setNrMarchas(int nrMarchas) {
        this.nrMarchas = nrMarchas;
    }
    
    
}
