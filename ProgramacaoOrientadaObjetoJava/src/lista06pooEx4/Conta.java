package lista06pooEx4;
public class Conta {
    private double saldo;

    public Conta(double saldo){
        setSaldo(saldo);
    }
    
    public void depositar(double valor){
        saldo += valor;  
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
