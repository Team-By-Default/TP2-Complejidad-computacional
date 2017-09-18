package matematica;

import java.util.ArrayList;

public class Factorial {
	private ArrayList<Integer> guardados;
	
	public Factorial() {
		this.guardados = new ArrayList<Integer>();
		this.guardados.add(0, Integer.valueOf(1));
	}
	
	public static int recursiva(int n) {
		if(n==0||n==1)
			return 1;
		return Factorial.recursiva(n-1)*n;
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
	
	public int dinamicoTD(int n) {
		if(n == 0)
			return 1;
		if(this.guardados.size() > n && this.guardados.get(n) != null && this.guardados.get(n).intValue() != 0 )
			return this.guardados.get(n).intValue();
		int aux = n * dinamicoTD(n-1);
		this.guardados.add(n, new Integer(aux));
		return this.guardados.get(n).intValue();
	}
	
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		System.out.println(fac.dinamicoTD(3));
		System.out.println(fac.dinamicoTD(4));
	}
}
