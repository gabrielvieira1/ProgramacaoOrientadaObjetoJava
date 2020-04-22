package lista06pooEx1;
public class UsaPessoa {
    
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("José", "Manoel");
        Funcionario p2 = new Funcionario("Leandro", "Charles",0 ,2000.00);
        Professor p3 = new Professor("Rita", "Cássia", 0, 500.00); 
        System.out.println("p1: " + p1.getNomeCompleto());
        System.out.println("p2: " + p2.getNomeCompleto());
        System.out.println("p3: " + p2.getNomeCompleto());
        System.out.println(p2.getNome() + " 1ª parcela do salário: " + p2.getSalarioPrimeiraParcela());
        System.out.println(p2.getNome() + " 2ª parcela do salário: " + p2.getSalarioSegundaParcela());
        System.out.println(p3.getNome() + " 1ª parcela do salário: " + p3.getSalarioPrimeiraParcela());
        System.out.println(p3.getNome() + " 2ª parcela do salário: " + p3.getSalarioSegundaParcela());
    }
}

