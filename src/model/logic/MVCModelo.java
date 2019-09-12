package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import com.opencsv.CSVReader;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class MVCModelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private CSVReader reader;
	private UBERTrip[] elementos ;
	private ArregloDinamico arreglo;

	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public MVCModelo(String ruta) throws Exception{


		try {
			reader= new CSVReader(new FileReader(ruta));
			int M=0;
			for(String[] nextLine : reader) {
				if(nextLine.toString().contains("sourceid,dstid,month,mean_travel_time,standard_deviation_travel_time,geometric_mean_travel_time,geometric_standard_deviation_travel_time"))
				{
					M++;
				}
				else
				{
					int  inicioID=Integer.parseInt(nextLine[0]);
					int destinoID=Integer.parseInt(nextLine[1]);
					int hora=Integer.parseInt(nextLine[2]);
					double tiempoPromedioEnSegundos=Double.parseDouble(nextLine[3]);
					double desviacionEstandar=Double.parseDouble(nextLine[4]);
					double tiempoPromedioGEnSegundos=Double.parseDouble(nextLine[5]);
					double desviacionEstandarG=Double.parseDouble(nextLine[6]);

					UBERTrip i = new UBERTrip(inicioID,destinoID,hora,tiempoPromedioEnSegundos,desviacionEstandar,tiempoPromedioGEnSegundos,desviacionEstandarG);
					arreglo.agregar(i);

					M++;
				}
			}
			System.out.println("Se han leído: " + M + " líneas");
			UBERTrip primero = (UBERTrip) arreglo.darElemento(0);
			UBERTrip ultimo = (UBERTrip) arreglo.darElemento(arreglo.darTamano()-1);
			System.out.println("**Información del primero** : " + primero.darInicioID() + ", " + primero.darDestinoID() + ", " + primero.darHora() + ", " + primero.darTiempoPromedioEnSegundos());
			System.out.println("**Información del último** : " + ultimo.darInicioID() + ", " + ultimo.darDestinoID() + ", " + ultimo.darHora() + ", " + ultimo.darTiempoPromedioEnSegundos());
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			if (reader != null) {
				try {
					reader.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}


	public ArregloDinamico darViajesPorHora(int hora)
	{
		ArregloDinamico cumplen = null;
		int numero = 0;
		for(int i=0 ; i<arreglo.darTamano() ; i++)
		{
			UBERTrip viaje = (UBERTrip)arreglo.darElemento(i);
			if(viaje.darHora() == hora)
			{
				cumplen.agregar(arreglo.darElemento(i));
				numero++;
			}
		}
		System.out.println("La cantidad de viajes resultantes es: " + numero);
		return cumplen;
	}

	public ArregloDinamico<String> OrdenarPorshellSort(ArregloDinamico elementos) 
	{ 
		long startTime = System.currentTimeMillis(); 
		int N=elementos.darTamano();
	    int h=1;
		for (int num = N/2; num > 0; num /= 2) 
		{ 
			for (int i = num; i < N; i += 1) 
			{ 
				UBERTrip temp = (UBERTrip)elementos.darElemento(i);
				int j;             
				for (j = i; j >= num && elementos.darElemento(j-num).compareTo(temp) >= 1; j -= num) 
				{
					elementos.sobreEscribir(elementos.darElemento(j-num), j);
				}
				elementos.sobreEscribir(temp, j);
			} 
		} 
		long endTime = System.currentTimeMillis(); 
		long duration=endTime-startTime;
		ArregloDinamico<String> respuesta=  new ArregloDinamico<String>(22);
		respuesta.agregar("El ordenamiento duró:"+duration);
		for(int i=0;i<10;i++){
			UBERTrip elemento = (UBERTrip) elementos.darElemento(i);
			respuesta.agregar(elemento.darInicioID()+","+elemento.darDestinoID()+","+elemento.darHora()+","+elemento.darTiempoPromedioEnSegundos()+","+elemento.darDesviacionEstandar()+","+elemento.darTiempoPromedioGEnSegundos()+","+elemento.darDesviacionEstandarG());
		}
		for(int i=elementos.darTamano()-1;i>10;i--){
			UBERTrip elemento = (UBERTrip) elementos.darElemento(i);
			respuesta.agregar(elemento.darInicioID()+","+elemento.darDestinoID()+","+elemento.darHora()+","+elemento.darTiempoPromedioEnSegundos()+","+elemento.darDesviacionEstandar()+","+elemento.darTiempoPromedioGEnSegundos()+","+elemento.darDesviacionEstandarG());
		}
		return respuesta;
	} 

	public void OrdenarPorMergesort(int li, int ls){
		long total = 0;
		long inicio = System.currentTimeMillis();
		int mitad;
		if (ls > li){
			mitad = (ls + li)/2;
			OrdenarPorMergesort(li, mitad);
			OrdenarPorMergesort(mitad+1, ls);
			merge(li, mitad+1, ls);
		}
		total += (System.currentTimeMillis()-inicio);
		System.out.println("El tiempo en milisegundo fue de: " + total);
		System.out.println("Los primeros viajes fueron :");
		for(int i=0 ; i<11 ; i++)
		{
			int num = i+1; 
			System.out.println(num + ": " + arreglo.darElemento(i));
		}
		System.out.println("Los últimos viajes fueron :");
		for(int i=arreglo.darTamano()-1 ; i>arreglo.darTamano()-11 ; i--)
		{
			int num = i+1; 
			System.out.println(num + ": " + arreglo.darElemento(i));
		}

	}

	private void merge(int Ires, int mitad, int Iizq){
		ArregloDinamico aux = new ArregloDinamico(arreglo.darTamano());
		int contador = 0;
		int izq = Iizq;
		int der = mitad;
		int ind = Ires;

		while ((izq <= mitad - 1) && (ind <= Ires)){
			if ( arreglo.darElemento(izq).compareTo(arreglo.darElemento(der)) <= 0)
			{
				aux.sobreEscribir(arreglo.darElemento(izq++), ind++); 
			}
			else
			{
				aux.sobreEscribir(arreglo.darElemento(der++), ind++); 
			}

		}
		while (izq <= mitad - 1)
		{
			aux.sobreEscribir(arreglo.darElemento(izq++), ind++);
		}

		while (der <= Ires)
		{
			aux.sobreEscribir(arreglo.darElemento(der++), ind++);
		}
		for (izq=Iizq; izq <= Ires; izq++)
		{
			arreglo.sobreEscribir(aux.darElemento(izq), izq);
		}
	}

	public void OrdenarPorQuickSort(int inicio, int fin)
	{
		long total = 0;
		long inicioTimer = System.currentTimeMillis();
		if(inicio>=fin) return;
		UBERTrip pivote=(UBERTrip) arreglo.darElemento(inicio);
		int elemIzq=inicio+1;
		int elemDer=fin;
		while(elemIzq<=elemDer){
			while(elemIzq<=fin && arreglo.darElemento(elemIzq).compareTo(pivote)<0){
				elemIzq++;
			}
			while(elemDer>inicio && arreglo.darElemento(elemDer).compareTo(pivote) >= 0){
				elemDer--;
			}
			if(elemIzq<elemDer){
				UBERTrip temp=(UBERTrip) arreglo.darElemento(elemIzq);
				arreglo.sobreEscribir(arreglo.darElemento(elemDer), elemIzq);
				arreglo.sobreEscribir(temp, elemDer);
			}
		}

		if(elemDer>inicio){
			UBERTrip temp=(UBERTrip) arreglo.darElemento(inicio);
			arreglo.sobreEscribir(arreglo.darElemento(elemDer), inicio);
			arreglo.sobreEscribir(temp, elemDer);
		}
		OrdenarPorQuickSort(inicio, elemDer-1);
		OrdenarPorQuickSort(elemDer+1, fin);
		total += (System.currentTimeMillis()-inicioTimer);
		System.out.println("El tiempo en milisegundo fue de: " + total);
		System.out.println("Los primeros viajes fueron :");
		for(int i=0 ; i<11 ; i++)
		{
			int num = i+1; 
			System.out.println(num + ": " + arreglo.darElemento(i));
		}
		System.out.println("Los últimos viajes fueron :");
		for(int i=arreglo.darTamano()-1 ; i>arreglo.darTamano()-11 ; i--)
		{
			int num = i+1; 
			System.out.println(num + ": " + arreglo.darElemento(i));
		}
	}

}
