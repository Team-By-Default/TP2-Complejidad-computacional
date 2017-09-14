package complejidadComputacional;

public class BinomioDeNewton {

	private int a;
	private int b;
	//La forma del binomio es: (ax+b)^k
	
	public BinomioDeNewton(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	//Metodos a desarrollar
	//idk
	
	private static int combinatoria(int n,int p) {
		if(p<n)
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
}
