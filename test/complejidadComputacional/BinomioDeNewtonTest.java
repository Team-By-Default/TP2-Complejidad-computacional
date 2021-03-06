package complejidadComputacional;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class BinomioDeNewtonTest {

	long inicio;
	BinomioDeNewton bin;
	int nBajo=1,
		nMedio=15,
		nAlto=33;
	double xBajo=10,
		   xMedio=500,
		   xAlto=1000;
	int n=30; //para los de calculo
	@Before
	public void SetUp(){
		bin=new BinomioDeNewton(2,3);
	}
	
	
	//CoeficienteDelTerminoK
	@Test
	public void pruebaSimpleCoefDelTerminoK() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<1000000;j++){
        	for (int i = 0; i < nBajo; ++i) 
        		bin.obtenerCoeficienteDelTerminoK(i, nBajo);
        }
		System.out.print("Coeficiente de K Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCoefDelTerminoK() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000000;j++){
        	for (int i = 0; i < nMedio; ++i) 
        		bin.obtenerCoeficienteDelTerminoK(i, nMedio);
        }
		System.out.print("Coeficiente de K Medio: ");
	}
	
	@Test
	public void pruebaLargoCoefDelTerminoK() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000000;j++){
        	for (int i = 0; i < nAlto; ++i) 
        		bin.obtenerCoeficienteDelTerminoK(i, nAlto);
        }
		System.out.print("Coeficiente de K Largo: ");
	}
	
	
	//CoeficienteDelTerminoKRecursiva
	@Test
	public void pruebaSimpleCoefDelTerminoKRec() {
		inicio = System.currentTimeMillis();    
		for(int j=0;j<1000000;j++){
        	for (int i = 0; i < nBajo; ++i) 
	       		bin.obtenerCoeficienteDelTerminoKRecursiva(i, nBajo);
        }
		System.out.print("Coeficiente de K Simple REC: ");		
	}
	
	@Test
	public void pruebaMedioCoefDelTerminoKRec() {
		inicio = System.currentTimeMillis();
	       for(int j=0;j<1000000;j++){
	       	for (int i = 0; i < nMedio; ++i) 
	       		bin.obtenerCoeficienteDelTerminoKRecursiva(i, nMedio);
	       }
		System.out.print("Coeficiente de K Medio REC: ");
	}
	
	@Test
	public void pruebaLargoCoefDelTerminoKRec() {
		inicio = System.currentTimeMillis();
	       for(int j=0;j<1000000;j++){
	       	for (int i = 0; i < nAlto; ++i) 
	       		bin.obtenerCoeficienteDelTerminoKRecursiva(i, nAlto);
	       }
		System.out.print("Coeficiente de K Largo REC: ");
	}
	
	
	//CoeficienteDelTerminoKDinamica
	@Test
	public void pruebaSimpleCoefDelTerminoKDin() {
		inicio = System.currentTimeMillis();	        
		for(int j=0;j<1000000;j++){
        	for (int i = 0; i < nBajo; ++i) 
        		bin.coefKDinamica(i, nBajo);
        }
		System.out.print("Coeficiente de K Simple DIN: ");		
	}
	
	@Test
	public void pruebaMedioCoefDelTerminoKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<1000000;j++){
		   	for (int i = 0; i < nMedio; ++i) 
		   		bin.coefKDinamica(i, nMedio);
	    }
		System.out.print("Coeficiente de K Medio DIN: ");
	}
	
	@Test
	public void pruebaLargoCoefDelTerminoKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<1000000;j++){
			for (int i = 0; i < nAlto; ++i) 
			    bin.coefKDinamica(i, nAlto);
		}
		System.out.print("Coeficiente de K Largo DIN: ");
	}
	
	
	//CoeficienteDelTerminoKDinamicaTopDown
		@Test
		public void pruebaSimpleCoefDelTerminoKDinTD() {
			inicio = System.currentTimeMillis();	        
			for(int j=0;j<1000000;j++){
	        	for (int i = 0; i < nBajo; ++i) 
	        		bin.coefKDinamicaTD(i, nBajo);
	        }
			System.out.print("Coeficiente de K Simple DIN TD: ");		
		}
		
		@Test
		public void pruebaMedioCoefDelTerminoKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<1000000;j++){
			   	for (int i = 0; i < nMedio; ++i) 
			   		bin.coefKDinamicaTD(i, nMedio);
		    }
			System.out.print("Coeficiente de K Medio DIN TD: ");
		}
		
		@Test
		public void pruebaLargoCoefDelTerminoKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<1000000;j++){
				for (int i = 0; i < nAlto; ++i) 
				    bin.coefKDinamicaTD(i, nAlto);
			}
			System.out.print("Coeficiente de K Largo DIN TD: ");
		}
	
	
	//CoeficientesK
		@Test
		public void pruebaSimpleCoeficientesK() {
			inicio = System.currentTimeMillis();    
			for(int j=0;j<100000;j++){
	        	for (int i = 0; i < nBajo; ++i) 
		       		bin.obtenerCoeficientesK(i);
	        }
			System.out.print("Coeficientes de K Simple: ");		
		}
		
		@Test
		public void pruebaMedioCoeficientesK() {
			inicio = System.currentTimeMillis();
		       for(int j=0;j<100000;j++){
		       	for (int i = 0; i < nMedio; ++i) 
		       		bin.obtenerCoeficientesK(i);
		       }
			System.out.print("Coeficientes de K Medio: ");
		}
		@Test
		public void pruebaLargoCoeficientesK() {
			inicio = System.currentTimeMillis();	
			for(int j=0;j<100000;j++){
		      	for (int i = 0; i < nAlto; ++i) 
		      		bin.obtenerCoeficientesK(i);
		       }
			System.out.print("Coeficientes de K Largo: ");
		}
		
	//CoeficientesKRecursiva
		@Test
			public void pruebaSimpleCoeficientesKRec() {
				inicio = System.currentTimeMillis();    
				for(int j=0;j<100000;j++){
		        	for (int i = 0; i < nBajo; ++i) 
			       		bin.obtenerCoeficientesKRecursiva(i);
		        }
				System.out.print("Coeficientes de K REC Simple: ");		
			}
			
		@Test
		public void pruebaMedioCoeficientesKRec() {
			inicio = System.currentTimeMillis();
		    for(int j=0;j<100000;j++){
		       	for (int i = 0; i < nMedio; ++i) 
		       		bin.obtenerCoeficientesKRecursiva(i);
		       }
			System.out.print("Coeficientes de K REC Medio: ");
		}
		
		@Test
		public void pruebaLargoCoeficientesKRec() {
			inicio = System.currentTimeMillis();
     	    for(int j=0;j<100000;j++){
			    for (int i = 0; i < nAlto; ++i) 
			       bin.obtenerCoeficientesKRecursiva(i);
			}
			System.out.print("Coeficientes de K REC Largo: ");
		}
		
	//CoeficientesKDinamica
	@Test
	public void pruebaSimpleCoeficientesKDin() {
		inicio = System.currentTimeMillis();    
		for(int j=0;j<100000;j++){
			for (int i = 0; i < nBajo; ++i) 
				bin.todosCoefDinamica(i);
		}
		System.out.print("Coeficientes de K DIN Simple: ");		
	}
					
	@Test
	public void pruebaMedioCoeficientesKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<100000;j++){
			for (int i = 0; i < nMedio; ++i) 
				bin.todosCoefDinamica(i);
		}
		System.out.print("Coeficientes de K DIN Medio: ");
	}
				
	@Test
	public void pruebaLargoCoeficientesKDin() {
		inicio = System.currentTimeMillis();
		for(int j=0;j<100000;j++){
			for (int i = 0; i < nAlto; ++i) 
				bin.todosCoefDinamica(i);
		}
		System.out.print("Coeficientes de K DIN Largo: ");
	}
	
	//CoeficientesKDinamicaTopDown
		@Test
		public void pruebaSimpleCoeficientesKDinTD() {
			inicio = System.currentTimeMillis();    
			for(int j=0;j<100000;j++){
				for (int i = 0; i < nBajo; ++i) 
					bin.todosCoefDinamicaTD(i);
			}
			System.out.print("Coeficientes de K DIN TD Simple: ");		
		}
						
		@Test
		public void pruebaMedioCoeficientesKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<100000;j++){
				for (int i = 0; i < nMedio; ++i) 
					bin.todosCoefDinamicaTD(i);
			}
			System.out.print("Coeficientes de K DIN TD Medio: ");
		}
					
		@Test
		public void pruebaLargoCoeficientesKDinTD() {
			inicio = System.currentTimeMillis();
			for(int j=0;j<100000;j++){
				for (int i = 0; i < nAlto; ++i) 
					bin.todosCoefDinamicaTD(i);
			}
			System.out.print("Coeficientes de K DIN TD Largo: ");
		}
	
	
	//Calculo Binomio Simple
	@Test
	public void pruebaSimpleCalculo() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<1000;j++){
        	for (int i = 0; i < xBajo; ++i) 
        		bin.calculoBinomioSimple(n, i);
        }
		System.out.print("Calculo por Binomio con x Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCalculo() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xMedio; ++i) 
        		bin.calculoBinomioSimple(n, i);
        }
		System.out.print("Calculo por Binomio con x Medio: ");
	}
	
	@Test
	public void pruebaLargoCalculo() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xAlto; ++i) 
        		bin.calculoBinomioSimple(n,i);
        }
		System.out.print("Calculo por Binomio con x Largo: ");
	}
	
	//Calculo por Polinomio Simple
	@Test
	public void pruebaSimpleCalculoPoli() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<1000;j++){
        	for (int i = 0; i < xBajo; ++i) 
        		bin.calculoPorPolinomioSimple(n, i);
        }
		System.out.print("Calculo por Polinomio con x Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCalculoPoli() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xMedio; ++i) 
        		bin.calculoPorPolinomioSimple(n, i);
        }
		System.out.print("Calculo por Polinomio con x Medio: ");
	}
	
	@Test
	public void pruebaLargoCalculoPoli() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xAlto; ++i) 
        		bin.calculoPorPolinomioSimple(n,i);
        }
		System.out.print("Calculo por Polinomio con x Largo: ");
	}
	
	//Calculo por Polinomio Recursiva
	@Test
	public void pruebaSimpleCalculoPoliRec() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<1000;j++){
        	for (int i = 0; i < xBajo; ++i) 
        		bin.calculoPorPolinomioRecursiva(n, i);
        }
		System.out.print("Calculo por Polinomio REC con x Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCalculoPoliRec() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xMedio; ++i) 
        		bin.calculoPorPolinomioRecursiva(n, i);
        }
		System.out.print("Calculo por Polinomio REC con x Medio: ");
	}
	
	@Test
	public void pruebaLargoCalculoPoliRec() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xAlto; ++i) 
        		bin.calculoPorPolinomioRecursiva(n,i);
        }
		System.out.print("Calculo por Polinomio REC con x Largo: ");
	}
	
	//Calculo por Polinomio Dinamica
	@Test
	public void pruebaSimpleCalculoPoliDin() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<1000;j++){
        	for (int i = 0; i < xBajo; ++i) 
        		bin.calculoPorPolinomioDinamica(n, i);
        }
		System.out.print("Calculo por Polinomio DIN con x Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCalculoPoliDin() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xMedio; ++i) 
        		bin.calculoPorPolinomioDinamica(n, i);
        }
		System.out.print("Calculo por Polinomio DIN con x Medio: ");
	}
	
	@Test
	public void pruebaLargoCalculoPoliDin() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xAlto; ++i) 
        		bin.calculoPorPolinomioDinamica(n,i);
        }
		System.out.print("Calculo por Polinomio DIN con x Largo: ");
	}
	
	//Calculo por Polinomio Dinamica Top Down
	@Test
	public void pruebaSimpleCalculoPoliDinTD() {
		inicio = System.currentTimeMillis();
        
		for(int j=0;j<1000;j++){
        	for (int i = 0; i < xBajo; ++i) 
        		bin.calculoPorPolinomioDinamicaTD(n, i);
        }
		System.out.print("Calculo por Polinomio DIN TD con x Simple: ");
		
	}
	
	@Test
	public void pruebaMedioCalculoPoliDinTD() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xMedio; ++i) 
        		bin.calculoPorPolinomioDinamicaTD(n, i);
        }
		System.out.print("Calculo por Polinomio DIN TD con x Medio: ");
	}
	
	@Test
	public void pruebaLargoCalculoPoliDinTD() {
		inicio = System.currentTimeMillis();
        for(int j=0;j<1000;j++){
        	for (int i = 0; i < xAlto; ++i) 
        		bin.calculoPorPolinomioDinamicaTD(n,i);
        }
		System.out.print("Calculo por Polinomio DIN TD con x Largo: ");
	}
	
	@After
	public void end() {
		System.out.println((System.currentTimeMillis()-inicio) + "ms");
	}
	
}
