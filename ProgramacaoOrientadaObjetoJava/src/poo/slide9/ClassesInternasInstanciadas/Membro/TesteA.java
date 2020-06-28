package poo.slide9.ClassesInternasInstanciadas.Membro;

public class TesteA {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.imprime();

	}

}
