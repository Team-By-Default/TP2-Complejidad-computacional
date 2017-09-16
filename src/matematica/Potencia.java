package matematica;

public abstract class Potencia {
	
	public static double recursiva(double x, int n) {
		if(n<0)
			throw new PotenciaException("Potencia negativa");
		if(n==0)
			return 1;
		return x*recursiva(x, n-1);
	}
	
	public static double recursivaPar(double x, int n) {
		if(n<0)
			throw new PotenciaException("Potencia negativa");
		if(n==0)
			return 1;
		if(n%2 == 0)
			return recursivaPar(x*x, n/2);
		return x*recursivaPar(x, n-1);
	}
	
	public static double dinamicaBU(double base, int indice) {
		double[] vec = new double[indice+1];
		vec[0]=1;
		for(int i=1; i<= indice; i++)
			vec[i] = base * vec[i-1];
		return vec[indice];
	}
}
