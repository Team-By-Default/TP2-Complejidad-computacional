package complejidadComputacional;

public class Polinomio {
	
	private int grado ;
	private double [ ] coeficientes;
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la	posicion n contiene al termino independiente.
	
	public Polinomio(int g, double[] coef) {
		this.grado=g;
		this.coeficientes = new double [this.grado+1];
		for(int i=0; i<=this.grado; i++)
			this.coeficientes[i] = coef[i];
	}
	
	/* Antes de empezar a trabajar con una función, anotemos en un comentario al lado quién la va a hacer
	double evaluarMSucesivas (double x) {} */
	
	public double evaluarRecursiva (double x) {
		double result=0;
		int n = this.grado;
		for(int i=0; i<=this.grado; i++) {
			result += this.coeficientes[i] * potenciaRecursiva(x,n);
			n--;
		}
		return result;
	}
	
	private double potenciaRecursiva(double x, int n) {
		if(n<0)
			throw new potenciaException("Potencia negativa");
		if(n==0)
			return 1;
		if(n==1)
			return x;
		return x*potenciaRecursiva(x, n-1);
	}
	
	/*double evaluarRecursivaPar (double x) {
		
	}*/
	
	/*
	 * double evaluarProgDinamica (double x) {}
	double evaluarMejorada (double x) {}
	double evaluarPow (double x) {}
	double evaluarHorner (double x) {}
	*/
	
	public static void main(String[] args) {
		double coef[]= {1,2,3};
		Polinomio poly = new Polinomio(2,coef);
		System.out.println(poly.evaluarRecursiva(1));
		System.out.println(poly.evaluarRecursiva(-1));
	}

}
