package lista02poo;

import java.util.Scanner;

public class Retangulo {

	private double altura, largura;
	private static double area;
	private static double perimetro;
	
	public static void pass(double alt, double larg) {
		calculoArea(alt,larg);
		culoPerimetro(alt,larg);
	}
	private static void calculoArea( double x, double y) {
		area = (x * y);
	}
	private static void culoPerimetro( double x, double y) {
		perimetro = ((x * 2)+(y*2));
	}
	public static double getArea() {
		return area;
	}
	public static void setArea(double area) {
		Retangulo.area = area;
	}
	public static double getPerimetro() {
		return perimetro;
	}
	public static void setPerimetro(double perimetro) {
		Retangulo.perimetro = perimetro;
	}

}
