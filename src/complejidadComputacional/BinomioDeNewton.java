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
	
	//Metodos a desarrollar
	//ObtenerCoeficienteDelTerminoK(int k, int n) (Alexis) Esta es la funcion, que usa una combinatoria, que a su vez usa un factorial el cual no es recursivo
	//obtenerCoeficientesK(int n) (Alexis) Esta es la funcion, que usa una combinatoria, que a su vez usa un factorial el cual no es recursivo
	
	public double obtenerCoeficienteDelTerminoK(int k, int n) {
		return Combinatoria.ale(n, k)*Math.pow(a, k)*Math.pow(b, n-k);
	}
	
	public double[] obtenerCoeficientesK(int n) {
		double aux[]=new double[n+1];
		for(int i=0;i<=n;i++)
			aux[i]=Combinatoria.ale(n, i)*Math.pow(a, i)*Math.pow(b, n-i);
		return aux;
	}
	
	public double obtenerCoeficienteDelTerminoKRecursiva(int k, int n) {//Me sangró el alma escribiendo esto
		return Combinatoria.recursiva(n, k)*Potencia.recursiva(a, k)*Potencia.recursiva(b, n-k); 
	}
	
	public double[] obtenerCoeficientesKRecursiva(int n) {//Si antes me sangró el alma, ahora sangra cada celula de mi cuerpo
		double aux[]=new double[n+1];
		for(int i=0;i<=n;i++)
			aux[i]=this.obtenerCoeficienteDelTerminoKRecursiva(i,n);
		return aux;
	}
	
	//Programación dinámica
	public double[] todosCoefDinamica(int n) {
		double vec[] = new double[n+1];
		for (int i=0; i<=n; i++)
			vec[i] = coefKDinamica(i, n);
		return vec;
	}
	
	public double coefKDinamica(int k, int n) {
		return Combinatoria.dinamicaBU(n, k) * Potencia.dinamicaBU(this.a, k) * Potencia.dinamicaBU(this.b, n-k);
	}
	
	//Programación dinámica top down
		public double[] todosCoefDinamicaTD(int n) {
			double vec[] = new double[n+1];
			for (int i=0; i<=n; i++)
				vec[i] = coefKDinamicaTD(i, n);
			return vec;
		}
		
		public double coefKDinamicaTD(int k, int n) {
			return comb.dinamicaTD(n, k) * Potencia.dinamicaBU(this.a, k) * Potencia.dinamicaBU(this.b, n-k);
		}
	
	public static void main(String args[]) {
		System.out.println("Ale\tDin\tRecur");
		BinomioDeNewton bin=new BinomioDeNewton(2,3);
		for(int i=5; i>=0; i--)
			System.out.println(bin.obtenerCoeficienteDelTerminoK(i, 5) + "\t" + bin.coefKDinamica(i, 5) + "\t" + bin.obtenerCoeficienteDelTerminoKRecursiva(i, 5));
		
		double lista[]=bin.obtenerCoeficientesK(5);
		System.out.print("Ale: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		lista=bin.todosCoefDinamica(5);
		System.out.print("\nDin: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		lista=bin.obtenerCoeficientesKRecursiva(5);
		System.out.print("\nRec: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		
		//Test de velocidad
		int n = 10;
		int intentos= 10000;
        long begTime = System.currentTimeMillis();
        for(int j=0;j<intentos;j++){
        	for (int i = 0; i < n; ++i) 
        		bin.coefKDinamica(i, n);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("\nTiempo total para %10d intentos con n= %d: %d ms\n", intentos,n, (endTime-begTime));
	}
}
