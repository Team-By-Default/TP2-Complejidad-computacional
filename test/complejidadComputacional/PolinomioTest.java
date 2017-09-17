package complejidadComputacional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolinomioTest {

	long start;
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
		System.out.print("Recursiva Simple: ");
		
	}
	
	@Test
	public void pruebaComplejoRecursiva() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarRecursiva(i);
		System.out.print("Recursiva Complejo: ");
	}
	
	@Test
	public void pruebaLargoRecursiva() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarRecursiva(i);
		System.out.print("Recursiva Largo: ");
	}
	//End Recursiva
	
	//RecursivaPar
	@Test
	public void pruebaSimpleRecursivaPar() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarRecursivaPar(i);
		}
		System.out.print("RecursivaPar Simple: ");
	}
	
	@Test
	public void pruebaComplejoRecursivaPar() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarRecursivaPar(i);
		System.out.print("RecursivaPar Complejo: ");
	}
	
	@Test
	public void pruebaLargoRecursivaPar() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarRecursivaPar(i);
		System.out.print("RecursivaPar Largo: ");
	}
	//End RecursivaPar
	
	//MSucesivas
	@Test
	public void pruebaSimpleMSucesivas() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarMSucesivas(i);
		}
		System.out.print("MSucesivas Simple: ");
	}
	
	@Test
	public void pruebaComplejoMSucesivas() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarMSucesivas(i);
		System.out.print("MSucesivas Complejo: ");
	}
	
	@Test
	public void pruebaLargoMSucesivas() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarMSucesivas(i);
		System.out.print("MSucesivas Largo: ");
	}
	//End MSucesivas
	
	//ProgDinamica
	@Test
	public void pruebaSimpleProgDinamica() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarProgDinamica(i);
		}
		System.out.print("ProgDinamica Simple: ");
	}
	
	@Test
	public void pruebaComplejoProgDinamica() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarProgDinamica(i);
		System.out.print("ProgDinamica Complejo: ");
	}
	
	@Test
	public void pruebaLargoProgDinamica() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarProgDinamica(i);
		System.out.print("ProgDinamica Largo: ");
	}
	//End ProgDinamica
	
	//Mejorada
	@Test
	public void pruebaSimpleMejorada() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarMejorada(i);
		}
		System.out.print("Mejorada Simple: ");
	}
	
	@Test
	public void pruebaComplejoMejorada() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarMejorada(i);
		System.out.print("Mejorada Complejo: ");
	}
	
	@Test
	public void pruebaLargoMejorada() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarMejorada(i);
		System.out.print("Mejorada Largo: ");
	}
	//End Mejorada
	
	//Pow
	@Test
	public void pruebaSimplePow() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarPow(i);
		}
		System.out.print("Pow Simple: ");
	}
	
	@Test
	public void pruebaComplejoPow() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarPow(i);
		System.out.print("Pow Complejo: ");
	}
	
	@Test
	public void pruebaLargoPow() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarPow(i);
		System.out.print("Pow Largo: ");
	}
	//End Pow
	
	//Horner
	@Test
	public void pruebaSimpleHorner() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarHorner(i);
		}
		System.out.print("Horner Simple: ");
	}
	
	@Test
	public void pruebaComplejoHorner() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarHorner(i);
		System.out.print("Horner Complejo: ");
	}
	
	@Test
	public void pruebaLargoHorner() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarHorner(i);
		System.out.print("Horner Largo: ");
	}
	//End Horner
	
	@After
	public void end() {
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	    
	    
}
