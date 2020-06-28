package lista06pooEx3;

public class Carro extends Transporte{
    
    private int quilometragem;

   public Carro(){
        
    }
    
    public Carro(boolean ligado, int velocidade, int quilometragem){
        super(ligado, velocidade);
        setQuilometragem(quilometragem);
    }
    
    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        if((quilometragem < 0)||(quilometragem >999999)){
            System.out.println("Quilometragem inválida !!!");
        }else
        this.quilometragem = quilometragem;
    }
    
           

    
}
