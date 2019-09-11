package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
			UBERTrip ultimo = (UBERTrip) arreglo.darElemento(M-1);
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

	public int OrdenarPorshellSort(UBERTrip elementos, int n) 
	{ 
		for (int num = n/2; num > 0; num /= 2) 
		{ 
			for (int i = num; i < n; i += 1) 
			{ 
				UBERTrip temp = (UBERTrip)arreglo.darElemento(i);
				int j;             
				for (j = i; j >= num && arreglo.darElemento(j-num).compareTo(temp) >= 1; j -= num) 
				{
					arreglo.sobreEscribir(arreglo.darElemento(j-num), j);
				}
				arreglo.sobreEscribir(temp, j);
			} 
		} 
		return 0; 
	} 
}
