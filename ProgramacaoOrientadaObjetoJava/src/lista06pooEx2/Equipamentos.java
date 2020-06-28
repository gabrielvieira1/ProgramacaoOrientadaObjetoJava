package lista06pooEx2;

public class Equipamentos {
    private boolean ligado;
    
    public Equipamentos(){
        
    }
    
    public Equipamentos(boolean ligado){
        setLigado(ligado);
    }
    
    public void liga(){
        setLigado(true);
    }
    
    public void desliga(){
        setLigado(false);
    } 

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
}
