package complejidadComputacional;

public class Polinomio {
	
	private int grado ;
	private double [ ] coeficientes;
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la	posicion n contiene al termino independiente.
	
	public Polinomio(int g, double vec[]) { 
		this.grado=g;
		for(int i=0;i<=this.grado;i++) {
			this.coeficientes[i]=vec[i];
		}
	}
	
	/* Antes de empezar a trabajar con una función, anotemos en un comentario al lado quién la va a hacer
	double evaluarMSucesivas (double x) {} //Ale
	double evaluarRecursiva (double x) {}
	double evaluarRecursivaPar (double x) {} //Vale
	double evaluarProgDinamica (double x) {}
	double evaluarMejorada (double x) {}
	double evaluarPow (double x) {}
	double evaluarHorner (double x) {}
	*/
	
	double evaluarMSucesivas(double x) {
		double pow=1,total=0;
		for(int i=this.grado;i>=0;i--) {
			total=total+pow*this.coeficientes[i];
			pow=pow*x;
		}
		return total;	
	}
	
	public static void main(String[] args) {

	}

}
