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

	@Test
	public void pruebaSimpleFactorial() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			simple.evaluarRecursiva(i);
		}
		System.out.print("Recursiva Simple: ");
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	@Test
	public void pruebaComplejoFactorial() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			complejo.evaluarRecursiva(i);
		System.out.print("Recursiva Complejo: ");
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	@Test
	public void pruebaLargoFactorial() {
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
			largo.evaluarRecursiva(i);
		System.out.print("Recursiva Largo: ");
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	@After
	public void end() {
		
	}
	    
	    
}
