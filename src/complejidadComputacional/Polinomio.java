package complejidadComputacional;

public class Polinomio {
	
	private int grado ;
	private double [] coeficientes;
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la	posicion n contiene al termino independiente.
	
	public Polinomio(int g, double vec[]) { 
		this.grado=g;
		this.coeficientes=new double[this.grado+1];
		for(int i=0;i<=this.grado;i++) {
			this.coeficientes[i]=vec[i];
		}
	}
	
	/* Antes de empezar a trabajar con una función, anotemos en un comentario al lado quién la va a hacer
	double evaluarMSucesivas (double x) {} //Listo
	double evaluarRecursiva (double x) {} //Listo
	double evaluarRecursivaPar (double x) {} //Vale
	double evaluarProgDinamica (double x) {} //Dani
	double evaluarMejorada (double x) {} //Dani
	double evaluarPow (double x) {} //Lara
	double evaluarHorner (double x) {} //Lara
	*/
	
	double evaluarMSucesivas(double x) {
		double pow=1,total=0;
		for(int i=this.grado;i>=0;i--) {
			total=total+pow*this.coeficientes[i];
			pow=pow*x;
		}
		return total;	
	}
	
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
	
	public static void main(String[] args) {
		//Variables de testeo
		double vec[]={3,1,-2,0,-10,4};
		Polinomio poli=new Polinomio(5, vec);
		//probamos la funcion evaluarMSucesivas
		System.out.println(poli.evaluarMSucesivas(0));
		System.out.println(poli.evaluarMSucesivas(1));
		System.out.println(poli.evaluarMSucesivas(2));
		System.out.println(poli.evaluarMSucesivas(3));
		System.out.println(poli.evaluarMSucesivas(4));
		//funcionan!
		
		//Evaluando recursiva
		double coef[]= {1,2,3};
		Polinomio poly = new Polinomio(2,coef);
		System.out.println(poly.evaluarRecursiva(1));
		System.out.println(poly.evaluarRecursiva(-1));
	}

}
