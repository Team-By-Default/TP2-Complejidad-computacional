package complejidadComputacional;

public class BinomioDeNewton {

	private int a;
	private int b;
	//La forma del binomio es: (ax+b)^n
	
	public BinomioDeNewton(int a,int b) {
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
	
	public static void main(String args[]) {
		BinomioDeNewton bin=new BinomioDeNewton(2,3);
		System.out.println(bin.obtenerCoeficienteDelTerminoK(5, 5));
		System.out.println(bin.obtenerCoeficienteDelTerminoK(4, 5));
		System.out.println(bin.obtenerCoeficienteDelTerminoK(3, 5));
		System.out.println(bin.obtenerCoeficienteDelTerminoK(2, 5));
		System.out.println(bin.obtenerCoeficienteDelTerminoK(1, 5));
		System.out.println(bin.obtenerCoeficienteDelTerminoK(0, 5));
		double lista[]=bin.obtenerCoeficientesK(5);
		System.out.print(lista[0]);
		for(int i=1;i<=5;i++)
			System.out.print("+"+lista[i]+"X^"+i);
	}
}
