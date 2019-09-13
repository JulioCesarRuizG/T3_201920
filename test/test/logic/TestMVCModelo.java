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
	    try {
			modelo=new MVCModelo(".data/pruebas 20 ordenadas ascendentes.csv");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    datos=new ArregloDinamico(21);
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

	public void setUp2() {
		 try {
				modelo=new MVCModelo(".data/pruebas 20 ordenadas ascendentes.csv");
			} catch (Exception e) {
				e.printStackTrace();
			}
		datos=new ArregloDinamico(21);
		
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
	public void setUp3() {
		 try {
				modelo=new MVCModelo(".data/pruebas 20 ordenadas ascendentes.csv");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		datos=new ArregloDinamico(21);
		datos.agregar(new UBERTrip(11,20,5,400000,80000,45,23));
		datos.agregar(new UBERTrip(30,80,5,3000,200,40,660));
		
		datos.agregar(new UBERTrip(8,30,5,200000,500,770,40));
		datos.agregar(new UBERTrip(40,7,5,100000,100,20,30));
	
		datos.agregar(new UBERTrip(30,80,5,50000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,40000,200,40,660));
		datos.agregar(new UBERTrip(3,80,5,300000,80,10,50));
		datos.agregar(new UBERTrip(5,20,5,200000,1000,50,10));
		datos.agregar(new UBERTrip(30,80,5,30000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,20000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,10000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,900,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,9000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,8000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,7000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,6000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,5000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,4000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,50000,200,40,660));
		datos.agregar(new UBERTrip(30,80,5,2000,100,30,50));
		datos.agregar(new UBERTrip(30,80,5,1000,200,40,660));
	
	
	}
	@Test
	public void testShellsortOrganized() {
		  setUp1();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorshellSort(datos);
		  
		  assertEquals("El algoritmo no agreg� correctamente los datos",true,proceso.darElemento(1).equals("30,80,5,900.0,100.0,30.0,50.0"));
		  assertEquals("El algoritmo no agreg� correctamente los datos",true,proceso.darElemento(11).equals("11,20,5,400000.0,80000.0,45.0,23.0"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}
	@Test
	public void testMergesortOrganized() {
		  setUp1();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorMergesort(datos);
		  assertEquals("El algoritmo no agreg� correctamente los datos",true,proceso.darElemento(1).equals("30,80,5,900,100,30,50"));
		  assertEquals("El algoritmo no agreg� correctamente los datos",true,proceso.darElemento(21).equals("11,20,5,400000,80000,45,23"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}
		@Test
		public void testMergesortReversed() {
			  setUp2();
			  ArregloDinamico<String> proceso=modelo.OrdenarPorMergesort(datos);
			  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(1).compareTo("30,80,5,900.0,100.0,30.0,50.0"));
			  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(11).compareTo("11,20,5,400000.0,80000.0,45.0,23.0"));
			  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
			}
		@Test
		public void testMergesortDisorganized() {
			  setUp3();
			  ArregloDinamico<String> proceso=modelo.OrdenarPorMergesort(datos);
			  System.out.println(proceso.darElemento(20));
			  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(1).compareTo("30,80,5,900.0,100.0,30.0,50.0"));
			  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(11).compareTo("11,20,5,400000.0,80000.0,45.0,23.0"));
			  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
			}


	
	@Test
	public void testShellsortReversed() {
		  setUp2();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorshellSort(datos);
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(1).compareTo("30,80,5,900.0,100.0,30.0,50.0"));
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(11).compareTo("11,20,5,400000.0,80000.0,45.0,23.0"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}
	@Test
	public void testShellsortDisorganized() {
		  setUp3();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorshellSort(datos);
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(1).compareTo("30,80,5,900.0,100.0,30.0,50.0"));
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(11).compareTo("11,20,5,400000.0,80000.0,45.0,23.0"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}

	@Test
	public void testQuicksortReversed() {
		  setUp2();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorQuickSort(datos,0,datos.darTamano()-1);
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(1).compareTo("30,80,5,900.0,100.0,30.0,50.0"));
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(11).compareTo("11,20,5,400000.0,80000.0,45.0,23.0"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}
	@Test
	public void testQuicksortDisorganized() {
		  setUp3();
		  ArregloDinamico<String> proceso=modelo.OrdenarPorQuickSort(datos,0,datos.darTamano()-1);
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(1).compareTo("30,80,5,900.0,100.0,30.0,50.0"));
		  assertEquals("El algoritmo no agreg� correctamente los datos",0,proceso.darElemento(11).compareTo("11,20,5,400000.0,80000.0,45.0,23.0"));
		  System.out.print("Para el ShellSort en el caso organizado,"+proceso.darElemento(0));
		}


}
