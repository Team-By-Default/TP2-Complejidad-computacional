package complejidadComputacional;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ElapsedTimeTest {

	private Polinomio poly2, poly5, poly10, poly20, poly30, poly40;
	private long tiemposPolys[][]; //Cada fila es un caso, cada columna es un método
	//Orden métodos: 0-MSucesivas, 1-Recursiva, 2-RecursivaPar, 3-ProgDinamica, 4-Mejorada, 5-Pow, 6-Horner.
	
	public ElapsedTimeTest() {
		double vec2[]= {1,2,3};
		double vec5[] = {1,2,3,4,5,6};
		double vec10[]= {80,25,4,0,32,1,5,0,1,4,4.5};
		double vec20[] = {10,20,30,40,50,60,70,80,90,0,10,20,3,40,5,60,7,800,9,0,21};
		double vec30[] = {10,20,3,40,5,60,7,800,9,0,1000,2,30,04,50000,600,7,800,9,0,1,20,03,4,50,6,70,8,9,0,1000};
		double vec40[]= {10,20,30,40,50,60,70,80,90,0,10,20,3,40,5,60,7,800,9,0,1000,2,30,04,50000,600,7,800,9,0,1,20,03,4,50,6,70,8,9,0,1000};
		poly2=new Polinomio(2,vec2);
		poly5 = new Polinomio(5,vec5);
		poly10=new Polinomio(10,vec10);
		poly20 = new Polinomio(20,vec20);
		poly30 = new Polinomio(30, vec30);
		poly40=new Polinomio(40,vec40);
		tiemposPolys = new long[6][7];
	}
	
	public void medirPolys() {
		medirPoly(this.poly2, 0);
		medirPoly(this.poly5, 1);
		medirPoly(this.poly10, 2);
		medirPoly(this.poly20, 3);
		medirPoly(this.poly30, 4);
		medirPoly(this.poly40, 5);
	}
	
	private void medirPoly(Polinomio poly, int fila) {
		long start, end;
		int i;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarMSucesivas(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][0] = end-start;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarRecursiva(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][1] = end-start;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarRecursivaPar(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][2] = end-start;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarProgDinamica(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][3] = end-start;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarMejorada(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][4] = end-start;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarPow(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][5] = end-start;
		
		start= System.nanoTime();
		for(i=0;i<100;i++)
			poly.evaluarHorner(i);
		end = System.nanoTime();
		this.tiemposPolys[fila][6] = end-start;
	}
	
	public void grabarPolys(String path) throws IOException {
		PrintWriter arch = new PrintWriter(new FileWriter(path));
		arch.println("MSucesivas\tRecursiva\tRecursivaPar\tPrograDinamica\tMejorada\tPow\tHorner");
		for(int i=0; i<6; i++) {
			for(int j=0; j<7; j++)
				arch.print(this.tiemposPolys[i][j] + "\t");
			arch.println();
		}
		arch.close();
	}
	
	public static void main(String[] args) throws IOException {
		ElapsedTimeTest test = new ElapsedTimeTest();
		test.medirPolys();
		test.grabarPolys("polySpeed.out");
	}

}
