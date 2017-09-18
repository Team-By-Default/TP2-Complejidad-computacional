package complejidadComputacional;

import matematica.Combinatoria;
import matematica.Potencia;

public class BinomioDeNewton {

	private double a;
	private double b;
	//La forma del binomio es: (ax+b)^n
	private Combinatoria comb; //Para progra dinamica top down
	
	public BinomioDeNewton(double a, double b) {
		this.a=a;
		this.b=b;
		this.comb = new Combinatoria();
	}
		
	//Simple
	public double obtenerCoeficienteDelTerminoK(int k, int n) {
		return Combinatoria.ale(n, k)*Math.pow(a, k)*Math.pow(b, n-k);
	}
	
	public double[] obtenerCoeficientesK(int n) {
		double aux[]=new double[n+1];
		for(int i=n;i>=0;i--)
			aux[i]=Combinatoria.ale(n, n-i)*Math.pow(a, n-i)*Math.pow(b, i);
		return aux;
	}
	
	//Recursiva
	public double obtenerCoeficienteDelTerminoKRecursiva(int k, int n) {//Me sangr� el alma escribiendo esto
		return Combinatoria.recursiva(n, k)*Potencia.recursiva(a, k)*Potencia.recursiva(b, n-k); 
	}
	
	public double[] obtenerCoeficientesKRecursiva(int n) {//Si antes me sangr� el alma, ahora sangra cada celula de mi cuerpo
		double aux[]=new double[n+1];
		for(int i=n;i>=0;i--)
			aux[i]=this.obtenerCoeficienteDelTerminoKRecursiva(n-i,n);
		return aux;
	}
	
	//Programaci�n din�mica
	public double[] todosCoefDinamica(int n) {
		double vec[] = new double[n+1];
		for(int i=n;i>=0;i--)
			vec[i] = coefKDinamica(n-i, n);
		return vec;
	}
	
	public double coefKDinamica(int k, int n) {
		return Combinatoria.dinamicaBU(n, k) * Potencia.dinamicaBU(this.a, k) * Potencia.dinamicaBU(this.b, n-k);
	}
	
	//Programaci�n din�mica top down
	public double[] todosCoefDinamicaTD(int n) {
		double vec[] = new double[n+1];
		for(int i=n;i>=0;i--)
			vec[i] = coefKDinamicaTD(n-i, n);
		return vec;
	}
		
	public double coefKDinamicaTD(int k, int n) {
		return comb.dinamicaTD(n, k) * Potencia.dinamicaBU(this.a, k) * Potencia.dinamicaBU(this.b, n-k);
	}
	
	//Calculo
	public double calculoBinomioSimple(int n, double x) {
		return Potencia.simple(this.a*x+this.b,n);
	}
		
	public double calculoPorPolinomioSimple(int n,double x) {
		double vec[];
		vec=this.obtenerCoeficientesK(n);
		Polinomio aux=new Polinomio(n,vec);
		return aux.evaluarProgDinamica(x);
	}
		
	public double calculoPorPolinomioRecursiva(int n,double x) {
		double vec[];
		vec=this.obtenerCoeficientesKRecursiva(n);
		Polinomio aux=new Polinomio(n,vec);
		return aux.evaluarProgDinamica(x);
	}
	
	public double calculoPorPolinomioDinamica(int n,double x) {
		double vec[];
		vec=this.todosCoefDinamica(n);
		Polinomio aux=new Polinomio(n,vec);
		return aux.evaluarProgDinamica(x);
	}
	
	public double calculoPorPolinomioDinamicaTD(int n,double x) {
		double vec[];
		vec=this.todosCoefDinamicaTD(n);
		Polinomio aux=new Polinomio(n,vec);
		return aux.evaluarProgDinamica(x);
	}
	
	//Main de pruebas
	public static void main(String args[]) {
		System.out.println("Ale\tDin\tDinTD\tRecur");
		BinomioDeNewton bin=new BinomioDeNewton(2,3);
		for(int i=5; i>=0; i--)
			System.out.println(bin.obtenerCoeficienteDelTerminoK(i, 5) + "\t" + bin.coefKDinamica(i, 5)+"\t" + bin.coefKDinamicaTD(i, 5)+"\t" + bin.obtenerCoeficienteDelTerminoKRecursiva(i, 5));
		
		double lista[]=bin.obtenerCoeficientesK(5);
		System.out.print("Ale: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		
		lista=bin.todosCoefDinamica(5);
		System.out.print("\nDin: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		
		lista=bin.todosCoefDinamicaTD(5);
		System.out.print("\nDTD: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		
		lista=bin.obtenerCoeficientesKRecursiva(5);
		System.out.print("\nRec: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		
		System.out.println();
		System.out.println("Calculo:");
		System.out.println("Simple: "+bin.calculoBinomioSimple(5, 10));
		System.out.println("PolinomioSimple: "+bin.calculoPorPolinomioSimple(5, 10));
		System.out.println("PolinomioRecursiva: "+bin.calculoPorPolinomioRecursiva(5, 10));
		System.out.println("PolinomioDinamica: "+bin.calculoPorPolinomioDinamica(5, 10));
		System.out.println("PolinomioDinamicaTD: "+bin.calculoPorPolinomioDinamicaTD(5, 10));
	}
}
