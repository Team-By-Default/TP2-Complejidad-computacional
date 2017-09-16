package complejidadComputacional;

public class BinomioDeNewton {

	private double a;
	private double b;
	//La forma del binomio es: (ax+b)^n
	
	public BinomioDeNewton(double a, double b) {
		this.a=a;
		this.b=b;
	}
	
	//Metodos a desarrollar
	//ObtenerCoeficienteDelTerminoK(int k, int n) (Alexis) Esta es la funcion, que usa una combinatoria, que a su vez usa un factorial el cual no es recursivo
	//obtenerCoeficientesK(int n) (Alexis) Esta es la funcion, que usa una combinatoria, que a su vez usa un factorial el cual no es recursivo
	
	public double obtenerCoeficienteDelTerminoK(int k, int n) {
		return BinomioDeNewton.combinatoria(n, k)*Math.pow(a, k)*Math.pow(b, n-k);
	}
	
	public double[] obtenerCoeficientesK(int n) {
		double aux[]=new double[n+1];
		for(int i=0;i<=n;i++)
			aux[i]=BinomioDeNewton.combinatoria(n, i)*Math.pow(a, i)*Math.pow(b, n-i);
		return aux;
	}
	
	private static int combinatoria(int n,int p) {
		if(n<p)
			throw new CombinatoriaException("p menor a n");
		return (BinomioDeNewton.factorial(n))/(BinomioDeNewton.factorial(p)*BinomioDeNewton.factorial(n-p));
	}
	
	private static int factorial(int n) {
		if(n<0)
			throw new FactorialException("Factorial negativo");
		if(n==0)
			return 1;
		int fac=1;
		for(int i=1;i<=n;i++)
			fac=fac*i;
		return fac;
	}
	
	//Programación dinámica
	public double[] todosCoefDinamica(int n) {
		double vec[] = new double[n+1];
		for (int i=0; i<=n; i++)
			vec[i] = coefKDinamica(i, n);
		return vec;
	}
	
	public double coefKDinamica(int k, int n) {
		return combinatoriaDinamica(n, k) * potenciaDinamica(this.a, k) * potenciaDinamica(this.b, n-k);
	}
	
	private int combinatoriaDinamica(int n, int p) {
		if(n<p)
			throw new CombinatoriaException("p menor a n");
		return factorialDinamico(n) / (factorialDinamico(p) * factorialDinamico(n-p));
	}
	
	private int factorialDinamico(int n) {
		int[] vec = new int[n+1];
		vec[0]=1;
		for(int i=1; i<=n; i++)
			vec[i] = i*vec[i-1];
		return vec[n];
	}
	
	private double potenciaDinamica(double base, int indice) {
		double[] vec = new double[indice+1];
		vec[0]=1;
		for(int i=1; i<= indice; i++)
			vec[i] = base * vec[i-1];
		return vec[indice];
	}
	
	public static void main(String args[]) {
		System.out.println("Ale\tDin");
		BinomioDeNewton bin=new BinomioDeNewton(2,3);
		for(int i=5; i>=0; i--)
			System.out.println(bin.obtenerCoeficienteDelTerminoK(i, 5) + "\t" + bin.coefKDinamica(i, 5));
		
		double lista[]=bin.obtenerCoeficientesK(5);
		System.out.print("Ale: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
		lista=bin.todosCoefDinamica(5);
		System.out.print("\nDin: " + lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print(" + "+lista[i]+"X^"+i);
	}
}
