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
	double evaluarRecursivaPar (double x) {} //Listo
	double evaluarProgDinamica (double x) {} //Dani
	double evaluarMejorada (double x) {} //Dani
	double evaluarPow (double x) {} //Listo
	double evaluarHorner (double x) {} //Listo
	*/
	
	public double evaluarMSucesivas(double x) {
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
			throw new PotenciaException("Potencia negativa");
		if(n==0)
			return 1;
		return x*potenciaRecursiva(x, n-1);
	}
	
	public double evaluarRecursivaPar (double x) {
		double result=0;
		int n = this.grado;
		for(int i=0; i<=this.grado; i++) {
			result += this.coeficientes[i] * potenciaRecursivaPar(x,n);
			n--;
		}
		return result;
	}
	
	public double potenciaRecursivaPar(double x, int n) {
		if(n<0)
			throw new PotenciaException("Potencia negativa");
		if(n==0)
			return 1;
		if(n%2 == 0)
			return potenciaRecursivaPar(x*x, n/2);
		return x*potenciaRecursivaPar(x, n-1);
	}
	
	public double evaluarPow (double x) {
		double result=0;
		for(int i=0; i<=this.grado; i++) {
			result += this.coeficientes[i] * Math.pow(x,this.grado-i);
		}
		return result;
	}
	
    public double evaluarHorner (double x){ 
        double result = 0;
        for (int i = this.grado; i >= 0; i--)
            result = this.coeficientes[i] + (x * result);
        return result;
    }
	
	public static void main(String[] args) {
		//Variables de testeo
		double vec[]={3,1,-2,0,-10,4};
		Polinomio poli=new Polinomio(5, vec);
		//probamos la funcion evaluarMSucesivas
		System.out.println("4 vs " + poli.evaluarRecursivaPar(0));
		System.out.println("-4 vs " + poli.evaluarRecursivaPar(1));
		System.out.println("80 vs " + poli.evaluarRecursivaPar(2));
		System.out.println("730 vs " + poli.evaluarRecursivaPar(3));
		System.out.println("3164 vs " + poli.evaluarRecursivaPar(4));
		System.out.println("14 vs " + poli.evaluarRecursivaPar(-1));
		//funcionan!
	}

}
