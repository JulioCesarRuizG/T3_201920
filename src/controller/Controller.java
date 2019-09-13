package controller;

import java.util.Scanner;

import model.data_structures.ArregloDinamico;
import model.logic.MVCModelo;
import view.MVCView;

public class Controller {

	/* Instancia del Modelo*/
	private MVCModelo modelo;
	
	/* Instancia de la Vista*/
	private MVCView view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 * @throws Exception 
	 */
	public Controller () throws Exception
	{
		view = new MVCView();
		modelo = new MVCModelo(".data/bogota-cadastral-2018-2-All-HourlyAggregate.csv");
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int valor = 0;
			int option = lector.nextInt();
			switch(option){
				case 1:
					System.out.println("--------- \nHora de viajes a buscar ");
					dato = lector.next();
					valor = Integer.parseInt(dato);
					modelo.darViajesPorHora(valor);				
					break;

				case 2:
					System.out.println("--------- \nEl resultado de ordenar ascendentemente por ShellSort fue: ");	
					ArregloDinamico<String> datos = modelo.OrdenarPorshellSort(modelo.darViajesPorHora(valor));
					for(int i=0 ; i<datos.darTamano()-1 ; i++)
					{
						System.out.println(datos.darElemento(i));
					}
					break;

				case 3:
					System.out.println("--------- \nEl resultado de ordenar ascendentemente por MergeSort fue: ");	
					ArregloDinamico<String> datos2 = modelo.OrdenarPorMergesort(modelo.darViajesPorHora(valor));
					for(int i=0 ; i<datos2.darTamano()-1 ; i++)
					{
						System.out.println(datos2.darElemento(i));
					}
					break;

				case 4: 
					System.out.println("--------- \nEl resultado de ordenar ascendentemente por QuickSort fue: ");	
					ArregloDinamico<String> datos3 = modelo.OrdenarPorMergesort(modelo.darViajesPorHora(valor));
					for(int i=0 ; i<datos3.darTamano()-1 ; i++)
					{
						System.out.println(datos3.darElemento(i));
					}					
					break;	
					
				case 5: 
					System.out.println("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;	

				default: 
					System.out.println("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
