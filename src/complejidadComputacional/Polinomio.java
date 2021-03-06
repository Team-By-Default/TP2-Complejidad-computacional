package complejidadComputacional;

import matematica.Potencia;

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
	
	public double evaluarMSucesivas(double x) {
		double pow,total=0;
		for(int i=this.grado;i>=0;i--) {
			pow=1;
			for(int j=0;j<this.grado-i;j++)
				pow=pow*x;//Asqueroso
			total=total+pow*this.coeficientes[i];
			//pow=pow*x;
		}
		return total;	
	}
	
	public double evaluarRecursiva (double x) {
		double result=0;
		int n = this.grado;
		for(int i=0; i<=this.grado; i++) {
			result += this.coeficientes[i] * Potencia.recursiva(x,n);
			n--;
		}
		return result;
	}
	
	public double evaluarRecursivaPar (double x) {
		double result=0;
		int n = this.grado;
		for(int i=0; i<=this.grado; i++) {
			result += this.coeficientes[i] * Potencia.recursivaPar(x,n);
			n--;
		}
		return result;
	}
	
	public double evaluarProgDinamica (double x ) {
		double pow=1,total=0;
		for(int i=this.grado;i>=0;i--) {
			total=total+pow*this.coeficientes[i];
			pow=pow*x;
		}
		return total;	
	}
	
	double evaluarMejorada (double x ) {
		double result=0;
        for (int i = 0; i<=this.grado; i++)
            result = this.coeficientes[i]+(x*result);
        return result;
	}
	
	public double evaluarPow (double x) {
		double result=0;
		for(int i=0; i<=this.grado; i++) {
			result += this.coeficientes[i] * Math.pow(x,this.grado-i);
		}
		return result;
	}
	
    public double evaluarHorner (double x){ 
        double result=0;
        for (int i = 0; i<=this.grado; i++)
            result = this.coeficientes[i]+(x*result);
        return result;
    }
    	
	public static void main(String[] args) {
		
		//Casos de prueba
		System.out.println("Resul\tSuces\tRecu\tRecuPar\tDinam\tMejor\tPow\tHorner");
		
		//Grado 0
		double vec1[]={10};
		Polinomio poli = new Polinomio(0, vec1);
		double x = 0;
		System.out.println("10\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		
		//Grado 1
		double vec2[] = {1, 5};
		poli = new Polinomio(1,vec2);
		
		System.out.println("5\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		x=2;
		System.out.println("7\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		x=-2;
		System.out.println("3\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		x=1.5;
		System.out.println("6.5\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		
		//Prueba de velocidad
		int intentos = 1000000;
		x=10;
        long begTime = System.currentTimeMillis();
        for (int i = 0; i < intentos; ++i) 
        	poli.evaluarHorner(x);
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time for %10d tries: %d ms\n", intentos, (endTime-begTime));
		
        //Grado 3
		double vec3[] = {3,0,-1,5.5};
		poli = new Polinomio(3,vec3);
		x=0;
		System.out.println("5.5\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		x=2;
		System.out.println("27.5\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		x=-2;
		System.out.println("-16.5\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		x=1.5;
		System.out.println("14.125\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		
		//Grado de 16 bits
		double[] vec4 = new double[32768];
		vec4[0] = 1;
		vec4[32767] = 1;
		poli = new Polinomio(32767,vec4);
		x=1;
		System.out.println("2\t" + poli.evaluarMSucesivas(x) + "\tDEAD\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		
		double vec5[]= {32767,-32770,1.79769313486231570E+308 };
		poli = new Polinomio(2,vec5);
		System.out.println("1.79769313486231570E+308\t" + poli.evaluarMSucesivas(x) + "\t" + poli.evaluarRecursiva(x) + "\t" + poli.evaluarRecursivaPar(x) + "\t" + poli.evaluarProgDinamica(x) + "\t" + poli.evaluarMejorada(x) + "\t" + poli.evaluarPow(x) + "\t" + poli.evaluarHorner(x));
		
	}

}
