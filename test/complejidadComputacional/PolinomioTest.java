package complejidadComputacional;

import org.junit.Before;
import org.junit.Test;

public class PolinomioTest {

	long start;
	long end;
	Polinomio simple;
	Polinomio complejo;
	Polinomio largo;
	double vecSimple[]= {1,2,3};
	double vecComplejo[]= {80,25,4,0,32,1,5,0,1,4,4.5};
	double vecLargo[]= {10,20,30,40,50,60,70,80,90,0,10,20,3,40,5,60,7,800,9,0,1000,2,30,04,50000,600,7,800,9,0,1,20,03,4,50,6,70,8,9,0,1000};
	
	@Before
	public void start() {
		simple=new Polinomio(2,vecSimple);
		complejo=new Polinomio(10,vecComplejo);
		largo=new Polinomio(40,vecLargo);
	}
	//Recursiva
	@Test
	public void pruebaSimpleRecursiva() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarRecursiva(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Recursiva Simple: " + (end-start) + "ms");
		
	}
	
	@Test
	public void pruebaComplejoRecursiva() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarRecursiva(i);
		end = System.currentTimeMillis();
		System.out.println("Recursiva Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoRecursiva() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarRecursiva(i);
		end = System.currentTimeMillis();
		System.out.println("Recursiva Largo: " + (end-start) + "ms");
	}
	//End Recursiva
	
	//RecursivaPar
	@Test
	public void pruebaSimpleRecursivaPar() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarRecursivaPar(i);
		}
		end = System.currentTimeMillis();
		System.out.println("RecursivaPar Simple: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaComplejoRecursivaPar() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarRecursivaPar(i);
		end = System.currentTimeMillis();
		System.out.println("RecursivaPar Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoRecursivaPar() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarRecursivaPar(i);
		end = System.currentTimeMillis();
		System.out.println("RecursivaPar Largo: " + (end-start) + "ms");
	}
	//End RecursivaPar
	
	//MSucesivas
	@Test
	public void pruebaSimpleMSucesivas() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarMSucesivas(i);
		}
		end = System.currentTimeMillis();
		System.out.println("MSucesivas Simple: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaComplejoMSucesivas() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarMSucesivas(i);
		end = System.currentTimeMillis();
		System.out.println("MSucesivas Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoMSucesivas() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarMSucesivas(i);
		end = System.currentTimeMillis();
		System.out.println("MSucesivas Largo: " + (end-start) + "ms");
	}
	//End MSucesivas
	
	//ProgDinamica
	@Test
	public void pruebaSimpleProgDinamica() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarProgDinamica(i);
		}
		end = System.currentTimeMillis();
		System.out.println("PrograDinamica Simple: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaComplejoProgDinamica() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarProgDinamica(i);
		end = System.currentTimeMillis();
		System.out.println("PrograDinamica Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoProgDinamica() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarProgDinamica(i);
		end = System.currentTimeMillis();
		System.out.println("PrograDinamica Largo: " + (end-start) + "ms");
	}
	//End ProgDinamica
	
	//Mejorada
	@Test
	public void pruebaSimpleMejorada() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarMejorada(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Mejorada Simple: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaComplejoMejorada() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarMejorada(i);
		end = System.currentTimeMillis();
		System.out.println("Mejorada Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoMejorada() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarMejorada(i);
		end = System.currentTimeMillis();
		System.out.println("Mejorada Largo: " + (end-start) + "ms");
	}
	//End Mejorada
	
	//Pow
	@Test
	public void pruebaSimplePow() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarPow(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Pow Simple: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaComplejoPow() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarPow(i);
		end = System.currentTimeMillis();
		System.out.println("Pow Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoPow() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarPow(i);
		end = System.currentTimeMillis();
		System.out.println("Pow Largo: " + (end-start) + "ms");
	}
	//End Pow
	
	//Horner
	@Test
	public void pruebaSimpleHorner() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarHorner(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Horner Simple: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaComplejoHorner() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarHorner(i);
		end = System.currentTimeMillis();
		System.out.println("Horner Complejo: " + (end-start) + "ms");
	}
	
	@Test
	public void pruebaLargoHorner() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarHorner(i);
		end = System.currentTimeMillis();
		System.out.println("Horner Largo: " + (end-start) + "ms");
	}
	//End Horner 
	    
}
