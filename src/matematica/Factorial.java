package matematica;

import java.util.ArrayList;

public class Factorial {
	ArrayList<Integer> guardados;
	
	public Factorial() {
		this.guardados = new ArrayList<Integer>();
	}
	
	public static int ale(int n) {
		if(n<0)
			throw new FactorialException("Factorial negativo");
		if(n==0)
			return 1;
		int fac=1;
		for(int i=1;i<=n;i++)
			fac=fac*i;
		return fac;
	}
	
	public static int dinamicoBU(int n) {
		int[] vec = new int[n+1];
		vec[0]=1;
		for(int i=1; i<=n; i++)
			vec[i] = i*vec[i-1];
		return vec[n];
	}
	
	//Falta codificar
	public int dinamicoTD(int n) {
		if(n == 0)
			return 1;
		if(this.guardados.get(n) != 0)
			return this.guardados.get(n).intValue();
		this.guardados.add(n, dinamicoTD(n-1));
		return this.guardados.get(n).intValue();
	}
}
