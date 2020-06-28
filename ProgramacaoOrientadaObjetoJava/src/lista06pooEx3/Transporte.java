package lista06pooEx3;
public class Transporte {
    
    private boolean ligado;
    
    private int velocidade;

    public Transporte(){
        
    }
    
    public Transporte(boolean ligado, int velocidade){
        setLigado(ligado);
        setVelocidade(velocidade);
    }
    
    public void liga(){
        setLigado(true);
    }
    
    public void desliga(){
        setLigado(false);
        setVelocidade(0);
    }
    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if((velocidade < 0)||(velocidade > 200)){
            System.out.println("Velocidade não pode ser negativa, ou maior que 200km/h!!!");
        }else
        this.velocidade = velocidade;
    }
    
}
