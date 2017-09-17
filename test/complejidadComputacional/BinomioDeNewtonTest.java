package complejidadComputacional;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

public class BinomioDeNewtonTest {

	
	int intentos=10000;
	long inicio;
	BinomioDeNewton bin;
	int nBajo=1,
		nMedio=15,
		nAlto=33;
	
	@Before
	public void SetUp(){
		bin=new BinomioDeNewton(2,3);
	}
	
	/*
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
	*/
	
	//CoeficientesK
		@Test
		public void pruebaSimpleCoeficientesK() {
			inicio = System.currentTimeMillis();    
			for(int j=0;j<intentos;j++){
	        	for (int i = 0; i < nBajo; ++i) 
		       		bin.obtenerCoeficientesK(i);
	        }
			System.out.print("Coeficientes de K Simple: ");		
		}
		
		@Test
		public void pruebaMedioCoeficientesK() {
			inicio = System.currentTimeMillis();
		       for(int j=0;j<intentos;j++){
		       	for (int i = 0; i < nMedio; ++i) 
		       		bin.obtenerCoeficientesK(i);
		       }
			System.out.print("Coeficientes de K Medio: ");
		}
		@Test
		public void pruebaLargoCoeficientesK() {
			inicio = System.currentTimeMillis();	
			for(int j=0;j<intentos;j++){
		      	for (int i = 0; i < nAlto; ++i) 
		      		bin.obtenerCoeficientesK(i);
		       }
			System.out.print("Coeficientes de K Largo: ");
		}
		
	//CoeficientesKRecursiva
		@Test
			public void pruebaSimpleCoeficientesKRec() {
				inicio = System.currentTimeMillis();    
				for(int j=0;j<intentos;j++){
		        	for (int i = 0; i < nBajo; ++i) 
			       		bin.obtenerCoeficientesKRecursiva(i);
		        }
				System.out.print("Coeficientes de K REC Simple: ");		
			}
			
		@Test
		public void pruebaMedioCoeficientesKRec() {
			inicio = System.currentTimeMillis();
		    for(int j=0;j<intentos;j++){
		       	for (int i = 0; i < nMedio; ++i) 
		       		bin.obtenerCoeficientesKRecursiva(i);
		       }
			System.out.print("Coeficientes de K REC Medio: ");
		}
		
		@Test
		public void pruebaLargoCoeficientesKRec() {
			inicio = System.currentTimeMillis();
     	    for(int j=0;j<intentos;j++){
			    for (int i = 0; i < nAlto; ++i) 
			       bin.obtenerCoeficientesKRecursiva(i);
			}
			System.out.print("Coeficientes de K REC Largo: ");
		}
		
	//CoeficientesKDinamica
	@Test
	public void pruebaSimpleCoeficientesKDin() {
		inicio = System.currentTimeMillis();    
		for(int j=0;j<intentos;j++){
			for (int i = 0; i < nBajo; ++i) 
				bin.todosCoefDinamica(i);
		}
		System.out.print("Coeficientes de K DIN Simple: ");		
	}
					
	@Test
	public void pruebaMedioCoeficientesKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<intentos;j++){
			for (int i = 0; i < nMedio; ++i) 
				bin.todosCoefDinamica(i);
		}
		System.out.print("Coeficientes de K DIN Medio: ");
	}
				
	@Test
	public void pruebaLargoCoeficientesKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<intentos;j++){
			for (int i = 0; i < nAlto; ++i) 
				bin.todosCoefDinamica(i);
		}
		System.out.print("Coeficientes de K DIN Largo: ");
	}
	
	//CoeficientesKDinamicaTopDown
		@Test
		public void pruebaSimpleCoeficientesKDinTD() {
			inicio = System.currentTimeMillis();    
			for(int j=0;j<intentos;j++){
				for (int i = 0; i < nBajo; ++i) 
					bin.todosCoefDinamicaTD(i);
			}
			System.out.print("Coeficientes de K DIN TD Simple: ");		
		}
						
		@Test
		public void pruebaMedioCoeficientesKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<intentos;j++){
				for (int i = 0; i < nMedio; ++i) 
					bin.todosCoefDinamicaTD(i);
			}
			System.out.print("Coeficientes de K DIN TD Medio: ");
		}
					
		@Test
		public void pruebaLargoCoeficientesKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<intentos;j++){
				for (int i = 0; i < nAlto; ++i) 
					bin.todosCoefDinamicaTD(i);
			}
			System.out.print("Coeficientes de K DIN TD Largo: ");
		}
		
	@After
	public void end() {
		System.out.println((System.currentTimeMillis()-inicio) + "ms");
	}
	
}
