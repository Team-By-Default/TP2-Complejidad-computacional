package matematica;

public class Combinatoria {
	private Factorial fac;
	public Combinatoria() {
		fac = new Factorial();
	}
	
	public static int ale(int n,int p) {
		if(n<p)
			throw new CombinatoriaException("p menor a n");
		return (Factorial.ale(n))/(Factorial.ale(p)*Factorial.ale(n-p));
	}
	
	public static int dinamicaBU(int n, int p) {
		if(n<p)
			throw new CombinatoriaException("p menor a n");
		return Factorial.dinamicoBU(n) / (Factorial.dinamicoBU(p) * Factorial.dinamicoBU(n-p));
	}

	public int dinamicaTD(int n, int p) {
		if(n<p)
			throw new CombinatoriaException("p menor a n");
		return this.fac.dinamicoTD(n) / (this.fac.dinamicoTD(p) * this.fac.dinamicoTD(n-p));
	}
}
