package lista06pooEx4;

public class Poupanca extends Conta{
    private int diaRendimentos;
    
    public Poupanca(double saldo, int diaRendimentos){
        super(saldo);
        setDiaRendimentos(diaRendimentos);
    }

    public int getDiaRendimentos() {
        return diaRendimentos;
    }

    public void setDiaRendimentos(int diaRendimentos) {
        this.diaRendimentos = diaRendimentos;
    }
    
}
