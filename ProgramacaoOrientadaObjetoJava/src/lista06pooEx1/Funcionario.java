package lista06pooEx1;

public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public Funcionario(){
        
    }
    
    public Funcionario(String nome, String sobrenome, int matricula, double salario){
        super(nome, sobrenome);
        setMatricula(matricula);
        setSalario(salario);
    }
    
    public double getSalarioPrimeiraParcela(){
        return (salario/100*60);
    }
    
    public double getSalarioSegundaParcela(){
        return (salario/100*40);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
