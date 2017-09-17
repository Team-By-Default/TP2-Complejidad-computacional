package complejidadComputacional;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

public class BinomioDeNewtonTest {

	
	int intentos=1;
	long inicio;
	BinomioDeNewton bin;
	int nBajo=1,
		nMedio=15,
		nAlto=33;
	
	@Before
	public void SetUp(){
		bin=new BinomioDeNewton(2,3);
	}
	
	
	//CoeficienteDelTerminoK
	@Test
	public void pruebaSimpleCoefDelTerminoK() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<intentos;j++){
        	for (int i = 0; i < nBajo; ++i) 
        		bin.obtenerCoeficienteDelTerminoK(i, nBajo);
        }
		System.out.print("Coeficiente de K Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCoefDelTerminoK() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<intentos;j++){
        	for (int i = 0; i < nMedio; ++i) 
        		bin.obtenerCoeficienteDelTerminoK(i, nMedio);
        }
		System.out.print("Coeficiente de K Medio: ");
	}
	
	@Test
	public void pruebaLargoCoefDelTerminoK() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<intentos;j++){
        	for (int i = 0; i < nAlto; ++i) 
        		bin.obtenerCoeficienteDelTerminoK(i, nAlto);
        }
		System.out.print("Coeficiente de K Largo: ");
	}
	
	
	//CoeficienteDelTerminoKRecursiva
	@Test
	public void pruebaSimpleCoefDelTerminoKRec() {
		inicio = System.currentTimeMillis();    
		for(int j=0;j<intentos;j++){
        	for (int i = 0; i < nBajo; ++i) 
	       		bin.obtenerCoeficienteDelTerminoKRecursiva(i, nBajo);
        }
		System.out.print("Coeficiente de K Simple REC: ");		
	}
	
	@Test
	public void pruebaMedioCoefDelTerminoKRec() {
		inicio = System.currentTimeMillis();
	       for(int j=0;j<intentos;j++){
	       	for (int i = 0; i < nMedio; ++i) 
	       		bin.obtenerCoeficienteDelTerminoKRecursiva(i, nMedio);
	       }
		System.out.print("Coeficiente de K Medio REC: ");
	}
	
	@Test
	public void pruebaLargoCoefDelTerminoKRec() {
		inicio = System.currentTimeMillis();
	       for(int j=0;j<intentos;j++){
	       	for (int i = 0; i < nAlto; ++i) 
	       		bin.obtenerCoeficienteDelTerminoKRecursiva(i, nAlto);
	       }
		System.out.print("Coeficiente de K Largo REC: ");
	}
	
	
	//CoeficienteDelTerminoKDinamica
	@Test
	public void pruebaSimpleCoefDelTerminoKDin() {
		inicio = System.currentTimeMillis();	        
		for(int j=0;j<intentos;j++){
        	for (int i = 0; i < nBajo; ++i) 
        		bin.coefKDinamica(i, nBajo);
        }
		System.out.print("Coeficiente de K Simple DIN: ");		
	}
	
	@Test
	public void pruebaMedioCoefDelTerminoKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<intentos;j++){
		   	for (int i = 0; i < nMedio; ++i) 
		   		bin.coefKDinamica(i, nMedio);
	    }
		System.out.print("Coeficiente de K Medio DIN: ");
	}
	
	@Test
	public void pruebaLargoCoefDelTerminoKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<intentos;j++){
			for (int i = 0; i < nAlto; ++i) 
			    bin.coefKDinamica(i, nAlto);
		}
		System.out.print("Coeficiente de K Largo DIN: ");
	}
	
	
	//CoeficienteDelTerminoKDinamicaTopDown
		@Test
		public void pruebaSimpleCoefDelTerminoKDinTD() {
			inicio = System.currentTimeMillis();	        
			for(int j=0;j<intentos;j++){
	        	for (int i = 0; i < nBajo; ++i) 
	        		bin.coefKDinamicaTD(i, nBajo);
	        }
			System.out.print("Coeficiente de K Simple DIN TD: ");		
		}
		
		@Test
		public void pruebaMedioCoefDelTerminoKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<intentos;j++){
			   	for (int i = 0; i < nMedio; ++i) 
			   		bin.coefKDinamicaTD(i, nMedio);
		    }
			System.out.print("Coeficiente de K Medio DIN TD: ");
		}
		
		@Test
		public void pruebaLargoCoefDelTerminoKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<intentos;j++){
				for (int i = 0; i < nAlto; ++i) 
				    bin.coefKDinamicaTD(i, nAlto);
			}
			System.out.print("Coeficiente de K Largo DIN TD: ");
		}
	
	
	@After
	public void end() {
		System.out.println((System.currentTimeMillis()-inicio) + "ms");
	}
	
}
