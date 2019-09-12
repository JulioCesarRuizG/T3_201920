package test.logic;

import static org.junit.Assert.*;

import model.data_structures.ArregloDinamico;
import model.logic.MVCModelo;
import model.logic.UBERTrip;

import org.junit.Before;
import org.junit.Test;

public class TestMVCModelo {
	
	private MVCModelo modelo;
    private ArregloDinamico datos;
	
	@Before
	public void setUp1() {
	
		datos=new ArregloDinamico(20);
		datos.agregar(new UBERTrip(11,20,5,400000,80000,45,23));
		datos.agregar(new UBERTrip(3,80,5,300000,80,10,50));
		datos.agregar(new UBERTrip(5,20,5,200000,1000,50,10));
		datos.agregar(new UBERTrip(8,30,5,200000,500,770,40));
		datos.agregar(new UBERTrip(40,7,5,100000,100,20,30));
		datos.agregar(new UBERTrip(30,80,5,50000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,50000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,40000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,30000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,20000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,10000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,9000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,8000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,7000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,6000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,5000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,4000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,3000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,2000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,1000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,900,100,30,50));
	}

	public void setUp2() {
		
		datos=new ArregloDinamico(20);
		
		datos.agregar(new UBERTrip(30,80,5,900,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,1000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,2000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,3000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,4000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,5000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,6000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,7000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,8000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,9000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,10000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,20000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,30000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,40000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,50000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,50000,200,40,660));
		datos.agregar(new UBERTrip(40,7,5,100000,100,20,30));
		datos.agregar(new UBERTrip(8,30,5,200000,500,770,40));
		datos.agregar(new UBERTrip(5,20,5,200000,1000,50,10));
		datos.agregar(new UBERTrip(3,80,5,300000,80,10,50));
		datos.agregar(new UBERTrip(11,20,5,400000,80000,45,23));
	}
	public void setUp3() {
		
		datos=new ArregloDinamico(20);
		datos.agregar(new UBERTrip(11,20,5,400000,80000,45,23));
		datos.agregar(new UBERTrip(3,80,5,300000,80,10,50));
		datos.agregar(new UBERTrip(5,20,5,200000,1000,50,10));
		datos.agregar(new UBERTrip(8,30,5,200000,500,770,40));
		datos.agregar(new UBERTrip(40,7,5,100000,100,20,30));
		datos.agregar(new UBERTrip(30,80,5,50000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,50000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,40000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,30000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,20000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,10000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,9000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,8000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,7000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,6000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,5000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,4000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,3000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,2000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,1000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,900,100,30,50));
		ArregloDinamico aux= new ArregloDinamico(datos.darTamano());
	     while(datos.darTamano()>0){
	    	 int x= (int)Math.random()*(datos.darTamano());
	    	 aux.agregar(datos.darElemento(x));
	    	 datos.eliminar(datos.darElemento(x));
	     }
	     datos=aux;
	}

	@Test
	public void testShellsortOrganized() {
	  setUp1();
	  ArregloDinamico<String> proceso=modelo.OrdenarPorshellSort(datos);
	  assertEquals("El algoritmo no agregó correctamente los datos",0,proceso.darElemento(21).compareTo("30,80,5,900,100,30,50"));
	  assertEquals("El algoritmo no agregó correctamente los datos",0,proceso.darElemento(1).compareTo("11,20,5,400000,80000,45,23"));
	  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
	}
	public void testShellsortReversed() {
		  setUp2();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorshellSort(datos);
		  assertEquals("El algoritmo no agregó correctamente los datos",0,proceso.darElemento(21).compareTo("30,80,5,900,100,30,50"));
		  assertEquals("El algoritmo no agregó correctamente los datos",0,proceso.darElemento(1).compareTo("11,20,5,400000,80000,45,23"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}
	public void testShellsortRandom() {
		  setUp2();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorshellSort(datos);
		  assertEquals("El algoritmo no agregó correctamente los datos",0,proceso.darElemento(21).compareTo("30,80,5,900,100,30,50"));
		  assertEquals("El algoritmo no agregó correctamente los datos",0,proceso.darElemento(1).compareTo("11,20,5,400000,80000,45,23"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}



}
